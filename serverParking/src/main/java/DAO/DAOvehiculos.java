/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOvehiculos;
import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnv
 */
public class DAOvehiculos {
    private ConexionDb con;
    private String nombreTabla = "Vehiculos";
    
    public DAOvehiculos() {
      con = new ConexionDb();  
    }
    
    
    public ArrayList<TOvehiculos> consultarVehiculos(){
        TOvehiculos vehiculo;
        ArrayList<TOvehiculos> vehiculos = new ArrayList<>();
        
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()){
                vehiculo = new TOvehiculos();
                vehiculo.setIdVehiculos(rs.getInt("idVehiculos"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setTipoVehiculo(rs.getString("tipoVehiculo"));                
                vehiculo.setIdPlazasVehiculo(rs.getInt("idPlazasVehiculo"));
                vehiculo.setHoraEntrada(rs.getString("horaEntrada"));
                vehiculo.setHoraSalida(rs.getString("horaSalida"));               
               
                vehiculos.add(vehiculo);
            }
            return vehiculos;
        } catch (SQLException ex) {
            System.out.println("Error en DAvehiculos.consultarVehiculos: " + ex.getMessage());
            return null;
        }
    }
    public int insertarVehiculos(TOvehiculos vehiculo){
        
        try {
            String[] valores = {vehiculo.getPlaca(),vehiculo.getTipoVehiculo(),
            String.valueOf(vehiculo.getIdPlazasVehiculo()), String.valueOf(vehiculo.getHoraEntrada()), String.valueOf(vehiculo.getHoraSalida())
            };
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOuvehiculos.insertar Vehiculos: " + ex.getMessage());
            return 0;
        }
    }
    public boolean modificarVehiculos(TOvehiculos vehiculo){
       String[] valores = {vehiculo.getPlaca(),vehiculo.getTipoVehiculo(),
            String.valueOf(vehiculo.getIdPlazasVehiculo()), String.valueOf(vehiculo.getHoraEntrada()), String.valueOf(vehiculo.getHoraSalida())
       };
        try {
            return con.actualizar(nombreTabla, valores, vehiculo.getIdVehiculos());
        } catch (Exception ex) {
            System.out.println("Error en DAOuvehiculos.insertar Vehiculos: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarVehiculos(int id){        
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOuvehiculos.insertar Vehiculos: " + ex.getMessage());
            return false;
        }
    }
    public TOvehiculos verificarUsuario(String vehiculo, String password){
        TOvehiculos vehiculoTo = new TOvehiculos();     
        
        try {
            ResultSet rs = con.consultarWhere(nombreTabla, " username = '" + vehiculo + "' AND password = '" + password + "'");
            while (rs.next()){
                
                vehiculoTo.setIdVehiculos(rs.getInt("idVehiculos"));
                vehiculoTo.setPlaca(rs.getString("placa"));
                vehiculoTo.setTipoVehiculo(rs.getString("tipoVehiculo"));                
                vehiculoTo.setIdPlazasVehiculo(rs.getInt("idPlazasVehiculo"));
                vehiculoTo.setHoraEntrada(rs.getString("horaEntrada"));
                vehiculoTo.setHoraSalida(rs.getString("horaSalida")); 
                
            }
            return vehiculoTo;
        } catch (SQLException ex) {
            System.out.println("Error en DAvehiculos.verificarUsuario: " + ex.getMessage());
            return null;
        }
    }
}
