package com.equipo.equipoapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Modelo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("modeloRepository")

public interface ModeloRepository extends  JpaRepository<Modelo, Integer>  {
	//public List<Modelo>findByidmodeloLike(String modelo);
	public List <Modelo>findBymarcaidmarca(Integer marca);
	
	
}
