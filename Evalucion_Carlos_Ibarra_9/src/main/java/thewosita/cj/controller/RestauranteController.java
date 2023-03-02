package thewosita.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thewosita.cj.modals.Restaurante;
import thewosita.cj.service.RestauranteService;
@RestController
@RequestMapping("/api/restaurante")

public class RestauranteController {

    @Autowired
    RestauranteService restauranteS;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarRestaurante() {
        return new ResponseEntity<>(restauranteS.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearRestaurante(
            @RequestBody Restaurante p) {
        return new ResponseEntity<>(restauranteS.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarRestaurante(@PathVariable Long id, @RequestBody Restaurante p) {
    	Restaurante restauranteENcontrada = restauranteS.findById(id);
        if (restauranteENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	restauranteENcontrada.setNombre(p.getNombre());
            	restauranteENcontrada.setCorreo(p.getCorreo());
            	restauranteENcontrada.setDireccion(p.getDireccion());
            	restauranteENcontrada.setCorreo(p.getCorreo());
            	restauranteENcontrada.setTelefono(p.getTelefono());
                return new ResponseEntity<>(restauranteS.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminarRestaurante(@PathVariable Long id) {
        restauranteS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
