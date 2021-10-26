package org.alvaro.geografia.controller;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Localidad;
import org.alvaro.geografia.entity.services.LocalidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocalidadController {

		@Autowired
		LocalidadService localidadService;

		@GetMapping("/localidad")
		List<Localidad> getAll(){
			return localidadService.getAll();
		}

		@GetMapping("/localidad/{idLocalidad}")
		Localidad getOne(@PathVariable("idLocalidad") int id) {
			Optional<Localidad> l = localidadService.getOne(id);

			if(l.isPresent()) {
				return l.get();
			};

			return null;
		}

		@PostMapping("/localidad")
		void add(Localidad localidad) {
			System.out.println(localidad.getNombre());
			localidadService.add(localidad);
		}

		@PostMapping(value="/localidad", consumes="application/json")
		void addUsingJson(@RequestBody String localidadString) {
			ObjectMapper om = new ObjectMapper();
			try {
				Localidad localidad = om.readValue(localidadString, Localidad.class);
				localidadService.add(localidad);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@DeleteMapping("/localidad/{idLocalidad}")
		void delete(@PathVariable("idLocalidad") int id) {
			System.out.println(id);
			localidadService.delete(id);
		}
		
}