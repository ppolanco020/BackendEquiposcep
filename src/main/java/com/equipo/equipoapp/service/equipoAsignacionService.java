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

import com.equipo.equipoapp.entity.equipoAsignacion;

import com.equipo.equipoapp.repository.equipoAsignacionRepository;



@RestController
@RequestMapping("/equipo_asignacion")
@CrossOrigin


public class equipoAsignacionService {

	@Autowired
	equipoAsignacionRepository equipoasignacionrepository;
	
	
	@GetMapping(path ="/buscar")
	public List<equipoAsignacion> buscar(){
	  return equipoasignacionrepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{sicoin}")
	public List<equipoAsignacion> buscarPorSicoin(@PathVariable String sicoin){
		return equipoasignacionrepository.findByequiposicoin("%%"+sicoin+"%%");
	}
	
	
	
	

	@PostMapping(path="/guardar")
	public equipoAsignacion guardarEquipo(@RequestBody equipoAsignacion equipoasignacion) {
		return equipoasignacionrepository.save(equipoasignacion);
	}
	
	
}
