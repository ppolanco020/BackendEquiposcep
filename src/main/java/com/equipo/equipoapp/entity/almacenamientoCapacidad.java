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
@Table(name="almacenamiento_capacidad")


public class almacenamientoCapacidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */
	
	@Id
	@Column(name = "idalmacenamientoCapacidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idalmacenamientocapacidad;
	
	
	@Column(name = "capacidad")
	private String capacidad;


	public Integer getIdalmacenamientocapacidad() {
		return idalmacenamientocapacidad;
	}


	public void setIdalmacenamientocapacidad(Integer idalmacenamientocapacidad) {
		this.idalmacenamientocapacidad = idalmacenamientocapacidad;
	}


	public String getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	


}
