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
@Table(name="marca_modelo")


public class marcaModelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idmarcaModelo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idmarcamodelo;
	

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "marcaIdmarca")
	private Integer marcaidmarca;

	@Column(name = "modeloIdmodelo")
	private String modeloidmodelo;



	public Integer getIdmarcamodelo() {
		return idmarcamodelo;
	}



	public void setIdmarcamodelo(Integer idmarcamodelo) {
		this.idmarcamodelo = idmarcamodelo;
	}



	public String getEquiposicoin() {
		return equiposicoin;
	}



	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}



	public Integer getMarcaidmarca() {
		return marcaidmarca;
	}



	public void setMarcaidmarca(Integer marcaidmarca) {
		this.marcaidmarca = marcaidmarca;
	}



	public String getModeloidmodelo() {
		return modeloidmodelo;
	}



	public void setModeloidmodelo(String modeloidmodelo) {
		this.modeloidmodelo = modeloidmodelo;
	}

	

	
}
