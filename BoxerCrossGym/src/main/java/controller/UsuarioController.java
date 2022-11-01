/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.UsuarioDAOImple;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author kevin
 */

@WebServlet("/usuario")
public class UsuarioController extends HttpServlet{
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
        int registro = new UsuarioDAOImple().delete(new Usuario(id));
        consultar(req, resp);

    }

    private void consultar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDAOImple uDao = new UsuarioDAOImple();
        List<Usuario> usuarios = uDao.all();
        req.setAttribute("usuarios", usuarios);
        req.getRequestDispatcher("usuario/verusuario.jsp").forward(req, resp);

    }

    private void crear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String telefono = req.getParameter("telefono");
        String direccion = req.getParameter("direccion");
        int idPagos= Integer.parseInt(req.getParameter("id_pagos"));
        Usuario usuario = new Usuario(id, nombre, telefono, direccion, idPagos);
        new UsuarioDAOImple().create(usuario);
        consultar(req, resp);
    }

    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 private void buscarEditar(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        int id= Integer.parseInt(req.getParameter("id"));    
        Usuario usuario = new UsuarioDAOImple().selectId(new Usuario(id));
        req.setAttribute("usuario", usuario);
        req.getRequestDispatcher("autor/editarusuario.jsp").forward(req, resp);
        
        
    } 
}
