package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.alvaro.geografia.entity.models.Localidad;
import org.alvaro.geografia.entity.dao.LocalidadDAO;

@Service
public class LocalidadServiceImpl implements LocalidadService{
	
	@Autowired
	private LocalidadDAO localidadDao;

	@Override
	public Optional<Localidad> getOne(int id){
		return localidadDao.findById(id);
	}

	@Override
	public List<Localidad> getAll(){
		return (List<Localidad>) localidadDao.findAll();
	}

	@Override
	public void add(Localidad localidad){
		localidadDao.save(localidad);
		
	}

	@Override
	public void update(Localidad localidad, int id){
		
	}

	@Override
	public void delete(int id){
		localidadDao.deleteById(id);
		
	}

}
