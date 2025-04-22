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
@Table(name="usuario")


public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "email")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String email;
	
	
	
	@Column(name = "nombre")
	private String nombre;


	@Column(name = "puestoIdpuesto")
	private Integer puestoidpuesto;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "ubicacionIdubicacion")
	private Integer ubicacionidubicacion;
	
	@Column(name = "usuarioActivo")
	private Integer usuarioactivo;



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuestoidpuesto() {
		return puestoidpuesto;
	}

	public void setPuestoidpuesto(Integer puestoidpuesto) {
		this.puestoidpuesto = puestoidpuesto;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}

	public void setUbicacionidubicacion(Integer ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
	}

	public Integer getUsuarioactivo() {
		return usuarioactivo;
	}

	public void setUsuarioactivo(Integer usuarioactivo) {
		this.usuarioactivo = usuarioactivo;
	}





	
	
	
}

