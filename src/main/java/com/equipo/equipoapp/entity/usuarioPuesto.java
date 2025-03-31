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
@Table(name="usuario_puesto")


public class usuarioPuesto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */

	@Id
	@Column(name = "idusuarioPuesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idusuariopuesto;
	
	
	@Column(name = "usuarioIdusuario")
	private String usuario_idusuario;
	
	@Column(name = "puestoIdpuesto")
	private String puestoidpuesto;

	public Integer getIdusuariopuesto() {
		return idusuariopuesto;
	}

	public void setIdusuariopuesto(Integer idusuariopuesto) {
		this.idusuariopuesto = idusuariopuesto;
	}

	public String getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(String usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}

	public String getPuestoidpuesto() {
		return puestoidpuesto;
	}

	public void setPuestoidpuesto(String puestoidpuesto) {
		this.puestoidpuesto = puestoidpuesto;
	}
	
	
	
	
}
