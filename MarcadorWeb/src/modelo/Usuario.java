/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author patricio
 */
public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String clave;
    private String correo;
    private boolean genero;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String clave, String correo, boolean genero) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.correo = correo;
        this.genero = genero;
    }
    
    public Usuario(String nombreUsuario, String clave, String correo, boolean genero) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.correo = correo;
        this.genero = genero;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", clave=" + clave + ", correo=" + correo + ", genero=" + genero + '}';
    }

    
}
