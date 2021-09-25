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
public class TOoperarios {
  private int idOperarios;
  private String username;
  private String password;
  private String nombre ;
  private String apellido;
  private String email;
  private String tipo_identificacion ;
  private String identificacion;
  private String telefono;

    public TOoperarios() {
    }

    public TOoperarios(String username, String password, String nombre, String tipo_identificacion, String identificacion) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
    }

    public TOoperarios(String username, String password, String nombre, String apellido, String email, String tipo_identificacion, String identificacion, String telefono) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public int getIdOperarios() {
        return idOperarios;
    }

    public void setIdOperarios(int idOperarios) {
        this.idOperarios = idOperarios;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
  
}
