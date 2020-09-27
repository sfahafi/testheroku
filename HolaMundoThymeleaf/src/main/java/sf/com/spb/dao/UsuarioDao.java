package sf.com.spb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sf.com.spb.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    // de JpaRepository o CrudRepository, 
    // se agregan automaticamente los metodos mas comunes en operaciones de datos
    // create, read, update, delete, entre otros 
    // en automatico Sprin va a crear una implementacion de la interface
    
    Usuario findByUsername(String username); //Este metodo es de seguridad de Spring, debe estar escrito de esa forma
        
        
}
