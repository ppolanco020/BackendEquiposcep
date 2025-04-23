package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Administrador;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("administradorRepository")

public interface AdministradorRepository extends  JpaRepository<Administrador, String>  {
	public List<Administrador>findByEmailAndPassword(String email,String password);
	public List<Administrador>findByemail(String email);
	public List<Administrador>findByemailLike(String email);
	public List<Administrador>findByNombre(String nombre);
	public List<Administrador>deleteByEmail(String email);
//	public List<Administrador>deleteByidusuario(Integer idusuario);
	public List<Administrador>findByEmail(String usuario);
}
