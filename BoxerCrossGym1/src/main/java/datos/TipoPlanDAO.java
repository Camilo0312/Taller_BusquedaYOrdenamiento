/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.TipoPlan;

/**
 *
 * @author kevin
 */
public interface TipoPlanDAO {
      public int create(TipoPlan tipoPlan);
    public List<TipoPlan> all();
    public TipoPlan selectId(TipoPlan tipoPlan);
    public int update (TipoPlan tipoPlan);
    public int delete(TipoPlan tipoPlan);
}
