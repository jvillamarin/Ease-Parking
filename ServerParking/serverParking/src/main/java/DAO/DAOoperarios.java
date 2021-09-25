/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOoperarios;
import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnv
 */
public class DAOoperarios {
    private ConexionDb con;
    private String nombreTabla = "operarios";
    
    public DAOoperarios() {
      con = new ConexionDb();  
    }
    
    
    public ArrayList<TOoperarios> consultarOperarios(){
        TOoperarios operario;
        ArrayList<TOoperarios> operarios = new ArrayList<>();
        
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()){
                operario = new TOoperarios();
                operario.setIdOperarios(rs.getInt("idOperarios"));
                operario.setUsername(rs.getString("username"));
                operario.setPassword(rs.getString("password"));                
                operario.setNombre(rs.getString("nombre"));
                operario.setApellido(rs.getString("apellido"));
                operario.setEmail(rs.getString("email"));
                operario.setTipo_identificacion(rs.getString("tipo_identificacion"));
                operario.setIdentificacion(rs.getString("identificacion"));
                operario.setTelefono(rs.getString("telefono"));
               
                operarios.add(operario);
            }
            return operarios;
        } catch (SQLException ex) {
            System.out.println("Error en DAoperarios.consultarOperarios: " + ex.getMessage());
            return null;
        }
    }
    public int insertarOperarios(TOoperarios operario){
        String[] valores = {operario.getUsername(),operario.getPassword(),
            operario.getNombre(),operario.getApellido(), operario.getEmail(),
            operario.getTipo_identificacion(), operario.getIdentificacion(), operario.getTelefono()};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Operarios: " + ex.getMessage());
            return 0;
        }
    }
    public boolean modificarOperarios(TOoperarios operario){
        String[] valores = {operario.getUsername(),operario.getPassword(),
            operario.getNombre(),operario.getApellido(), operario.getEmail(),
            operario.getTipo_identificacion(), operario.getIdentificacion(), operario.getTelefono()};
        try {
            return con.actualizar(nombreTabla, valores, operario.getIdOperarios());
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Operarios: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarOperarios(int id){        
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Operarios: " + ex.getMessage());
            return false;
        }
    }
}
