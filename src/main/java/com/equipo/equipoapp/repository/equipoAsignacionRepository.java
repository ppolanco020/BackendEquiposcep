package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.equipoAsignacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("equipoAsignacionRepository")

public interface equipoAsignacionRepository extends  JpaRepository<equipoAsignacion, Integer>  {
	public List<equipoAsignacion>findByequiposicoin(String sicoin);
	//public List<equipoAsignacion>findByemail(String email);
	
	
}
