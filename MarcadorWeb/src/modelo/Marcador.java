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
    
    private String nombreMarcador;
    private String url;
    private int idMarcador;
    private Date fechaCreacion;
    private Date fechaUltimoUso;
    //private iconoMarcador

    public Marcador() {
    }

    public Marcador(String nombreMarcador, String url, int idMarcador, Date fechaCreacion, Date fechaUltimoUso) {
        this.nombreMarcador = nombreMarcador;
        this.url = url;
        this.idMarcador = idMarcador;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoUso = fechaUltimoUso;
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

    public int getIdMarcador() {
        return idMarcador;
    }

    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
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

    @Override
    public String toString() {
        return "Marcador{" + "nombreMarcador=" + nombreMarcador + ", url=" + url + ", idMarcador=" + idMarcador + ", fechaCreacion=" + fechaCreacion + ", fechaUltimoUso=" + fechaUltimoUso + '}';
    }
    
    
    
}
