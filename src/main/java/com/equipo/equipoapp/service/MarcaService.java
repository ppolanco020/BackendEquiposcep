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

import com.equipo.equipoapp.repository.MarcaRepository;



@RestController
@RequestMapping("/marca")
@CrossOrigin


public class MarcaService {

	@Autowired
	MarcaRepository marcarepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Marca> buscar(){
	  return marcarepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{marca}")
	public List<Marca> buscarPorMarca(@PathVariable Integer marca){
		return marcarepository.findByidmarca(marca);
	}
	
	
	
	

	@PostMapping(path="/guardar")
	public Marca guardarMarca(@RequestBody Marca marca) {
		return marcarepository.save(marca);
	}
	
	
}
