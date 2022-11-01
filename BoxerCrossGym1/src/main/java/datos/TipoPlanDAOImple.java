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
import model.TipoPlan;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class TipoPlanDAOImple implements TipoPlanDAO {

    public static final String SQL_CONSULTA = "SELECT * FROM tipo_plan";
    public static final String SQL_INSERT = "INSERT INTO tipo_plan(id, tipo_plan) VALUES (?,?)";
    public static final String SQL_DELETE = "DELETE FROM tipo_plan WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE tipo_plan SET tipo_plan = ?  WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM tipo_plan WHERE id = ?";

    @Override
    public int create(TipoPlan tipoPlan) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, tipoPlan.getId());
            ps.setString(2, tipoPlan.getTipoPlan());

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
    public List<TipoPlan> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<TipoPlan> tipoPlanes = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String tipoPlanS = res.getString("tipo_plan");
                TipoPlan tipoPlan = new TipoPlan(id, tipoPlanS);
                tipoPlanes.add(tipoPlan);

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
        return tipoPlanes;
    }

    @Override
    public TipoPlan selectId(TipoPlan tipoPlan) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        TipoPlan registroTipoPlan = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, tipoPlan.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            String tipoPlanS = res.getString("tipo");
            registroTipoPlan = new TipoPlan(id, tipoPlanS);
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
        return registroTipoPlan;

    }

    @Override
    public int update(TipoPlan tipoPlan) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, tipoPlan.getTipoPlan());
            ps.setInt(2, tipoPlan.getId());
            
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
    public int delete(model.TipoPlan tipoPlan) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, tipoPlan.getId());
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
