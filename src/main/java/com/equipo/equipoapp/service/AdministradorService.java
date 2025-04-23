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


import com.equipo.equipoapp.entity.Administrador;
import com.equipo.equipoapp.repository.AdministradorRepository;



@RestController
@RequestMapping("/administrador")
@CrossOrigin


public class AdministradorService {

	@Autowired
	AdministradorRepository administradorepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Administrador> buscar(){
	  return administradorepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{email}")
	public List<Administrador> findByemail(@PathVariable String email){
		return administradorepository.findByemail(email);
	}
	
	
	@GetMapping(path ="/buscar/correo/{email}")
	public List<Administrador> findByemailLike(@PathVariable String email){
		return administradorepository.findByemailLike(email+"%%");
	}

	

	@PostMapping(path="/guardar")
	public Administrador guardaUsuario(@RequestBody Administrador correo) {
		return administradorepository.save(correo);
	}
	
	@PostMapping(path="/login")
	public Administrador login(@RequestBody Administrador administrador ){
		
		Administrador login = null;
		List<Administrador> usuarios=administradorepository.findByEmailAndPassword(administrador.getEmail(), administrador.getPassword());
		
		if(usuarios.size()>0) {
			login=usuarios.get(0);
		}
		return login;
	}
	
/*	@DeleteMapping(path ="/eliminar/{idusuario}")
	public void eliminar (@PathVariable int idusuario) {
		usuariorepository.deleteById(idusuario);	
	
				}*/
	
	
	
}
