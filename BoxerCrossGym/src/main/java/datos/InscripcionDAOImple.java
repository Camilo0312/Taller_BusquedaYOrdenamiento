/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Inscripcion;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class InscripcionDAOImple implements InscripcionDAO{
      public static final String SQL_CONSULTA = "SELECT * FROM inscripcion";
    public static final String SQL_INSERT = "INSERT INTO inscripcion(id, fecha_inscripcion, id_usuario) VALUES (?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM inscripcion WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE inscripcion SET fecha_inscripcion = ? WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM inscripcion WHERE id = ?";

   

    @Override
    public int create(Inscripcion inscripcion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, inscripcion.getId());
            ps.setDate(2, inscripcion.getFecha());
            ps.setInt(3, inscripcion.getIdUsuario());
            
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
    public List<Inscripcion> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Inscripcion> inscripciones = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                Date fecha = res.getDate("fecha_inscripcion");
                int idUsuario = res.getInt("id_usuario");
                
                Inscripcion inscripcion = new Inscripcion(id, fecha, idUsuario);
                inscripciones.add(inscripcion);

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
        return inscripciones;
    }

    @Override
    public Inscripcion selectId(Inscripcion inscripcion) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Inscripcion registroInscripcion = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, inscripcion.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            Date fecha = res.getDate("fecha_inscripcion");
            int idUsuario = res.getInt("id_usuario");
            registroInscripcion = new Inscripcion(id, fecha, idUsuario);
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
        return registroInscripcion;

    }

    @Override
    public int update(Inscripcion inscripcion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setDate(1, inscripcion.getFecha());
            ps.setInt(2, inscripcion.getId());
            
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
    public int delete(model.Inscripcion inscripcion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, inscripcion.getId());
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
