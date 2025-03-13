package com.equipo.equipoapp.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.equipoapp.entity.Marca;
import com.equipo.equipoapp.entity.Ubicacion;
import com.equipo.equipoapp.repository.UbicacionRepository;



@RestController
@RequestMapping("/ubicacion")
@CrossOrigin


public class UbicacionService {

	@Autowired
	UbicacionRepository ubicacionrepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Ubicacion> buscar(){
	  return ubicacionrepository.findAll();
	}
	
	

	

	@PostMapping(path="/guardar")
	public Ubicacion guardaUbicacion(@RequestBody Ubicacion ubicacion) {
		return ubicacionrepository.save(ubicacion);
	}
	
	
}
