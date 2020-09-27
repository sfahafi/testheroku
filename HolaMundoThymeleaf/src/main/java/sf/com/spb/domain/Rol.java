package sf.com.spb.domain;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data // proyecto de lombok para que genere los metodos get y set, entre otros
@Table(name="rol")
public class Rol implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // forma de generacion de clave primaria
    private Long idRol;
    
    @NotEmpty
    private String nombre;
    
}
