/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Inscripcion;

/**
 *
 * @author kevin
 */
public interface InscripcionDAO {
     public int create(Inscripcion inscripcion);
    public List<Inscripcion> all();
    public Inscripcion selectId(Inscripcion inscripcion);
    public int update (Inscripcion inscripcion);
    public int delete(Inscripcion inscripcion);
}
