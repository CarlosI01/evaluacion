package thewosita.cj.modals;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Carta")
public class Carta {
	private Long _id ;

	private String nombre;
	private String categoria;
	private int cantidad;
	private List<Plato> plat;
    private Plato plato;
    
    private Restaurante restaurante;
  
    private Cliente cliente;
    
    private List<Plato> platos;
	
}
