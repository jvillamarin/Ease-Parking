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
public class TOplazas {
    private int idPlazas;
    private String tipoPlaza;
    private String codigoPlaza;
    private int libre;

    public TOplazas() {
    }

    public TOplazas(String tipoPlaza, String codigoPlaza) {
        this.tipoPlaza = tipoPlaza;
        this.codigoPlaza = codigoPlaza;
    }

    public TOplazas(String tipoPlaza, String codigoPlaza, int libre) {
        this.tipoPlaza = tipoPlaza;
        this.codigoPlaza = codigoPlaza;
        this.libre = libre;
    }

    public int getIdPlazas() {
        return idPlazas;
    }

    public void setIdPlazas(int idPlazas) {
        this.idPlazas = idPlazas;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public String getCodigoPlaza() {
        return codigoPlaza;
    }

    public void setCodigoPlaza(String codigoPlaza) {
        this.codigoPlaza = codigoPlaza;
    }

    public int getLibre() {
        return libre;
    }

    public void setLibre(int libre) {
        this.libre = libre;
    }   
    
}
