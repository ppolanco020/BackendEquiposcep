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

import com.equipo.equipoapp.entity.Equipo;

import com.equipo.equipoapp.repository.EquipoRepository;



@RestController
@RequestMapping("/equipo")
@CrossOrigin


public class EquipoService {

	@Autowired
	EquipoRepository equiporepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Equipo> buscar(){
	  return equiporepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{sicoin}")
	public List<Equipo> buscarPorSicoin(@PathVariable String sicoin){
		return equiporepository.findBySicoin("%%"+sicoin+"%%");
	}
	
	
	
	

	@PostMapping(path="/guardar")
	public Equipo guardarEquipo(@RequestBody Equipo equipo) {
		return equiporepository.save(equipo);
	}
	
	
}
