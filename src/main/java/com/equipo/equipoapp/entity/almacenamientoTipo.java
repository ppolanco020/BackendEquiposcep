package com.equipo.equipoapp.entity;
import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="almacenamiento_tipo")


public class almacenamientoTipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idalmacenamientoTipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoalmacenamientotipo;
	

	@Column(name = "tipoAlmacenamiento")
	private String tipoalmacenamiento;


	public Integer getIdequipoalmacenamientotipo() {
		return idequipoalmacenamientotipo;
	}


	public void setIdequipoalmacenamientotipo(Integer idequipoalmacenamientotipo) {
		this.idequipoalmacenamientotipo = idequipoalmacenamientotipo;
	}


	public String getTipoalmacenamiento() {
		return tipoalmacenamiento;
	}


	public void setTipoalmacenamiento(String tipoalmacenamiento) {
		this.tipoalmacenamiento = tipoalmacenamiento;
	}






	

	
}
