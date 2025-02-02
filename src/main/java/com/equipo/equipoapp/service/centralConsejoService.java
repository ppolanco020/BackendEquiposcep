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

import com.equipo.equipoapp.entity.centralConsejo;
import com.equipo.equipoapp.repository.centralConsejoRepository;



@RestController
@RequestMapping("/centralconsejo")
@CrossOrigin


public class centralConsejoService {

	@Autowired
	centralConsejoRepository centralconsejorepository;
	
	
	@GetMapping(path ="/buscar")
	public List<centralConsejo> buscar(){
	  return centralconsejorepository.findAll();
	}
	
	
	
	
	

	@PostMapping(path="/guardar")
	public centralConsejo guardarcentralConsejo(@RequestBody centralConsejo centralconsejo) {
		return centralconsejorepository.save(centralconsejo);
	}
	
	
}
