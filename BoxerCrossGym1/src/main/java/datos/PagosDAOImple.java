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
import model.Pagos;
import red.BaseDeDatos;

/**
 *
 * @author kevin
 */
public class PagosDAOImple implements PagosDAO {
      public static final String SQL_CONSULTA = "SELECT * FROM pagos";
    public static final String SQL_INSERT = "INSERT INTO pagos(id, fecha, valor_pago, forma_pago, nombre_plan, id_tipo_plan) VALUES (?,?,?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM pagos WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE pagos SET fecha = ?, valor_pago = ?, forma_pago = ?, nombre_plan = ?  WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM pagos WHERE id = ?";

   

    @Override
    public int create(Pagos pagos) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setInt(1, pagos.getId());
            ps.setDate(2, pagos.getFecha());
            ps.setFloat(3, pagos.getValorPago());
            ps.setString(4, pagos.getFormaPago());
            ps.setString(5, pagos.getNombrePlan());
            ps.setInt(6, pagos.getIdTipoPlan());
            
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
    public List<Pagos> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Pagos> pagos = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                Date fecha = res.getDate("fecha");
                float valorPago = res.getFloat("valor_pago");
                String formaPago = res.getString("forma_pago");
                String nombrePlan = res.getString("nombre_plan");
                int idTipoPlan = res.getInt("id_tipo_plan");
                Pagos pago = new Pagos(id, fecha, valorPago,formaPago, nombrePlan,idTipoPlan );
                pagos.add(pago);

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
        return pagos;
    }

    @Override
    public Pagos selectId(Pagos pago) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Pagos registroPago = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setInt(1, pago.getId());
            res = ps.executeQuery();
            res.absolute(1);
            int id = res.getInt("id");
                Date fecha = res.getDate("fecha");
                float valorPago = res.getFloat("valor_pago");
                String formaPago = res.getString("forma_pago");
                String nombrePlan = res.getString("nombre_plan");
                int idTipoPlan = res.getInt("id_tipo_plan");
                registroPago = new Pagos(id, fecha, valorPago,formaPago, nombrePlan,idTipoPlan );
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
        return registroPago;

    }

    @Override
    public int update(Pagos pago) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setDate(1, pago.getFecha());
            ps.setFloat(2, pago.getValorPago());
            ps.setString(3, pago.getFormaPago());
            ps.setString(4, pago.getNombrePlan());
            ps.setInt(5, pago.getId());
            
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
    public int delete(model.Pagos pago) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, pago.getId());
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
