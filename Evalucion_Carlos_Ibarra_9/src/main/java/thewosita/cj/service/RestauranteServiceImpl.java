package thewosita.cj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import thewosita.cj.modals.Restaurante;
import thewosita.cj.repositories.RestauranteDao;
@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante, Long> implements RestauranteService{
	
	@Autowired
	RestauranteDao restauranteD;

	@Override
	public CrudRepository<Restaurante, Long> getDao() {
		return restauranteD;
	}

}
