/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import datos.PartesDAOImple;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Partes;

/**
 *
 * @author Sebastian
 */
@WebServlet("/usuario")
    public class PartesController extends HttpServlet{
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
        int registro = new PartesDAOImple().delete(new Partes(id));
        consultar(req, resp);

    }

    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PartesDAOImple pDao = new PartesDAOImple();
        List<Partes> partes = pDao.all();
        req.setAttribute("partes", partes);
        req.getRequestDispatcher("partes/verpartes.jsp").forward(req, resp);

    }

    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String parte = req.getParameter("parte");
        Partes partes = new Partes(id, parte);
        new PartesDAOImple().create(partes);
        consultar(req, resp);
    }

    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        Partes partes = new PartesDAOImple().selectId(new Partes(id));
        req.setAttribute("partes", partes);
        req.getRequestDispatcher("autor/editarpartes.jsp").forward(req, resp);
        
        
    } 
}
