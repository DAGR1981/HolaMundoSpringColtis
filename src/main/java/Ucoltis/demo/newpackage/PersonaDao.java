
package Ucoltis.demo.newpackage;


import Ucoltis.demo.domain.Persona;
//import com.coltis.HolaMundoSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
    

