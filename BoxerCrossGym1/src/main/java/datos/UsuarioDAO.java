/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import model.Pagos;
import model.Usuario;

/**
 *
 * @author kevin
 */
public interface UsuarioDAO {
      public int create(Usuario usuario);
    public List<Usuario> all();
    public Usuario selectId(Usuario usuario);
    public int update (Usuario usuario);
    public int delete(Usuario usuario);
}
