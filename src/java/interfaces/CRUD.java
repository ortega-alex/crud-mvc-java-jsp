
package interfaces;

import java.util.List;
import model.Persona;

public interface CRUD {
    public List listar();
    public Persona lista(int id);
    public Boolean add(Persona per);
    public Boolean edit(Persona per);
    public Boolean eliminar(int id);
}
