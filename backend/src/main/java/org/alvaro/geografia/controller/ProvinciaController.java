package org.alvaro.geografia.controller;

import java.util.List;
import java.util.Optional;

import org.alvaro.geografia.entity.models.Provincia;
import org.alvaro.geografia.entity.services.ProvinciaService;

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
public class ProvinciaController {

	
		@Autowired
		ProvinciaService provinciaService;

		@GetMapping("/provincia")
		List<Provincia> getAll(){
			return provinciaService.getAll();
		}

		@GetMapping("/provincia/{codPostal}")
		Provincia getOne(@PathVariable("codPostal") int id) {
			Optional<Provincia> l = provinciaService.getOne(id);

			if(l.isPresent()) {
				return l.get();
			};

			return null;
		}

		@PostMapping("/provincia")
		void add(Provincia provincia) {
			System.out.println(provincia.getNombre());
			provinciaService.add(provincia);
		}

		@PostMapping(value="/provincia", consumes="application/json")
		void addUsingJson(@RequestBody String provinciaString) {
			ObjectMapper om = new ObjectMapper();
			try {
				Provincia provincia = om.readValue(provinciaString, Provincia.class);
				provinciaService.add(provincia);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@DeleteMapping("/provincia/{codPostal}")
		void delete(@PathVariable("codPostal") int id) {
			System.out.println(id);
			provinciaService.delete(id);
		}
	
}
