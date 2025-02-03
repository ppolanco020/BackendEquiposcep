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
@Table(name="procesador")


public class Procesador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idprocesador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idprocesador;
	
	
	@Column(name = "procesador")
	private String procesador;
	


	public Integer getIdprocesador() {
		return idprocesador;
	}

	public void setIdprocesador(Integer idprocesador) {
		this.idprocesador = idprocesador;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	
	


}
