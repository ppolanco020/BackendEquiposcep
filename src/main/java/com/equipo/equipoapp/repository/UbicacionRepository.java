package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Ubicacion;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("ubicacionRepository")

public interface UbicacionRepository extends  JpaRepository<Ubicacion, Integer>  {
		public List<Ubicacion>findByidubicacion(Integer ubicacion);
}
