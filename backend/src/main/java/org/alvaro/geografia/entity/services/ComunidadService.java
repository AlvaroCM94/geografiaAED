package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Comunidad;

public interface ComunidadService {
	Optional<Comunidad> getOne(int id);
	List<Comunidad> getAll();
	void add(Comunidad comunidad);
	void update(int id, Comunidad comunida) ;
	void delete(int id);
}
