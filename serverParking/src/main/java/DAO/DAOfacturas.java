/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOfacturas;
import db.ConexionDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnv
 */
public class DAOfacturas {
    private ConexionDb con;
    private String nombreTabla = "facturas";
    private String nombreVista = "vistaFacturas";
    
    public DAOfacturas() {
      con = new ConexionDb();  
    }
    
    
    public ArrayList<TOfacturas> consultarFacturas(){
        TOfacturas factura;
        ArrayList<TOfacturas> faturas = new ArrayList<>();
        
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()){
                factura = new TOfacturas();
                factura.setIdOperarios(rs.getInt("idOperarios"));
                factura.setUsername("username");
                factura.setPassword(rs.getString("password"));                
                factura.setNombre(rs.getString("nombre"));
                factura.setApellido(rs.getString("apellido"));
                factura.setEmail(rs.getString("email"));
                factura.setTipo_identificacion(rs.getString("tipo_identificacion"));
                factura.setIdentificacion(rs.getString("identificacion"));
                factura.setTelefono(rs.getString("telefono"));
                factura.setIdFacturas(rs.getInt("idFacturas"));
                factura.setIdVehiculosFacturas(rs.getInt("idVehiculosFacturas"));
                factura.setValorTotal(rs.getDouble("valorTotal"));
                factura.setIdOperarios(rs.getInt("idOperarios"));
                factura.setHoraEntrada(rs.getDate("horaEntrada"));
                factura.setHoraSalida(rs.getDate("horaSalida")); 
               
                faturas.add(factura);
            }
            return faturas;
        } catch (SQLException ex) {
            System.out.println("Error en DAOoperarios.consultarFacturas: " + ex.getMessage());
            return null;
        }
    }
    public int insertarFacturas(TOfacturas factura){
        String[] valores = {String.valueOf(factura.getIdVehiculosFacturas()), String.valueOf(factura.getValorTotal()),
            String.valueOf(factura.getIdOperariosFacturas())};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Facturas: " + ex.getMessage());
            return 0;
        }
    }
    public boolean modificarFacturas(TOfacturas factura){
        String[] valores = {String.valueOf(factura.getIdVehiculosFacturas()), String.valueOf(factura.getValorTotal()),
            String.valueOf(factura.getIdOperariosFacturas())};
        try {
            return con.actualizar(nombreTabla, valores, factura.getIdOperarios());
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Operarios: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarFacturas(int id){        
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.println("Error en DAOuoperarios.insertar Facturas: " + ex.getMessage());
            return false;
        }
    }
}
