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

import com.equipo.equipoapp.entity.Procesador;

import com.equipo.equipoapp.repository.ProcesadorRepository;



@RestController
@RequestMapping("/procesador")
@CrossOrigin


public class ProcesadorService {

	@Autowired
	ProcesadorRepository preocesadorrepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Procesador> buscar(){
	  return preocesadorrepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{sicoin}")
	public List<Procesador> buscarPorSicoin(@PathVariable String procesador){
		return preocesadorrepository.findByProcesador("%%"+procesador+"%%");
	}
	
	
	
	

	@PostMapping(path="/guardar")
	public Procesador guardarEquipo(@RequestBody Procesador procesador) {
		return preocesadorrepository.save(procesador);
	}
	
	
}
