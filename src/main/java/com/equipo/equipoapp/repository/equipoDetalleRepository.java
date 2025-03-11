package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.equipoDetalle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("marcamodeloRepository")

public interface equipoDetalleRepository extends  JpaRepository<equipoDetalle, Integer>  {
//	public List<marcaModelo>findByModelo(String modelo);

	
}
