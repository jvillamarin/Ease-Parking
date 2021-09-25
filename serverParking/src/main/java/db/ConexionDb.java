/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author johnv
 */
public class ConexionDb {

    private String DB_driver;
    private String url;
    private String db;
    private String host;
    private String username;
    private String password;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ArrayList<String> columnas;

    public ConexionDb() {
        DB_driver = "com.mysql.jdbc.Driver";
        db = "ease_parking";
        host = "localhost:3306";
        username = "root";
        password = "root";
        url = "jdbc:mysql://" + host + "/" + db;
        columnas = new ArrayList<>();

        try {
            Class.forName(DB_driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(8);
            System.out.println("BD connectada");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConnection() {
        try {
            con.setAutoCommit(true);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean commitDB() {
        try {
            con.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean rollbackDB() {
        try {
            con.rollback();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ResultSet consultar(String nombreTabla) {
        String query = "SELECT * FROM " + nombreTabla;
        try {

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<String> getColunm(String nombreTabla) {
        String query = "SELECT COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS where TABLE_SCHEMA = '" + db + "' AND TABLE_NAME = '" + nombreTabla + "' order by ORDINAL_POSITION'";

        try {

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                if (!rs.getString("COLUMN_NAME").equals("id" + nombreTabla)) {
                    columnas.add(rs.getString("COLUMN_NAME"));
                }
            }

            return columnas;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet consultarXID(String nombreTabla, int id) {
        String query = "SELECT * FROM " + nombreTabla + " WHERE id" + nombreTabla + " = " + id;
        try {

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet consultarWhere(String nombreTabla, String condiciones) {
        String query = "SELECT * FROM " + nombreTabla + " WHERE " + condiciones;
        try {

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int insertar(String nombreTabla, String[] valores) {
        StringBuilder query = new StringBuilder("INSERT INTO ");
        query.append(nombreTabla);
        query.append("(");
        ArrayList<String> columnas = getColunm(nombreTabla);
        for (int i = 0; i < columnas.size(); i++) {
            query.append(columnas.get(i));
            if (i != columnas.size() - 1) {
                query.append(", ");
            }
        }
        query.append(") VALUES (");
        for (int i = 0; i < valores.length; i++) {
            query.append("'");
            query.append(valores[i]);
            query.append("'");
            if (i != valores.length - 1) {
                query.append(", ");
            }
        }
        query.append(")");
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query.toString());
            return rs.getInt("id" + nombreTabla);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean actualizar(String nombreTabla, String[] valores, int id) {
        ArrayList<String> columnas = getColunm(nombreTabla);
        StringBuilder query = new StringBuilder("UPDATE ");
        query.append(nombreTabla);
        query.append(" SET ");
        for (int i = 0; i < valores.length; i++) {
            query.append(columnas.get(i));
            query.append(" = ");
            query.append("'");
            query.append(valores[i]);
            query.append("'");
            if (i != valores.length - 1) {
                query.append(", ");
            }
        }
        query.append("WHERE id");
        query.append(nombreTabla);
        query.append(id);
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return stmt.execute(query.toString());

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminar(String nombreTabla, int id) {
        StringBuilder query = new StringBuilder("DELETE FROM ");
        query.append(nombreTabla);
        query.append("WHERE id");
        query.append(nombreTabla);
        query.append(" = ");
        query.append(id);
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return stmt.execute(query.toString());

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
