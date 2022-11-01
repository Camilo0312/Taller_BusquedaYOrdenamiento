/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.TipoDAOImple;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tipo;


public class TipoController {
    
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
        int registro = new TipoDAOImple().delete(new Tipo(id));
        consultar(req, resp);

    }

    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TipoDAOImple uDao = new TipoDAOImple();
        List<Tipo> tipo = uDao.all();
        req.setAttribute("usuarios", tipo);
        req.getRequestDispatcher("tipo/vertipo.jsp").forward(req, resp);

    }

    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String tipo = req.getParameter("tipo");
        Tipo tip = new Tipo(id, tipo);
        new TipoDAOImple().create(tip);
        consultar(req, resp);
    }

    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        Tipo tipo = new TipoDAOImple().selectId(new Tipo(id));
        req.setAttribute("tipo", tipo);
        req.getRequestDispatcher("autor/editartipo.jsp").forward(req, resp);
        
        
    }
 
}
