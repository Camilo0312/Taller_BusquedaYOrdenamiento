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
import model.Tipo;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class TipoDAOImple implements TipoDAO{
     public static final String SQL_CONSULTA = "SELECT * FROM tipo";
    public static final String SQL_INSERT = "INSERT INTO tipo(id, tipo) VALUES (?,?)";
    public static final String SQL_DELETE = "DELETE FROM tipo WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE tipo SET tipo = ?  WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM tipo WHERE id = ?";

    @Override
    public int create(Tipo tipo) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, tipo.getId());
            ps.setString(2, tipo.getTipo());

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
    public List<Tipo> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Tipo> tipos = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String tipoS = res.getString("tipo");
                Tipo tipo = new Tipo(id, tipoS);
                tipos.add(tipo);

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
        return tipos;
    }

    @Override
    public Tipo selectId(Tipo tipo) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Tipo registroTipo = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, tipo.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            String tipoS = res.getString("tipo");
            registroTipo = new Tipo(id, tipoS);
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
        return registroTipo;

    }

    @Override
    public int update(Tipo tipo) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, tipo.getTipo());
            ps.setInt(2, tipo.getId());
            
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
    public int delete(model.Tipo tipo) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, tipo.getId());
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
