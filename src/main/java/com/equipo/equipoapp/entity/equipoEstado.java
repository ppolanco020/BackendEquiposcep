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


public class equipoEstado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idequipoEstado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoestado;
	
	@Column(name = "estadoEquipo")
	private String estadoequipo;
	
	@Column(name = "antiguedad")
	private Integer antiguedad;

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "estadoIdestado")
	private Integer estadoidestado;

	@Column(name = "equipoEstadoActivo")
	private Integer equipoestadoactivo;

	public Integer getIdequipoestado() {
		return idequipoestado;
	}

	public void setIdequipoestado(Integer idequipoestado) {
		this.idequipoestado = idequipoestado;
	}

	public String getEstadoequipo() {
		return estadoequipo;
	}

	public void setEstadoequipo(String estadoequipo) {
		this.estadoequipo = estadoequipo;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getEquiposicoin() {
		return equiposicoin;
	}

	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	public Integer getEstadoidestado() {
		return estadoidestado;
	}

	public void setEstadoidestado(Integer estadoidestado) {
		this.estadoidestado = estadoidestado;
	}

	public Integer getEquipoestadoactivo() {
		return equipoestadoactivo;
	}

	public void setEquipoestadoactivo(Integer equipoestadoactivo) {
		this.equipoestadoactivo = equipoestadoactivo;
	}

	

	
}
