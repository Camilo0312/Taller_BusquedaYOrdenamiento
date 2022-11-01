/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Programacion;

/**
 *
 * @author kevin
 */
public interface ProgramacionDAO {
      public int create(Programacion programacion);
    public List<Programacion> all();
    public Programacion selectId(Programacion programacion);
    public int update (Programacion programacion);
    public int delete(Programacion programacion);
}
