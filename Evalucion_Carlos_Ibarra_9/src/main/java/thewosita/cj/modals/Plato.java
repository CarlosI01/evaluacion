package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Plato")
public class Plato {
	private Long _id ;

	private String nombre_plato;
	private String descripcion;
	private double precio;
}
