package org.alvaro.geografia.entity.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.alvaro.geografia.entity.models.Provincia;
import org.alvaro.geografia.entity.dao.ProvinciaDAO;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{

	@Autowired
	private ProvinciaDAO provinciaDao;

	@Override
	public Optional<Provincia> getOne(int id){
		return provinciaDao.findById(id);
	}

	@Override
	public List<Provincia> getAll(){
		return (List<Provincia>) provinciaDao.findAll();
	}

	@Override
	public void add(Provincia provincia){
		provinciaDao.save(provincia);
		
	}

	@Override
	public void update(Provincia provincia, int id){
		
	}

	@Override
	public void delete(int id){
		provinciaDao.deleteById(id);
		
	}
}
