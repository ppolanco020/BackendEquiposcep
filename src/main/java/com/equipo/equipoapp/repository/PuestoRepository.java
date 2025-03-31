package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.Puesto;





@Repository("puestoRepository")

public interface PuestoRepository extends  JpaRepository<Puesto, Integer>  {
	public List<Puesto>findBypuesto(String puesto);
}
