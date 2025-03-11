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
@Table(name="ubicacion")


public class Ubicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idubicacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idubicacion;
	

	@Column(name = "ubicacion")
	private String ubicacion;


	@Column(name = "centralconsejo_idcentralconsejo")
	private Integer centralconsejoidcentralconsejo;
			
			


	public Integer getIdubicacion() {
		return idubicacion;
	}


	public void setIdubicacion(Integer idubicacion) {
		this.idubicacion = idubicacion;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public Integer getCentralconsejoidcentralconsejo() {
		return centralconsejoidcentralconsejo;
	}


	public void setCentralconsejoidcentralconsejo(Integer centralconsejoidcentralconsejo) {
		this.centralconsejoidcentralconsejo = centralconsejoidcentralconsejo;
	}




	
}
