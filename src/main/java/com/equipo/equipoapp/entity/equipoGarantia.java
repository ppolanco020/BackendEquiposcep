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
@Table(name="equipo_garantia")


public class equipoGarantia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idequipoGarantia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoubicacion;
	
	@Column(name = "inicio")
	private String inicio;

	@Column(name = "fin")
	private String fin;

	@Column(name = "equipoSicoin")
	private String equiposicoin;

	public Integer getIdequipoubicacion() {
		return idequipoubicacion;
	}

	public void setIdequipoubicacion(Integer idequipoubicacion) {
		this.idequipoubicacion = idequipoubicacion;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getEquiposicoin() {
		return equiposicoin;
	}

	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	

	


	
}
