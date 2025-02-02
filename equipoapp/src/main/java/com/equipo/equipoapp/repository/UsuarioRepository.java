package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("usuarioRepository")

public interface UsuarioRepository extends  JpaRepository<Usuario, String>  {
	public List<Usuario>findByEmailAndPassword(String email,String password);
	public List<Usuario>findByEmailLike(String email);
	public List<Usuario>findByNombreOrApellido(String nombre, String apellido);
	public List<Usuario>deleteByEmail(String email);
	public List<Usuario>findByEmail(String usuario);
}
