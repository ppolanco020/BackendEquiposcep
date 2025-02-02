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
@Table(name="centralconsejo")


public class centralConsejo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idcentralconsejo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idcentralconsejo;
	
	@Column(name = "centralconsejo")
	private String centralconsejo;

	public Integer getIdcentralconsejo() {
		return idcentralconsejo;
	}

	public void setIdcentralconsejo(Integer idcentralconsejo) {
		this.idcentralconsejo = idcentralconsejo;
	}

	public String getCentralconsejo() {
		return centralconsejo;
	}

	public void setCentralconsejo(String centralconsejo) {
		this.centralconsejo = centralconsejo;
	}



	
}
