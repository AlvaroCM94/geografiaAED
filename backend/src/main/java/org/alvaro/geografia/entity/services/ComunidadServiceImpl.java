package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.alvaro.geografia.entity.models.Comunidad;
import org.alvaro.geografia.entity.dao.ComunidadDAO;

@Service
public class ComunidadServiceImpl implements ComunidadService{
	
	@Autowired
	private ComunidadDAO comunidadDao;

	@Override
	public Optional<Comunidad> getOne(int id){
		return comunidadDao.findById(id);
	}

	@Override
	public List<Comunidad> getAll(){
		return (List<Comunidad>) comunidadDao.findAll();
	}

	@Override
	public void add(Comunidad comunidad){
		comunidadDao.save(comunidad);
		
	}

	@Override
	public void update(Comunidad comunidad, int id){
		
	}

	@Override
	public void delete(int id){
		comunidadDao.deleteById(id);
		
	}
}
