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
import com.equipo.equipoapp.entity.Usuario;
import com.equipo.equipoapp.repository.UsuarioRepository;



@RestController
@RequestMapping("/usuario")
@CrossOrigin


public class UsuarioService {

	@Autowired
	UsuarioRepository usuariorepository;
	
	
	@GetMapping(path ="/buscar")
	public List<Usuario> buscar(){
	  return usuariorepository.findAll();
	}
	
	
	
	@GetMapping(path ="/buscar/{email}")
	public List<Usuario> findByemail(@PathVariable String email){
		return usuariorepository.findByemail(email);
	}
	
	
	@GetMapping(path ="/buscar/correo/{email}")
	public List<Usuario> findByemailLike(@PathVariable String email){
		return usuariorepository.findByemailLike(email+"%%");
	}

	

	@PostMapping(path="/guardar")
	public Usuario guardaUsuario(@RequestBody Usuario correo) {
		return usuariorepository.save(correo);
	}
	
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario usuario ){
		
		Usuario login = null;
		List<Usuario> usuarios=usuariorepository.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
		
		if(usuarios.size()>0) {
			login=usuarios.get(0);
		}
		return login;
	}
	
	@DeleteMapping(path ="/eliminar/{idusuario}")
	public void deleteByidusuario(@PathVariable int idusuario) {
		usuariorepository.deleteById(idusuario);	
	
				}
	
	
	
}
