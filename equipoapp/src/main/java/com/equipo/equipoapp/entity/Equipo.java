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

	@Column(name = "procesadorIdprocesador")
	private String procesadoridprocesador;
	
	@Column(name = "marcaIdmarca")
	private String marcaidmarca;
	
	@Column(name = "ramIdram")
	private String ramidram;

	@Column(name = "serie")
	private String serie;
	
	@Column(name = "estadoIdestado")
	private Integer estadoidestado;
	
	@Column(name = "inicioGarantia")
	private String iniciogarantia;

	@Column(name = "antiguedad")
	private Integer antiguedad;
	
	@Column(name = "ubicacionIdubicacion")
	private String ubicacionidubicacion;
	
	@Column(name = "fechaActualizacion")
	private String fechaactualizacion;


	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "marcaidmarca")
			private List<marcaModelo> marcamodelo;
	
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

	public String getProcesadoridprocesador() {
		return procesadoridprocesador;
	}

	public void setProcesadoridprocesador(String procesadoridprocesador) {
		this.procesadoridprocesador = procesadoridprocesador;
	}

	public String getMarcaidmarca() {
		return marcaidmarca;
	}

	public void setMarcaidmarca(String marcaidmarca) {
		this.marcaidmarca = marcaidmarca;
	}

	public String getRamidram() {
		return ramidram;
	}

	public void setRamidram(String ramidram) {
		this.ramidram = ramidram;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getEstadoidestado() {
		return estadoidestado;
	}

	public void setEstadoidestado(Integer estadoidestado) {
		this.estadoidestado = estadoidestado;
	}

	public String getIniciogarantia() {
		return iniciogarantia;
	}

	public void setIniciogarantia(String iniciogarantia) {
		this.iniciogarantia = iniciogarantia;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}

	public void setUbicacionidubicacion(String ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
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

	
	
}
