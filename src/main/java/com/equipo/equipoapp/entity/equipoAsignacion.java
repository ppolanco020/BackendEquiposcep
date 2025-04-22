package com.equipo.equipoapp.entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.equipo.equipoapp.entity.Marca;

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
@Table(name="equipo_asignacion")


public class equipoAsignacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990595128143375776L;

	


	@Id
	@Column(name = "idequipoAsignacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idequipoasignacion;
	

	@Column(name = "fechaAsignacion")
	private Date fechaasignacion;
	
	@Column(name = "equipoSicoin")
	private String equiposicoin;

	@Column(name = "usuarioEmail")
	private String usuarioemail;


	public Integer getIdequipoasignacion() {
		return idequipoasignacion;
	}

	public void setIdequipoasignacion(Integer idequipoasignacion) {
		this.idequipoasignacion = idequipoasignacion;
	}

	public Date getFechaasignacion() {
		return fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	public String getEquiposicoin() {
		return equiposicoin;
	}

	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}

	public String getUsuarioemail() {
		return usuarioemail;
	}

	public void setUsuarioemail(String usuarioemail) {
		this.usuarioemail = usuarioemail;
	}

	

	
}
