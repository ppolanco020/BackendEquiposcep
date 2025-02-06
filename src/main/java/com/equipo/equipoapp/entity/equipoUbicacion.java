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
@Table(name="equipo_ubicacion")


public class equipoUbicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idequipoUbicacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoubicacion;
	

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "ubicacionIdubicacion")
	private String ubicacionidubicacion;

	public Integer getIdequipoubicacion() {
		return idequipoubicacion;
	}

	public void setIdequipoubicacion(Integer idequipoubicacion) {
		this.idequipoubicacion = idequipoubicacion;
	}

	public String getEquiposicoin() {
		return equiposicoin;
	}

	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	public String getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}

	public void setUbicacionidubicacion(String ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
	}

	
	



	
}
