/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author johnv
 */
public class TOfacturas extends TOoperarios{
  private int idFacturas;
  private int idVehiculosFacturas;
  private double valorTotal;
  private int idOperariosFacturas;
  private String horaEntrada;
  private String horaSalida;
  private String tipoVehiculo;
  private String placa;
  private int idPlazasVehiculo;
  
   
  
    public TOfacturas() {
    }

    public TOfacturas(int idOperariosFacturas, String username, String password, String nombre, String tipo_identificacion, String identificacion) {
        super(username, password, nombre, tipo_identificacion, identificacion);
        this.idOperariosFacturas = idOperariosFacturas;
    }      

    public TOfacturas(int idVehiculosFacturas, double valorTotal, int idOperariosFacturas, String horaEntrada, String horaSalida, String tipoVehiculo, String placa, int idPlazasVehiculo, String username, String password, String nombre, String apellido, String email, String tipo_identificacion, String identificacion, String telefono) {
        super(username, password, nombre, apellido, email, tipo_identificacion, identificacion, telefono);
        this.idVehiculosFacturas = idVehiculosFacturas;
        this.valorTotal = valorTotal;
        this.idOperariosFacturas = idOperariosFacturas;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.idPlazasVehiculo = idPlazasVehiculo;
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

    public void setIdOperariosFacturas(int idOperariosFacturas) {
        this.idOperariosFacturas = idOperariosFacturas;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdPlazasVehiculo() {
        return idPlazasVehiculo;
    }

    public void setIdPlazasVehiculo(int idPlazasVehiculo) {
        this.idPlazasVehiculo = idPlazasVehiculo;
    }  
}


