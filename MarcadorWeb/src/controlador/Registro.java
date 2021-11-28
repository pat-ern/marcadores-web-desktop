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

            String query = "INSERT INTO usuario(nombreUsuario, clave, correo, genero) VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usr.getNombreUsuario());
            stmt.setString(2, usr.getClave());
            stmt.setString(3, usr.getCorreo());
            stmt.setBoolean(4, usr.isGenero());

            stmt.executeUpdate();//insert
            stmt.close();

            usuario = this.consultarUsuario(usr);
            return usuario;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar usuario " + e.getMessage());
            return usuario;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario " + e.getMessage());
            return usuario;
        }
    }

    public boolean agregarUsuario(Usuario usr) {

        Usuario usuario = new Usuario();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO usuario(nombreUsuario, clave, correo, genero) VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usr.getNombreUsuario());
            stmt.setString(2, usr.getClave());
            stmt.setString(3, usr.getCorreo());
            stmt.setBoolean(4, usr.isGenero());

            stmt.executeUpdate();//insert
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar usuario " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario " + e.getMessage());
            return false;
        }
    }

    public Usuario consultarUsuario(Usuario usr) {

        List<Usuario> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo, genero FROM usuario WHERE correo = '" + usr.getCorreo() + "' order by idUsuario";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Usuario usr1 = new Usuario();
                usr1.setIdUsuario(rs.getInt("idUsuario"));
                usr1.setNombreUsuario(rs.getString("nombreUsuario"));
                usr1.setClave(rs.getString("clave"));
                usr1.setCorreo(rs.getString("correo"));
                usr1.setGenero(rs.getBoolean("genero"));

                lista.add(usr1);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar usuario " + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al consultar usuario " + e.getMessage());
            return lista.get(0);
        }
    }

    public Usuario activarSesionUsuario(String correo) {

        List<Usuario> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo, genero FROM usuario WHERE correo = '" + correo + "' order by idUsuario";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Usuario usr = new Usuario();
                usr.setIdUsuario(rs.getInt("idUsuario"));
                usr.setNombreUsuario(rs.getString("nombreUsuario"));
                usr.setClave(rs.getString("clave"));
                usr.setCorreo(rs.getString("correo"));
                usr.setGenero(rs.getBoolean("genero"));

                lista.add(usr);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al listar usuario " + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al listar usuario " + e.getMessage());
            return lista.get(0);
        }
    }

    public boolean validarUsuarioExiste(String correo) {

        List<Usuario> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo, genero FROM usuario WHERE correo = '" + correo + "' order by idUsuario";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            if (rs.next()) {
                Usuario usr = new Usuario();
                usr.setIdUsuario(rs.getInt("idUsuario"));
                usr.setNombreUsuario(rs.getString("nombreUsuario"));
                usr.setClave(rs.getString("clave"));
                usr.setCorreo(rs.getString("correo"));
                usr.setGenero(rs.getBoolean("genero"));

                lista.add(usr);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al validar si usuario existe " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al validar si usuario existe " + e.getMessage());
        }

        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // METODOS MARCADORES
    public boolean agregarMarcador(Marcador mrc, int car) { // METODO CAMBIADO
        Date fecha1, fecha2;

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO marcador(nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador, usuario, carpeta) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, mrc.getNombreMarcador());
            stmt.setString(2, mrc.getUrl());

            fecha1 = mrc.getFechaCreacion();
            stmt.setDate(3, new java.sql.Date(fecha1.getTime()));
            fecha2 = mrc.getFechaUltimoUso();
            stmt.setDate(4, new java.sql.Date(fecha2.getTime()));

            stmt.setString(5, mrc.getDescMarcador());
            stmt.setString(6, mrc.getColorMarcador());

            stmt.setInt(7, mrc.getUsuario().getIdUsuario());
            stmt.setInt(8, car);

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar marcador " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar marcador " + e.getMessage());
            return false;
        }
    }

    public List<Marcador> listarMarcadoresDeCarpeta(int idCarpeta) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador FROM marcador WHERE carpeta = '" + idCarpeta + "' order by idMarcador";
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
                marc.setColorMarcador(rs.getString("colorMarcador"));

                lista.add(marc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar marcadores de carpeta " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores de carpeta " + e.getMessage());
        }
        return lista;
    }

    public List<Marcador> listarMarcadoresSinCarpeta(Usuario usr) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador, usuario FROM marcador WHERE carpeta IS NULL AND usuario = '" + usr.getIdUsuario() + "' order by idMarcador";
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
                marc.setColorMarcador(rs.getString("colorMarcador"));

                lista.add(marc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar marcadores sin carpeta " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores sin carpeta " + e.getMessage());
        }
        return lista;
    }

    public Marcador consultarMarcador(String url) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador FROM marcador WHERE url = '" + url + "'";
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
                marc.setColorMarcador(rs.getString("colorMarcador"));
                lista.add(marc);
            }

            rs.close();
            stmt.close();
            cnx.close();
            return lista.get(0);

        } catch (SQLException e) {
            System.out.println("Error SQL al consultar" + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al consultar" + e.getMessage());
            return lista.get(0);
        }
    }

    public boolean validarMarcadorExiste(Marcador mrc) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador FROM marcador WHERE url = '" + mrc.getUrl() + "'";
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
                marc.setColorMarcador(rs.getString("colorMarcador"));
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

    public boolean editarMarcador(int idMarcador, String nombreMarcador, String url, String descMarcador, String colorMarcador) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE marcador SET nombreMarcador = '" + nombreMarcador + "', url = '" + url + "', descMarcador = '" + descMarcador + "', colorMarcador = '" + colorMarcador + "' WHERE idMarcador = '" + idMarcador + "'";
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

    public boolean moverMarcadorACarpeta(Marcador mrc, int carpeta) { // METODO CAMBIADO

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE marcador SET carpeta = '" + carpeta + "' WHERE idMarcador = '" + mrc.getIdMarcador() + "'";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.execute(); //update
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al mover marcador a carpeta " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al mover marcador a carpeta " + e.getMessage());
            return false;
        }
    }

    public boolean borrarMarcador(Marcador mrc) {

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "DELETE FROM marcador WHERE idMarcador = '" + mrc.getIdMarcador() + "'";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.execute(); //update
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al borrar marcador " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al borrar marcador " + e.getMessage());
            return false;
        }
    }

    public boolean agregarCarpeta(Carpeta car) {

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO carpeta(nombreCarpeta, descCarpeta, usuario) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, car.getNombreCarpeta());
            stmt.setString(2, car.getDescCarpeta());
            stmt.setInt(3, car.getUsuario().getIdUsuario());

            stmt.executeUpdate();//insert
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar carpeta " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar carpeta " + e.getMessage());
            return false;
        }
    }

    public boolean borrarCarpeta(Carpeta car) {

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "DELETE FROM carpeta WHERE idCarpeta = '" + car.getIdCarpeta() + "'";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al borrar carpeta " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al borrar carpeta " + e.getMessage());
            return false;
        }
    }

    public boolean editarCarpeta(int idCarpeta, String nombreCarpeta, String descCarpeta) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE carpeta SET nombreCarpeta = '" + nombreCarpeta + "', descCarpeta = '" + descCarpeta + "' WHERE idCarpeta = '" + idCarpeta + "'";
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

    public List<Marcador> listarLosMarcPorOrdenAlfabetico(Usuario usr) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador FROM marcador WHERE usuario = '" + usr.getIdUsuario() + "' order by nombreMarcador";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Marcador mrc = new Marcador();
                mrc.setIdMarcador(rs.getInt("idMarcador"));
                mrc.setNombreMarcador(rs.getString("nombreMarcador"));
                mrc.setUrl(rs.getString("url"));
                mrc.setFechaCreacion(rs.getDate("fechaCreacion"));
                mrc.setFechaUltimoUso(rs.getDate("fechaUltimoUso"));
                mrc.setDescMarcador(rs.getString("descMarcador"));
                mrc.setColorMarcador(rs.getString("colorMarcador"));

                lista.add(mrc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar marcadores " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores " + e.getMessage());
        }
        return lista;
    }

    public boolean actualizarFechaUso(Marcador mrc) {

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE marcador SET fechaUltimoUso = '" + new Date() + "'WHERE idMarcador = '" + mrc.getIdMarcador() + "'";
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

    public Usuario consultarUsuarioPorId(int idUsuario) {

        List<Usuario> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idUsuario, nombreUsuario, clave, correo, genero FROM usuario WHERE idUsuario = '" + idUsuario + "' order by idUsuario";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Usuario usr1 = new Usuario();
                usr1.setIdUsuario(rs.getInt("idUsuario"));
                usr1.setNombreUsuario(rs.getString("nombreUsuario"));
                usr1.setClave(rs.getString("clave"));
                usr1.setCorreo(rs.getString("correo"));
                usr1.setGenero(rs.getBoolean("genero"));

                lista.add(usr1);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar usuario " + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al consultar usuario " + e.getMessage());
            return lista.get(0);
        }
    }

    public List<Marcador> listarTodosLosMarcPorUsuario(Usuario usr) {

        Registro rg = new Registro();

        List<Marcador> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idMarcador, nombreMarcador, url, fechaCreacion, fechaUltimoUso, descMarcador, colorMarcador, usuario, carpeta FROM marcador WHERE usuario = '" + usr.getIdUsuario() + "' order by idMarcador";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Marcador mrc = new Marcador();
                mrc.setIdMarcador(rs.getInt("idMarcador"));
                mrc.setNombreMarcador(rs.getString("nombreMarcador"));
                mrc.setUrl(rs.getString("url"));
                mrc.setFechaCreacion(rs.getDate("fechaCreacion"));
                mrc.setFechaUltimoUso(rs.getDate("fechaUltimoUso"));
                mrc.setDescMarcador(rs.getString("descMarcador"));
                mrc.setColorMarcador(rs.getString("colorMarcador"));
                mrc.setUsuario(this.consultarUsuarioPorId(rs.getInt("usuario")));
                mrc.setCarpeta(this.consultarCarpeta(rs.getInt("carpeta")));

                lista.add(mrc);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar marcadores " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar marcadores " + e.getMessage());
        }
        return lista;
    }

    public Carpeta consultarCarpeta(int car) {

        List<Carpeta> lista = new ArrayList<>();
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT idCarpeta, nombreCarpeta, descCarpeta FROM carpeta WHERE idCarpeta = '" + car + "'";
            PreparedStatement stmt2 = cnx.prepareStatement(query);

            ResultSet rs = stmt2.executeQuery(); //select
            if (rs.next()) {
                Carpeta car1 = new Carpeta();
                car1.setIdCarpeta(rs.getInt("idCarpeta"));
                car1.setNombreCarpeta(rs.getString("nombreCarpeta"));
                car1.setDescCarpeta(rs.getString("descCarpeta"));

                lista.add(car1);
            }
            rs.close();
            stmt2.close();
            cnx.close();
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar carpeta " + e.getMessage());
            return lista.get(0);
        } catch (Exception e) {
            System.out.println("Error al consultar carpeta " + e.getMessage());
            return lista.get(0);
        }
    }
}
