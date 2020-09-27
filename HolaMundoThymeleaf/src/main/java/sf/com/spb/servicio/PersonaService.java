package sf.com.spb.servicio;

import java.util.List;
import sf.com.spb.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontarPersona(Persona persona);
}
