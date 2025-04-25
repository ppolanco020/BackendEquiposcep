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
@Table(name="equipo_almacenamiento")


public class equipoAlmacenamiento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idequipoAlmacenamiento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoalmacenamiento;
	

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "almacenamiento")
	private String almacenamiento;


	
	@Column(name = "almacenamientotipoIdalmacenamientotipo")
	private String almacenamientotipoidalmacenamientotipo;



	public Integer getIdequipoalmacenamiento() {
		return idequipoalmacenamiento;
	}



	public void setIdequipoalmacenamiento(Integer idequipoalmacenamiento) {
		this.idequipoalmacenamiento = idequipoalmacenamiento;
	}



	public String getEquiposicoin() {
		return equiposicoin;
	}



	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	



	public String getAlmacenamiento() {
		return almacenamiento;
	}



	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}



	public String getAlmacenamientotipoidalmacenamientotipo() {
		return almacenamientotipoidalmacenamientotipo;
	}



	public void setAlmacenamientotipoidalmacenamientotipo(String almacenamientotipoidalmacenamientotipo) {
		this.almacenamientotipoidalmacenamientotipo = almacenamientotipoidalmacenamientotipo;
	}



	
}
