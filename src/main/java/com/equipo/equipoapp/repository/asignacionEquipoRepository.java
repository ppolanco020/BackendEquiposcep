package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.asignacionEquipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("asignacionEquipoRepository")

public interface asignacionEquipoRepository extends  JpaRepository<asignacionEquipo, String>  {
	public List<asignacionEquipo>findByequiposicoin(String sicoin);

	
}
