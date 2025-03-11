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


public class equipoDetalle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idequipodetalle")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipodetalle;
	

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "marcaIdmarca")
	private Integer marcaidmarca;

	@Column(name = "modeloIdmodelo")
	private Integer modeloidmodelo;
	
	@Column(name = "tipoIdtipo")
	private Integer tipoidtipo;


	

	
}
