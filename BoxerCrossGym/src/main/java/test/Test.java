/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PartesDAOImple;
import datos.ProgramacionDAOImple;
import datos.TipoDAO;
import datos.TipoDAOImple;
import datos.TipoPlanDAOImple;
import datos.UsuarioDAOImple;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.Partes;
import model.Programacion;
import model.Tipo;
import model.TipoPlan;
import model.Usuario;

/**
 *
 * @author kevin
 */
public class Test {
    public static void main(String[] args) {
        
        Date fecha = new Date(2022, 06, 28);
        
        PartesDAOImple parte = new PartesDAOImple();
//        parte.create(new Partes(1, "A"));
        List<Partes> partes = new ArrayList<>();
        partes = parte.all();
        
        
        UsuarioDAOImple usuario1 = new UsuarioDAOImple();
//        usuario1.create(new Usuario(0, "Kevin", "305", "Calle23", 1));
//        Usuario pruebaD = new Usuario(2, "", "", "", 0);
//        usuario1.delete(pruebaD);
//        Usuario prueba = new Usuario(1, "KevinMod", "65", "32", 0);
//        usuario1.update(prueba);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = usuario1.all();
        
        
        TipoDAOImple tipoP = new TipoDAOImple();
//        tipoP.create(new Tipo(0, "AMRAP"));
        
        List<Tipo> tiposP = new ArrayList<>();
        tiposP = tipoP.all();
        
        
        TipoPlanDAOImple tipoPlanP = new TipoPlanDAOImple();
        tipoPlanP.create(new TipoPlan(0, "SEMESTRE"));
        
        List<TipoPlan> planes = new ArrayList<>();
        planes = tipoPlanP.all();
        
        
        ProgramacionDAOImple programacion = new ProgramacionDAOImple();
//        programacion.create(new Programacion(0, fecha, 1, 1));
        
        List<Programacion> programaciones = new ArrayList<>();
        programaciones = programacion.all();
        
        
        for (int i = 0; i < programaciones.size(); i++) {
            System.out.println("Programacion: " + programaciones.get(i).getFecha() + " " + programaciones.get(i).getIdPartes()
             + " " + programaciones.get(i).getIdTipo());
        }
        
        
        
        
        for (int i = 0; i < planes.size(); i++) {
            System.out.println("Planes: "  +  planes.get(i).getTipoPlan());
        }
        
        
        
        for (int i = 0; i < tiposP.size(); i++) {
            System.out.println("Tipo: " + tiposP.get(i).getTipo());
        }
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("Usuarios: " + usuarios.get(i).getNombre());
        }
        
        
        for (int i = 0; i < partes.size(); i++) {
            System.out.println("PARTE: " + partes.get(i).getParte());
        }
       
    }
}
