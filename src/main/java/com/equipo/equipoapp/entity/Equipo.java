 package com.equipo.equipoapp.entity;
import java.io.Serializable;
import java.util.List;

import com.equipo.equipoapp.entity.marcaModelo;

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


	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")
			private List<equipoDetalle> marcamodelo;
			
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "equiposicoin")

			private List<equipoDetalle> equipoprocesador;
			
			
	
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

	public List<marcaModelo> getMarcamodelo() {
		return marcamodelo;
	}

	public void setMarcamodelo(List<marcaModelo> marcamodelo) {
		this.marcamodelo = marcamodelo;
	}

	public List<equipoDetalle> getEquipoprocesador() {
		return equipoprocesador;
	}

	public void setEquipoprocesador(List<equipoDetalle> equipoprocesador) {
		this.equipoprocesador = equipoprocesador;
	}


	
	
}
