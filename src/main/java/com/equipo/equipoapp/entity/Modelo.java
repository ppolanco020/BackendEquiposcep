package com.equipo.equipoapp.entity;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="modelo")


public class Modelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idmodelo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idmodelo;
	
	@Column(name = "modelo")
	private String modelo;


	@Column(name = "marcaIdmarca")
	private Integer marcaidmarca;
	
	@Column(name = "tipoequipoIdtipoequipo")
	private Integer tipoequipoidtipoequipo;
	

	public Integer getIdmodelo() {
		return idmodelo;
	}


	public void setIdmodelo(Integer idmodelo) {
		this.idmodelo = idmodelo;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getMarcaidmarca() {
		return marcaidmarca;
	}


	public void setMarcaidmarca(Integer marcaidmarca) {
		this.marcaidmarca = marcaidmarca;
	}


	public Integer getTipoequipoidtipoequipo() {
		return tipoequipoidtipoequipo;
	}


	public void setTipoequipoidtipoequipo(Integer tipoequipoidtipoequipo) {
		this.tipoequipoidtipoequipo = tipoequipoidtipoequipo;
	}
	

	 


	
}
