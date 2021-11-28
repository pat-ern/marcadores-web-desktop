/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USRVI-LC3
 */
public class ConexionBD {
    
    public Connection obtenerConexion() {
        Connection cnx = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/marcadorweb", "root", "root");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión" + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cnx;
    }
    
    
}
