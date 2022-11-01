/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Pagos;

/**
 *
 * @author kevin
 */
public interface PagosDAO {
     public int create(Pagos pagos);
    public List<Pagos> all();
    public Pagos selectId(Pagos pagos);
    public int update (Pagos pagos);
    public int delete(Pagos pagos);
}
