package com.equipo.equipoapp.entity;
import java.io.Serializable;
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


public class asignacionEquipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990595128143375776L;

	


	@Id
	@Column(name = "equipoSicoin")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String equiposicoin;
	
	

	
	@Column(name = "marcaIdmarca")
	private Integer marcaidmarca;




	public String getEquiposicoin() {
		return equiposicoin;
	}




	public void setEquiposicoin(String equiposicoin) {
		this.equiposicoin = equiposicoin;
	}




	public Integer getMarcaidmarca() {
		return marcaidmarca;
	}




	public void setMarcaidmarca(Integer marcaidmarca) {
		this.marcaidmarca = marcaidmarca;
	}
	







	
}
