/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author patricio
 */
public class Marcador {
    
    private int idMarcador;
    private String nombreMarcador;
    private String url;
    private Date fechaCreacion;
    private Date fechaUltimoUso;
    private String descMarcador;
    private Usuario usuario;

    public Marcador() {
    }

    // const sin FECHAS NI USUARIO

    public Marcador(int idMarcador, String nombreMarcador, String url, String descMarcador) {
        this.idMarcador = idMarcador;
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.descMarcador = descMarcador;
    }


    
    // const sin ID
    public Marcador(String nombreMarcador, String url, Date fechaCreacion, Date fechaUltimoUso, String descMarcador, Usuario usuario) {
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoUso = fechaUltimoUso;
        this.descMarcador = descMarcador;
        this.usuario = usuario;
    }
    
    // const con ID

    public Marcador(int idMarcador, String nombreMarcador, String url, Date fechaCreacion, Date fechaUltimoUso, String descMarcador, Usuario usuario) {
        this.idMarcador = idMarcador;
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoUso = fechaUltimoUso;
        this.descMarcador = descMarcador;
        this.usuario = usuario;
    }
    
   // setters getters

    public int getIdMarcador() {
        return idMarcador;
    }

    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
    }

    public String getNombreMarcador() {
        return nombreMarcador;
    }

    public void setNombreMarcador(String nombreMarcador) {
        this.nombreMarcador = nombreMarcador;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimoUso() {
        return fechaUltimoUso;
    }

    public void setFechaUltimoUso(Date fechaUltimoUso) {
        this.fechaUltimoUso = fechaUltimoUso;
    }

    public String getDescMarcador() {
        return descMarcador;
    }

    public void setDescMarcador(String descMarcador) {
        this.descMarcador = descMarcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Marcador{" + "idMarcador=" + idMarcador + ", nombreMarcador=" + nombreMarcador + ", url=" + url + ", fechaCreacion=" + fechaCreacion + ", fechaUltimoUso=" + fechaUltimoUso + ", descMarcador=" + descMarcador + ", usuario=" + usuario + '}';
    }
    
}
