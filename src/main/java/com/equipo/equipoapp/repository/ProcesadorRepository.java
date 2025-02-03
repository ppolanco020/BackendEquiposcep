package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Procesador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("procesadorRepository")

public interface ProcesadorRepository extends  JpaRepository<Procesador, Integer>  {
	public List<Procesador>findByProcesador(String procesador);

	
}
