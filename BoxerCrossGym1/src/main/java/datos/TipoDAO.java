/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Tipo;

/**
 *
 * @author kevin
 */
public interface TipoDAO {
      public int create(Tipo tipo);
    public List<Tipo> all();
    public Tipo selectId(Tipo tipo);
    public int update (Tipo tipo);
    public int delete(Tipo tipo);
}
