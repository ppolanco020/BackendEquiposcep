package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Marca;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("marcaRepository")

public interface MarcaRepository extends  JpaRepository<Marca, Integer>  {
		public List<Marca>findByidmarca(Integer marca);
}
