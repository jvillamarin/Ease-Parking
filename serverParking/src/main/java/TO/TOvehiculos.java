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
public class TOvehiculos extends TOplazas{
    private int idVehiculos;
    private String placa;
    private String tipoVehiculo;
    private int idPlazasVehiculo;
    private String horaEntrada;
    private String horaSalida;

    public TOvehiculos() {
//        this.horaEntrada = new SimpleStringFormat("yyyy-MM-dd").format(horaEntrada);
    }

    public TOvehiculos(String placa, String tipoVehiculo, int idPlazasVehiculo, String horaEntrada, String tipoPlaza, String codigoPlaza) {
        super(tipoPlaza, codigoPlaza);
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.idPlazasVehiculo = idPlazasVehiculo;
        this.horaEntrada = horaEntrada;
    }

    public TOvehiculos(String placa, String tipoVehiculo, int idPlazasVehiculo, String horaEntrada, String horaSalida, String tipoPlaza, String codigoPlaza, int libre) {
        super(tipoPlaza, codigoPlaza, libre);
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.idPlazasVehiculo = idPlazasVehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getIdPlazasVehiculo() {
        return idPlazasVehiculo;
    }

    public void setIdPlazasVehiculo(int idPlazasVehiculo) {
        this.idPlazasVehiculo = idPlazasVehiculo;
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
    
    
}
