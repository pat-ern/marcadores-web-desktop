/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Registro;
import java.util.Date;

/**
 *
 * @author patricio
 */
public class Modelo {

    public static void main(String args[]) {

        Registro rg = new Registro();

        Usuario usr1 = new Usuario("Noemi Gonzalez", "12323asd98ad*@#$!dij", "noemi@gmail.com");

//        if (rg.validarUsuarioExiste(usr1.getCorreo())){
//            rg.agregarUsuario(usr1);
//            System.out.println("Se ha agregado el usuario");
//        }else{
//            System.out.println("Este usuario ya existe");

//        Marcador marc1 = new Marcador("paginas para estudiar", "google.com", new Date(), new Date(), "prueba final", rg.consultarUsuario(usr1));

//        if (rg.validarMarcadorExiste(marc1)){
//            rg.agregarMarcador(marc1);
//            System.out.println("Se ha agregado el marcador");
//        }else{
//            System.out.println("Este marcador ya existe"); 
//        }
//        }

        Marcador marc2 = new Marcador (27, "canciones verano", "youtube223dfas.com/dfjoven-comun2341asd12312dasd", "temas piolas pa estudiar");
        
        rg.editarMarcador(marc2);


        
    }
}
