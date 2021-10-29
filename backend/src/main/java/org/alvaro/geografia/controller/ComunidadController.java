package org.alvaro.geografia.controller;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Comunidad;
import org.alvaro.geografia.entity.services.ComunidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ComunidadController {

		@Autowired
		ComunidadService comunidadService;

		@GetMapping("/comunidadautonoma")
		List<Comunidad> getAll(){
			return comunidadService.getAll();
		}

		@GetMapping("/comunidadautonoma/{idcomunidad}")
		Comunidad getOne(@PathVariable("idcomunidad") int id) {
			Optional<Comunidad> l = comunidadService.getOne(id);

			if(l.isPresent()) {
				return l.get();
			};

			return null;
		}

		@PostMapping("/comunidadautonoma")
		void add(Comunidad comunidad) {
			System.out.println(comunidad.getNombre());
			comunidadService.add(comunidad);
		}

		@PostMapping(value="/comunidadautonoma", consumes="application/json")
		void addUsingJson(@RequestBody String comunidadString) {
			ObjectMapper om = new ObjectMapper();
			try {
				Comunidad comunidad = om.readValue(comunidadString, Comunidad.class);
				comunidadService.add(comunidad);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@PutMapping(value = "/comunidadautonoma/{idcomunidad}")
	    void update(@PathVariable(value = "idcomunidad") int id, Comunidad comunidad) {
			System.out.println(comunidad.getNombre());
			comunidadService.update(id, comunidad);
	    }

		@DeleteMapping("/comunidadautonoma/{idcomunidad}")
		void delete(@PathVariable("idcomunidad") int id) {
			System.out.println(id);
			comunidadService.delete(id);
		}
	
}
