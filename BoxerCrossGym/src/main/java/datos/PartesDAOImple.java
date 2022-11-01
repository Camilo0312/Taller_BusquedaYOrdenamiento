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
import model.Partes;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class PartesDAOImple implements PartesDAO{
      public static final String SQL_CONSULTA = "SELECT * FROM partes";
    public static final String SQL_INSERT = "INSERT INTO partes(id, parte) VALUES (?,?)";
    public static final String SQL_DELETE = "DELETE FROM partes WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE partes SET parte = ?  WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM partes WHERE id = ?";

   

    @Override
    public int create(Partes parte) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, parte.getId());
            ps.setString(2, parte.getParte());
            
            
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
    public List<Partes> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Partes> partes = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String parteS = res.getString("parte");
                Partes parte = new Partes(id,parteS);
                partes.add(parte);

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
        return partes;
    }

    @Override
    public Partes selectId(Partes parte) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Partes registroParte = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, parte.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
            String parteS = res.getString("parte");
                registroParte = new Partes(id, parteS);
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
        return registroParte;

    }

    @Override
    public int update(Partes parte) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, parte.getParte());
            ps.setInt(2, parte.getId());;
            
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
    public int delete(model.Partes parte) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, parte.getId());
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
