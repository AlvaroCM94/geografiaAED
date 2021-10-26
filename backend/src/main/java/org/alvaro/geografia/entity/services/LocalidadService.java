package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Localidad;

public interface LocalidadService {
	Optional<Localidad> getOne(int id);
	List<Localidad> getAll();
	void add(Localidad localidad);
	void update(Localidad localidad, int id);
	void delete(int id);
}
