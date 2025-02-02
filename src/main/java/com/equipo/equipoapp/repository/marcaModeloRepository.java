package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.marcaModelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("marcamodeloRepository")

public interface marcaModeloRepository extends  JpaRepository<marcaModelo, Integer>  {
//	public List<marcaModelo>findByModelo(String modelo);

	
}
