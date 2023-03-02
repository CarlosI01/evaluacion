package thewosita.cj.modals;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Restaurante")
public class Restaurante {
	
	private Long _id ;
	private String nombre;
	private String telefono;
	private String correo;
	private String direccion;
    private List<Cliente> client;
    private List<Carta> carta;

}
