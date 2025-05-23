package com.equipo.equipoapp.entity;
import java.io.Serializable;
import java.util.List;

import com.equipo.equipoapp.entity.equipoDetalle;

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
@Table(name="equipo")


public class Equipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990595128143375776L;

	
	@Id
	@Column(name = "sicoin")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String sicoin;
	
	
	@Column(name = "nombrehost")
	private String nombrehost;


	@Column(name = "serie")
	private String serie;
	
	
	
	@Column(name = "fechaActualizacion")
	private String fechaactualizacion;
	
	@Column(name = "equipoEstado")
	private Integer equipoestado;
	

	@Column(name = "equipoActivo")
	private Integer equipoactivo;
	
	
	@Column(name = "ubicacionIdubicacion")
	private Integer ubicacionidubicacion;


	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoAlmacenamiento> equipoalmacenamiento;


	public String getSicoin() {
		return sicoin;
	}


	public void setSicoin(String sicoin) {
		this.sicoin = sicoin;
	}


	public String getNombrehost() {
		return nombrehost;
	}


	public void setNombrehost(String nombrehost) {
		this.nombrehost = nombrehost;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public String getFechaactualizacion() {
		return fechaactualizacion;
	}


	public void setFechaactualizacion(String fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}


	public List<equipoAlmacenamiento> getEquipoalmacenamiento() {
		return equipoalmacenamiento;
	}


	public void setEquipoalmacenamiento(List<equipoAlmacenamiento> equipoalmacenamiento) {
		this.equipoalmacenamiento = equipoalmacenamiento;
	}




	public Integer getEquipoactivo() {
		return equipoactivo;
	}


	public void setEquipoactivo(Integer equipoactivo) {
		this.equipoactivo = equipoactivo;
	}


	public Integer getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}


	public void setUbicacionidubicacion(Integer ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
	}


	public Integer getEquipoestado() {
		return equipoestado;
	}


	public void setEquipoestado(Integer equipoestado) {
		this.equipoestado = equipoestado;
	}


	
	
	
	
	
	
	/*
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")
			private List<equipoDetalle> equipodetalle;
			
			
			
			
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoProcesador> equipoprocesador;
			
			
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoUbicacion> equipoubicacion;
			
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoEstado> equipoestado;
			
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoGarantia> equipogarantia;
	

	
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoRam> equiporam;
			*/

			
			
	
}
