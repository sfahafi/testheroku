package sf.com.spb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sf.com.spb.domain.Persona;
//import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends JpaRepository<Persona, Long>{ // tambien se puede usar CrudRepository
    
}
