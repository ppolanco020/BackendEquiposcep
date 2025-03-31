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

import com.equipo.equipoapp.entity.Puesto;
import com.equipo.equipoapp.repository.PuestoRepository;



@RestController
@RequestMapping("/puesto")
@CrossOrigin


public class PuestoService {

	@Autowired
	PuestoRepository puestorepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Puesto> buscar(){
	  return puestorepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{puesto}")
	public List<Puesto> findByemail(@PathVariable String puesto){
		return puestorepository.findBypuesto(puesto);
	}
	
	

	@PostMapping(path="/guardar")
	public Puesto guardaUsuario(@RequestBody Puesto puesto) {
		return puestorepository.save(puesto);
	}
	

	
}
