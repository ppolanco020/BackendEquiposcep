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
@Table(name="usuario_ubicacion")


public class usuarioUbicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idusuarioUbicacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idusuarioubicacion;
	

	@Column(name = "ubicacionIdubicacion")
	private String ubicacionidubicacion;

	@Column(name = "usuarioEmail")
	private String usuarioemail;

	public Integer getIdusuarioubicacion() {
		return idusuarioubicacion;
	}

	public void setIdusuarioubicacion(Integer idusuarioubicacion) {
		this.idusuarioubicacion = idusuarioubicacion;
	}

	public String getUbicacionidubicacion() {
		return ubicacionidubicacion;
	}

	public void setUbicacionidubicacion(String ubicacionidubicacion) {
		this.ubicacionidubicacion = ubicacionidubicacion;
	}

	public String getUsuarioemail() {
		return usuarioemail;
	}

	public void setUsuarioemail(String usuarioemail) {
		this.usuarioemail = usuarioemail;
	}

	



	
}
