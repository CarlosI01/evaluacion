package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Cliente")
public class Cliente {
	private Long _id ;

	private String nombre;
	private String apelido;
	private String apellido;
	private String correo;
    private Restaurante restaurante;
    
	
}
