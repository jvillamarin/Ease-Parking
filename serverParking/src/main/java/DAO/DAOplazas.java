/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOplazas;
import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnv
 */
public class DAOplazas {

    private ConexionDb con;
    private String nombreTabla = "Plazas";

    public DAOplazas() {
        con = new ConexionDb();
    }

    public ArrayList<TOplazas> consultarPlazas() {
        TOplazas plaza;
        ArrayList<TOplazas> plazas = new ArrayList<>();

        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()) {
                plaza = new TOplazas();
                plaza.setIdPlazas(rs.getInt("idPlazas"));
                plaza.setTipoPlaza(rs.getString("tipoPlaza"));
                plaza.setLibre(rs.getInt("libre"));
                plaza.setCodigoPlaza(rs.getString("codigoPlaza"));

                plazas.add(plaza);
            }
            return plazas;
        } catch (SQLException ex) {
            System.out.println("Error en DAplazas.consultarPlazas: " + ex.getMessage());
            return null;
        }
    }

    public int insertarPlazas(TOplazas plaza) {

        try {
            String[] valores = {plaza.getTipoPlaza(), plaza.getCodigoPlaza(),
                String.valueOf(plaza.getLibre())
            };
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOuplazas.insertar Plazas: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarPlazas(TOplazas plaza) {

        try {
            String[] valores = {plaza.getTipoPlaza(), plaza.getCodigoPlaza(),
                String.valueOf(plaza.getLibre())
            };
            return con.actualizar(nombreTabla, valores, plaza.getIdPlazas());
        } catch (Exception ex) {
            System.out.println("Error en DAOuplazas.insertar Plazas: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarPlazas(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOuplazas.insertar Plazas: " + ex.getMessage());
            return false;
        }
    }

    public TOplazas verificarUsuario(String plaza, String password) {
        TOplazas plazaTo = new TOplazas();

        try {
            ResultSet rs = con.consultarWhere(nombreTabla, " username = '" + plaza + "' AND password = '" + password + "'");
            while (rs.next()) {
               
                plazaTo.setIdPlazas(rs.getInt("idPlazas"));
                plazaTo.setTipoPlaza(rs.getString("tipoPlaza"));
                plazaTo.setLibre(rs.getInt("libre"));
                plazaTo.setCodigoPlaza(rs.getString("codigoPlaza"));
            }
            return plazaTo;
        } catch (SQLException ex) {
            System.out.println("Error en DAplazas.verificarUsuario: " + ex.getMessage());
            return null;
        }
    }
}
