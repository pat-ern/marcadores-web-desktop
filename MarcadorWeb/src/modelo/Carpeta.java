/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patricio
 */
public class Carpeta {
    
    // coleccion
    private List<Marcador> carpetaMarcadores;
    
    private int idCarpeta; 
    private String nombreCarpeta;
    private String descCarpeta;
    private Usuario usuario;
    private int idUsuario;
    
    
    public Carpeta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Carpeta(String nombreCarpeta, String descCarpeta, Usuario usuario) {
        this.carpetaMarcadores = new ArrayList<>();
        this.nombreCarpeta = nombreCarpeta;
        this.descCarpeta = descCarpeta;
        this.usuario = usuario;
    }

    public Carpeta(int idCarpeta, String nombreCarpeta, String descCarpeta, Usuario usuario) {
        this.idCarpeta=idCarpeta;
        this.nombreCarpeta = nombreCarpeta;
        this.descCarpeta = descCarpeta;
        this.usuario = usuario;
    }

    // getters y setters

    public int getIdCarpeta() {
        return idCarpeta;
    }

    public void setIdCarpeta(int idCarpeta) {
        this.idCarpeta = idCarpeta;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public String getDescCarpeta() {
        return descCarpeta;
    }

    public void setDescCarpeta(String descCarpeta) {
        this.descCarpeta = descCarpeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
    // metodos genericos
    
    
    
    
    // metodos

    // agregar un elemento a coleccion
    public boolean agregarMarcador(Marcador marc) {
        return carpetaMarcadores.add(marc);
    }

    //buscar elemento en la carpeta por nombre
    public boolean buscarMarcador(String nombre) {
        for (Marcador tmp : carpetaMarcadores) {
            if (tmp.getNombreMarcador().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    // eliminar un marcador
    public boolean eliminarElemento(int id) {
        for (Marcador tmp : carpetaMarcadores) {
            if (tmp.getIdMarcador()== id) {
                return carpetaMarcadores.remove(tmp);
            }
        }
        return false;
    }

    // mostrar marcadores de carpeta
    public void mostrarElementos() {
        for (Marcador tmp : carpetaMarcadores) {
            System.out.println(tmp.toString());
        }
    }
}
