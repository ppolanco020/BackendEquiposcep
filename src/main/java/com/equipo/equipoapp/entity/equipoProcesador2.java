package com.equipo.equipoapp.entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.equipo.equipoapp.entity.Marca;

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
@Table(name="equipo_procesador")


public class equipoProcesador2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990595128143375776L;

	


	@Id
	@Column(name = "idequipoProcesador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoprocesador;
	

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "generacion")
	private String generacion;
	
	@Column(name = "velocidad")
	private String velocidad;


	@Column(name = "procesadorIdprocesador")
	private Integer procesadoridprocesador;


	public Integer getIdequipoprocesador() {
		return idequipoprocesador;
	}


	public void setIdequipoprocesador(Integer idequipoprocesador) {
		this.idequipoprocesador = idequipoprocesador;
	}


	public String getEquiposicoin() {
		return equiposicoin;
	}


	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}


	public String getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}


	public String getGeneracion() {
		return generacion;
	}


	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}


	public Integer getProcesadoridprocesador() {
		return procesadoridprocesador;
	}


	public void setProcesadoridprocesador(Integer procesadoridprocesador) {
		this.procesadoridprocesador = procesadoridprocesador;
	}


	
}
