/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Partes;

/**
 *
 * @author kevin
 */
public interface PartesDAO {
      public int create(Partes parte);
    public List<Partes> all();
    public Partes selectId(Partes parte);
    public int update (Partes parte);
    public int delete(Partes parte);
}
