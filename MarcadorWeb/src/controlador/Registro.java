/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Marcador;
import modelo.Usuario;

/**
 *
 * @author USRVI-LC3
 */
public class Registro {

    // metodos registro usuarios
    
    //agregar usuarios
    public boolean agregarUsuario(Usuario usr) {
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO usuario(idUsuario, nombreUsuario, clave, correo, descUsuario) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, usr.getIdUsuario());
            stmt.setString(2, usr.getNombreUsuario());
            stmt.setString(3, usr.getClave());
            stmt.setString(4, usr.getCorreo());
            stmt.setString(5, usr.getDescUsuario());

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar usuario" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario" + e.getMessage());
            return false;
        }
    }

    //validar que el usuario no exista
    public List<Usuario> buscarUsuariosPorId(String idUsuario) {

        List<Usuario> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo, descUsuario FROM usuario WHERE idUsuario = ? order by idUsuario";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idUsuario);

            ResultSet rs = stmt.executeQuery(); //select

            if (rs.next()) {
                Usuario usr = new Usuario();
                usr.setIdUsuario(rs.getInt("idUsuario"));
                usr.setNombreUsuario(rs.getString("nombreUsuario"));
                usr.setClave(rs.getString("clave"));
                usr.setCorreo(rs.getString("correo"));
                usr.setDescUsuario("descUsuario");

                lista.add(usr);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al obtener usuario por idUsuario" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al obtener usuario por idUsuario" + e.getMessage());
        }
        return lista;
    }
    
    // metodos registro marcadores
    
    //agregar
    public boolean agregarMarcador(Marcador marc) {
        Date fecha1, fecha2;
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO marcador(idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, marc.getIdMarcador());
            stmt.setString(2, marc.getNombreMarcador());
            stmt.setString(3, marc.getUrl());
            fecha1 = marc.getFechaCreacion();
            stmt.setDate(4, new java.sql.Date(fecha1.getTime()));
            fecha2 = marc.getFechaUltimoUso();
            stmt.setDate(5, new java.sql.Date(fecha2.getTime()));
            stmt.setString(6, marc.getDescMarcador());

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar vehículo" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar vehículo" + e.getMessage());
            return false;
        }
    }

    //listar todos los marcadores
    public List<Marcador> listarTotalMarcadores() {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador FROM marcador order by idMarcador";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Marcador marc = new Marcador();
                marc.setIdMarcador(rs.getInt("idMarcador"));
                marc.setNombreMarcador(rs.getString("nombreMarcador"));
                marc.setUrl(rs.getString("url"));
                marc.setFechaCreacion(rs.getDate("fechaCreacion"));
                marc.setFechaUltimoUso(rs.getDate("fechaUltimoUso"));
                marc.setDescMarcador(rs.getString("descMarcador"));

                lista.add(marc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar marcadores" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores" + e.getMessage());
        }
        return lista;
    }

    //listar con filtro
    public List<Marcador> listarMarcPorUsuario(int idUsuario) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario FROM marcador WHERE usuario = "+idUsuario+" order by patente";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Marcador marc = new Marcador();
                marc.setIdMarcador(rs.getInt("idMarcador"));
                marc.setNombreMarcador(rs.getString("nombreMarcador"));
                marc.setUrl(rs.getString("url"));
                marc.setFechaCreacion(rs.getDate("fechaCreacion"));
                marc.setFechaUltimoUso(rs.getDate("fechaUltimoUso"));
                marc.setDescMarcador(rs.getString("descMarcador"));

                lista.add(marc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar vehículos" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar vehículos" + e.getMessage());
        }
        return lista;
    }

    //validar que el vehículo no exista
//    public List<Vehiculo> buscarPatenteVehiculos(String patente) {
//
//        List<Vehiculo> lista = new ArrayList<>();
//
//        try {
//            ConeccionBD conexion1 = new ConeccionBD();
//            Connection cnx = conexion1.obtenerConexion();
//
//            String query = "SELECT patente, acno, km, marca, trasmision, revisionDia, fechaUltimaRev FROM vehiculo WHERE patente = ? order by patente";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setString(1, patente);
//
//            ResultSet rs = stmt.executeQuery(); //select
//
//            if (rs.next()) {
//                Vehiculo auto = new Vehiculo();
//                auto.setPatente(rs.getString("patente"));
//                auto.setAcno(rs.getInt("acno"));
//                auto.setKm(rs.getInt("km"));
//                auto.setMarca(rs.getString("marca"));
//                auto.setTrasmision(rs.getString("trasmision"));
//                auto.setRevisionDia(rs.getBoolean("revisionDia"));
//                auto.setFechaUltimaRev(rs.getDate("fechaUltimaRev"));
//
//                lista.add(auto);
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//        } catch (SQLException e) {
//            System.out.println("Error SQL al obtener vehículo por patente" + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Error al obtener vehículo por patente" + e.getMessage());
//        }
//        return lista;
//    }
}

    

