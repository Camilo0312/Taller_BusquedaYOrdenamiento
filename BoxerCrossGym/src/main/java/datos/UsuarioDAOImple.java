/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class UsuarioDAOImple implements UsuarioDAO {

    public static final String SQL_CONSULTA = "SELECT * FROM usuario";
    public static final String SQL_INSERT = "INSERT INTO usuario(id, nombre, telefono, direccion, id_pagos) VALUES (?,?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM usuario WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE usuario SET nombre = ?, telefono = ?, direccion = ?  WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM usuario WHERE id = ?";

    @Override
    public int create(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, usuario.getId());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getTelefono());
            ps.setString(4, usuario.getDireccion());
            ps.setInt(5, usuario.getIdPagos());
            
            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;

    }

    @Override
    public List<Usuario> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Usuario> usuarios = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String telefono = res.getString("telefono");
                String direccion = res.getString("direccion");
                int idPagos = res.getInt("id_pagos");
                Usuario usuario = new Usuario(id, nombre, telefono, direccion, idPagos);
                usuarios.add(usuario);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(res);
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    @Override
    public Usuario selectId(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Usuario registroUsuario = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, usuario.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            String nombre = res.getString("nombre");
            String telefono = res.getString("telefono");
            String direccion = res.getString("direccion");
            int idPagos = res.getInt("id_pagos");
            registroUsuario = new Usuario(id, nombre, telefono, direccion, idPagos);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(res);
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registroUsuario;

    }

    @Override
    public int update(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
             ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getTelefono());
            ps.setString(3, usuario.getDireccion());
            ps.setInt(4, usuario.getId());
            
            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    @Override
    public int delete(model.Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, usuario.getId());
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
