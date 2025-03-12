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
@Table(name="equipo_ram")


public class equipoRam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idequipoRam")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequiporam;
	
	@Column(name = "capacidad")
	private Integer capacidad;

	@Column(name = "equipoSicoin")
	private String equiposicoin;
	
	@Column(name = "ramCapacidadIdramCapacidad")
	private String ramcapacidadidramcapacidad;
	
	@Column(name = "ramTipoIdramTipo")
	private String ramtipoidramtipo;

	public Integer getIdequiporam() {
		return idequiporam;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getEquiposicoin() {
		return equiposicoin;
	}

	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	public String getRamcapacidadidramcapacidad() {
		return ramcapacidadidramcapacidad;
	}

	public void setRamcapacidadidramcapacidad(String ramcapacidadidramcapacidad) {
		this.ramcapacidadidramcapacidad = ramcapacidadidramcapacidad;
	}

	public String getRamtipoidramtipo() {
		return ramtipoidramtipo;
	}

	public void setRamtipoidramtipo(String ramtipoidramtipo) {
		this.ramtipoidramtipo = ramtipoidramtipo;
	}

	public void setIdequiporam(Integer idequiporam) {
		this.idequiporam = idequiporam;
	}

	
}
