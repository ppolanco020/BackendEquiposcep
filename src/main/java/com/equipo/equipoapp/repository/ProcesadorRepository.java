package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.almacenamientoCapacidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("procesadorRepository")

public interface ProcesadorRepository extends  JpaRepository<almacenamientoCapacidad, Integer>  {
	public List<almacenamientoCapacidad>findByProcesador(String procesador);

	
}
