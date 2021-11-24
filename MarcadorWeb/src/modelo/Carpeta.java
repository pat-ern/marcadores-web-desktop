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
    private String nombreCarpeta;
    private int idCarpeta; 
    private String descCarpeta;

    // constructor
    public Carpeta(String nombreCarpeta, int idCarpeta, String descCarpeta) {
        carpetaMarcadores = new ArrayList<>();
        this.nombreCarpeta=nombreCarpeta;
        this.idCarpeta=idCarpeta;
        this.descCarpeta=descCarpeta;
    }
    
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
