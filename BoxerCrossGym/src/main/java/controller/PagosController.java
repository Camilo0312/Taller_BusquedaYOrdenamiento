/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import datos.PagosDAOImple;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pagos;
import java.sql.Date;
/**
 *
 * @author Sebastian
 */
@WebServlet("/pagos")
public class PagosController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch(accion){
                case "eliminar":
                    
                    eliminar(req, resp);
            }
        }
    }
    
    
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        switch (accion) {
            case "crear":
                crear(req, resp);
                break;
            case "actualizar":
                actualizar(req, resp);
                break;
        }
    }

    private void eliminar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id")) ;
        int registro = new PagosDAOImple().delete(new Pagos(id));
        consultar(req, resp);

    }

    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PagosDAOImple pDao = new PagosDAOImple();
        List<Pagos> pagos = pDao.all();
        req.setAttribute("pagos", pagos);
        req.getRequestDispatcher("pagos/verpagos.jsp").forward(req, resp);

    }

    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Long fecha = Date.parse(req.getParameter("fecha"));
        float valorPago = Float.parseFloat(req.getParameter("valorPago"));
        String formaPago = req.getParameter("formaPago");
        String nombrePlan = req.getParameter("nombrePlan");
        int idTipoPlan = Integer.parseInt(req.getParameter("idTipoPlan"));
        Pagos pagos = new Pagos(id, fecha, valorPago, formaPago, nombrePlan, idTipoPlan);
        new PagosDAOImple().create(pagos);
        consultar(req, resp);
    }

    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        Pagos pagos = new PagosDAOImple().selectId(new Pagos(id));
        req.setAttribute("pagos", pagos);
        req.getRequestDispatcher("autor/editarpagos.jsp").forward(req, resp);
        
        
    } 
}
