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
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String email;
	
	@Column(name = "nombre")
	private String nombre;


	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "password")
	private String password;
	

	@Column(name = "ubicacion_idubicacion")
	private String ubicacionidubicacion;


	
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}


	public void setUbicacionidubicacion(String ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
	}

	
	
}
