package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Provincia;

public interface ProvinciaService {
	Optional<Provincia> getOne(int id);
	List<Provincia> getAll();
	void add(Provincia provincia);
	void update(Provincia provincia, int id);
	void delete(int id);
}
