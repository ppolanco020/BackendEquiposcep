package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Equipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("equipoRepository")

public interface EquipoRepository extends  JpaRepository<Equipo, String>  {
	public List<Equipo>findBySicoin(String sicoin);

	
}
