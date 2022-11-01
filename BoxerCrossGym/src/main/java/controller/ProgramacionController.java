/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.ProgramacionDAOImple;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Programacion;

 
@WebServlet("/programacion")
public class ProgramacionController extends HttpServlet{
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
        int registro = new ProgramacionDAOImple().delete(new Programacion(id));
        consultar(req, resp);

    }
    
    
    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProgramacionDAOImple uDao = new ProgramacionDAOImple();
        List<Programacion> programacion = uDao.all();
        req.setAttribute("Programacion", programacion);
        req.getRequestDispatcher("programacion/verprogramacion.jsp").forward(req, resp);

    }
    
    
    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idPartes = Integer.parseInt(req.getParameter("idPartes"));
        Long fecha;
        fecha = Date.parse(req.getParameter("fecha"));
        int id = Integer.parseInt(req.getParameter("id"));
        int idTipo  = Integer.parseInt(req.getParameter("idTipo"));
        Programacion programacion = new Programacion(idPartes, fecha, id, idTipo);
        new ProgramacionDAOImple().create(programacion);
        consultar(req, resp);
    }
    
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        Programacion programacion = new ProgramacionDAOImple().selectId(new Programacion(id));
        req.setAttribute("programacion", programacion);
        req.getRequestDispatcher("autor/editarprogramacion.jsp").forward(req, resp);
        
        
    } 
}

 
