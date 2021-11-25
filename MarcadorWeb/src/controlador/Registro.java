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
import modelo.Carpeta;
import modelo.Marcador;
import modelo.Usuario;

/**
 *
 * @author USRVI-LC3
 */
public class Registro {

    // METODOS DE USUARIO
    public Usuario agregarConsultarUsuario(Usuario usr) {

        Usuario usuario = new Usuario();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO usuario(nombreUsuario, clave, correo) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usr.getNombreUsuario());
            stmt.setString(2, usr.getClave());
            stmt.setString(3, usr.getCorreo());

            stmt.executeUpdate();//insert
            stmt.close();

            usuario = this.consultarUsuario(usr);
            return usuario;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar usuario" + e.getMessage());
            return usuario;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario" + e.getMessage());
            return usuario;
        }
    }

    public boolean agregarUsuario(Usuario usr) {

        Usuario usuario = new Usuario();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO usuario(nombreUsuario, clave, correo) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usr.getNombreUsuario());
            stmt.setString(2, usr.getClave());
            stmt.setString(3, usr.getCorreo());

            stmt.executeUpdate();//insert
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar usuario" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario" + e.getMessage());
            return false;
        }
    }

    public Usuario consultarUsuario(Usuario usr) {

        List<Usuario> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo FROM usuario WHERE correo = '" + usr.getCorreo() + "' order by idUsuario";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Usuario usr1 = new Usuario();
                usr1.setIdUsuario(rs.getInt("idUsuario"));
                usr1.setNombreUsuario(rs.getString("nombreUsuario"));
                usr1.setClave(rs.getString("clave"));
                usr1.setCorreo(rs.getString("correo"));

                lista.add(usr1);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al listar usuario" + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al listar usuario" + e.getMessage());
            return lista.get(0);
        }
    }

    public Usuario activarSesionUsuario(String correo) {

        List<Usuario> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo FROM usuario WHERE correo = '" + correo + "' order by idUsuario";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Usuario usr1 = new Usuario();
                usr1.setIdUsuario(rs.getInt("idUsuario"));
                usr1.setNombreUsuario(rs.getString("nombreUsuario"));
                usr1.setClave(rs.getString("clave"));
                usr1.setCorreo(rs.getString("correo"));

                lista.add(usr1);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al listar usuario" + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al listar usuario" + e.getMessage());
            return lista.get(0);
        }
    }

    public boolean validarUsuarioExiste(String correo) {

        List<Usuario> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo FROM usuario WHERE correo = '" + correo + "' order by idUsuario";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            if (rs.next()) {
                Usuario usr = new Usuario();
                usr.setIdUsuario(rs.getInt("idUsuario"));
                usr.setNombreUsuario(rs.getString("nombreUsuario"));
                usr.setClave(rs.getString("clave"));
                usr.setCorreo(rs.getString("correo"));

                lista.add(usr);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al obtener usuario por correo" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al obtener usuario por correo" + e.getMessage());
        }

        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // METODOS MARCADORES
    public boolean agregarMarcador(Marcador marc) {
        Date fecha1, fecha2;

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO marcador(nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, marc.getNombreMarcador());
            stmt.setString(2, marc.getUrl());

            fecha1 = marc.getFechaCreacion();
            stmt.setDate(3, new java.sql.Date(fecha1.getTime()));
            fecha2 = marc.getFechaUltimoUso();
            stmt.setDate(4, new java.sql.Date(fecha2.getTime()));

            stmt.setString(5, marc.getDescMarcador());

            stmt.setInt(6, marc.getUsuario().getIdUsuario());

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar marcador" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar marcador" + e.getMessage());
            return false;
        }
    }

    public List<Marcador> listarTodosLosMarcPorUsuario(Usuario usr) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario FROM marcador WHERE usuario = '" + usr.getIdUsuario() + "' order by idMarcador";
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

    public List<Marcador> listarMarcadoresDeCarpeta(Carpeta car) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario, carpeta FROM marcador WHERE carpeta = '" + car.getIdCarpeta() + "' order by idMarcador";
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
            System.out.println("Error SQL al listar marcadores pot carpeta" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores pot carpeta" + e.getMessage());
        }
        return lista;
    }
    
    public List<Marcador> listarMarcadoresSinCarpeta(Usuario usr) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario FROM marcador WHERE carpeta = NULL AND usuario = '"+usr.getIdUsuario()+"' order by idMarcador";
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
            System.out.println("Error SQL al listar marcadores pot carpeta" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores pot carpeta" + e.getMessage());
        }
        return lista;
    }
    
    
    public boolean validarMarcadorExiste(Marcador marcador) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, usuario FROM marcador WHERE idMarcador = '" + marcador.getIdMarcador()+ "' order by idMarcador";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            if (rs.next()) {
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
            System.out.println("Error SQL al validar si marcador existe" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al validar si marcador existe" + e.getMessage());
        }

        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean editarMarcador(Marcador marcador) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE marcador SET nombreMarcador = '"+marcador.getNombreMarcador()+"', url = '"+marcador.getUrl()+"', descMarcador = '"+marcador.getDescMarcador()+"' WHERE idMarcador = '"+marcador.getIdMarcador()+"'";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.execute(); //update
            stmt.close();
            cnx.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al editar marcador " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al editar marcador " + e.getMessage());
            return false;
        }
    }
    
    
}
