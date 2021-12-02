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
    private String colorMarcador;
    private Usuario usuario;
    private Carpeta carpeta;

    public Marcador() {
    }

    // const sin ID / SIN CARPETA
    public Marcador(String nombreMarcador, String url, Date fechaCreacion, Date fechaUltimoUso, String descMarcador, String colorMarcador, Usuario usuario) {
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoUso = fechaUltimoUso;
        this.descMarcador = descMarcador;
        this.colorMarcador = colorMarcador;
        this.usuario = usuario;
    }
    
    // const sin ID / CON CARPETA
    public Marcador(String nombreMarcador, String url, Date fechaCreacion, Date fechaUltimoUso, String descMarcador, String colorMarcador, Usuario usuario, Carpeta carpeta) {
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoUso = fechaUltimoUso;
        this.descMarcador = descMarcador;
        this.colorMarcador = colorMarcador;
        this.usuario = usuario;
        this.carpeta = carpeta;
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

    public String getColorMarcador() {
        return colorMarcador;
    }

    public void setColorMarcador(String colorMarcador) {
        this.colorMarcador = colorMarcador;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carpeta getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(Carpeta carpeta) {
        this.carpeta = carpeta;
    }

    @Override
    public String toString() {
        return "Marcador{" + "idMarcador=" + idMarcador + ", nombreMarcador=" + nombreMarcador + ", url=" + url + ", fechaCreacion=" + fechaCreacion + ", fechaUltimoUso=" + fechaUltimoUso + ", descMarcador=" + descMarcador + ", colorMarcador=" + colorMarcador + ", usuario=" + usuario + ", carpeta=" + carpeta + '}';
    }

    
    
    
}
