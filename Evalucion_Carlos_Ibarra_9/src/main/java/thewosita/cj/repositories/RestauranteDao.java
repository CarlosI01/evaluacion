package thewosita.cj.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import thewosita.cj.modals.Restaurante;

@Repository
public interface RestauranteDao extends MongoRepository<Restaurante, Long>{

}
