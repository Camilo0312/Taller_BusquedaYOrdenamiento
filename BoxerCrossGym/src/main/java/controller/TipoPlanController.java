/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.TipoPlanDAOImple;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TipoPlan;

public class TipoPlanController {
    
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
        int registro = new TipoPlanDAOImple().delete(new TipoPlan(id));
        consultar(req, resp);

    }

    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TipoPlanDAOImple uDao = new TipoPlanDAOImple();
        List<TipoPlan> tipoplan = uDao.all();
        req.setAttribute("tipoPlan", tipoplan);
        req.getRequestDispatcher("tipo/vertipoPlan.jsp").forward(req, resp);

    }

    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String tipoPlan = req.getParameter("tipoPlan");
        TipoPlan tipop = new TipoPlan(id, tipoPlan);
        new TipoPlanDAOImple().create(tipop);
        consultar(req, resp);
    }

    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        TipoPlan tipop = new TipoPlanDAOImple().selectId(new TipoPlan(id));
        req.setAttribute("tipoPlan", tipop);
        req.getRequestDispatcher("autor/editartipoPlan.jsp").forward(req, resp);
        
        
    }
 
}
