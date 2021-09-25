/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

import java.sql.Date;

/**
 *
 * @author johnv
 */
public class TOfacturas extends TOoperarios{
  private int idFacturas;
  private int idVehiculosFacturas;
  private double valorTotal;
  private int idOperariosFacturas;
  private Date horaEntrada;
  private Date horaSalida;
  
  TOVehiculo vehiculo = new TOVehiculo();
  

    public TOfacturas() {
    }

    public TOfacturas(int idOperarios, String username, String password, String nombre, String tipo_identificacion, String identificacion) {
        super(username, password, nombre, tipo_identificacion, identificacion);
        this.idOperariosFacturas = idOperarios;
    }   

    public TOfacturas(int idVehiculosFacturas, double valorTotal, int idOperarios, Date horaEntrada, Date horaSalida, String username, String password, String nombre, String apellido, String email, String tipo_identificacion, String identificacion, String telefono) {
        super(username, password, nombre, apellido, email, tipo_identificacion, identificacion, telefono);
        this.idVehiculosFacturas = idVehiculosFacturas;
        this.valorTotal = valorTotal;
        this.idOperariosFacturas = idOperarios;
        vehiculo.setHoraEntrada(horaEntrada);
    }
    

    public int getIdFacturas() {
        return idFacturas;
    }

    public void setIdFacturas(int idFacturas) {
        this.idFacturas = idFacturas;
    }

    public int getIdVehiculosFacturas() {
        return idVehiculosFacturas;
    }

    public void setIdVehiculosFacturas(int idVehiculosFacturas) {
        this.idVehiculosFacturas = idVehiculosFacturas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdOperariosFacturas() {
        return idOperariosFacturas;
    }

    public void setIdOperariosFacturas(int idOperarios) {
        this.idOperariosFacturas = idOperarios;
    } 

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
  
}

//public class TOfacturas extends TOoperarios{
//  private int idFacturas;
//  private int idVehiculosFacturas;
//  private double valorTotal;
//  private int idOperarios;
//  private Date horaEntrada;
//  private Date horaSalida;
//
//    public TOfacturas() {
//    }
//
//    public TOfacturas(int idOperarios, String username, String password, String nombre, String tipo_identificacion, String identificacion) {
//        super(username, password, nombre, tipo_identificacion, identificacion);
//        this.idOperarios = idOperarios;
//    }   
//    
//
//    public int getIdFacturas() {
//        return idFacturas;
//    }
//
//    public void setIdFacturas(int idFacturas) {
//        this.idFacturas = idFacturas;
//    }
//
//    public int getIdVehiculosFacturas() {
//        return idVehiculosFacturas;
//    }
//
//    public void setIdVehiculosFacturas(int idVehiculosFacturas) {
//        this.idVehiculosFacturas = idVehiculosFacturas;
//    }
//
//    public double getValorTotal() {
//        return valorTotal;
//    }
//
//    public void setValorTotal(double valorTotal) {
//        this.valorTotal = valorTotal;
//    }
//
//    public int getIdOperarios() {
//        return idOperarios;
//    }
//
//    public void setIdOperarios(int idOperarios) {
//        this.idOperarios = idOperarios;
//    } 
//
//    public Date getHoraEntrada() {
//        return horaEntrada;
//    }
//
//    public void setHoraEntrada(Date horaEntrada) {
//        this.horaEntrada = horaEntrada;
//    }
//
//    public Date getHoraSalida() {
//        return horaSalida;
//    }
//
//    public void setHoraSalida(Date horaSalida) {
//        this.horaSalida = horaSalida;
//    }
//  
//}
