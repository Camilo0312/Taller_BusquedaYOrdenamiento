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
import model.Programacion;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class ProgramacionDAOImple implements ProgramacionDAO {

    public static final String SQL_CONSULTA = "SELECT * FROM programacion";
    public static final String SQL_INSERT = "INSERT INTO programacion(id, fecha, id_parte, id_tipo) VALUES (?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM programacion WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE programacion SET fecha = ?   WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM programacion WHERE id = ?";

    @Override
    public int create(Programacion programacion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, programacion.getId());
            ps.setDate(2, programacion.getFecha());
            ps.setInt(3, programacion.getIdPartes());
            ps.setInt(4, programacion.getIdTipo());

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
    public List<Programacion> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Programacion> programaciones = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                Date fecha = res.getDate("fecha");
                int idParte = res.getInt("id_parte");
                int idTipo = res.getInt("id_tipo");
                Programacion programacion = new Programacion(id, fecha, idParte, idTipo);
                programaciones.add(programacion);

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
        return programaciones;
    }

    @Override
    public Programacion selectId(Programacion programacion) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Programacion registroProgramacion = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, programacion.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            Date fecha = res.getDate("fecha");
            int idParte = res.getInt("id_parte");
            int idTipo = res.getInt("id_tipo");
            registroProgramacion = new Programacion(id, fecha, idParte, idTipo);
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
        return registroProgramacion;

    }

    @Override
    public int update(Programacion programacion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
             ps.setDate(1, programacion.getFecha());
            ps.setInt(2, programacion.getId());
            
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
    public int delete(model.Programacion programacion) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, programacion.getId());
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
