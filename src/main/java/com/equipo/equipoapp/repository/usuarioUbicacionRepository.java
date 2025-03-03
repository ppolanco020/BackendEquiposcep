package com.equipo.equipoapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo.equipoapp.entity.usuarioUbicacion;


@Repository("usuarioUbicacionRepository")

public interface usuarioUbicacionRepository extends  JpaRepository<usuarioUbicacion, String>  {


	
}
