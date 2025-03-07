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

import com.equipo.equipoapp.entity.Modelo;
import com.equipo.equipoapp.repository.ModeloRepository;


@RestController
@RequestMapping("/modelo")
@CrossOrigin


public class ModeloService {

	@Autowired
	ModeloRepository modelorepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Modelo> buscar(){
	  return modelorepository.findAll();
	}
	
	
	/*
	@GetMapping(path ="/buscar/{idmodelo}")
	public List<Modelo> buscarPoridmodelo(@PathVariable String idmodelo){
		return modelorepository.findByidmodeloLike("%%"+idmodelo+"%%");
	}*/
	/*
	@GetMapping(path ="/buscar/marca/{marcaidmarca}")
	public List<Modelo> buscarPormarcaidmarca(@PathVariable Integer marcaz){
		return modelorepository.findBymarcaidmarca(marcaz);
	}*/
	
	
	@GetMapping(path ="/buscar/{marcaidmarca}")
	public Modelo buscarporId(@PathVariable int marcaidmarca){
	  
		Optional<Modelo> modelo = modelorepository.findBymarcaidmarca(marcaidmarca);
	
			
			return modelo.isPresent() ? modelo.get() : null;

	
	}
	
	
	
	

	@PostMapping(path="/guardar")
	public Modelo guardarModelo(@RequestBody Modelo modelo) {
		return modelorepository.save(modelo);
	}
	
	
}
