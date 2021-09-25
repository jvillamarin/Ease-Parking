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
public class TOVehiculo extends TOplazas{
    private int idVehiculos;
    private String placa;
    private String tipoVehiculo;
    private int idPlazasVehiculo;
    private Date horaEntrada;
    private Date horaSalida;

    public TOVehiculo() {
    }

    public TOVehiculo(String placa, String tipoVehiculo, int idPlazasVehiculo, Date horaEntrada, String tipoPlaza, String codigoPlaza) {
        super(tipoPlaza, codigoPlaza);
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.idPlazasVehiculo = idPlazasVehiculo;
        this.horaEntrada = horaEntrada;
    }

    public TOVehiculo(String placa, String tipoVehiculo, int idPlazasVehiculo, Date horaEntrada, Date horaSalida, String tipoPlaza, String codigoPlaza, boolean libre) {
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
