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
@Table(name="ram_capacidad")


public class ramCapacidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */


	@Id
	@Column(name = "idramCapacidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Integer idramcapacidad;
	
	
	@Column(name = "ram")
	private Integer ram;


	public Integer getIdramcapacidad() {
		return idramcapacidad;
	}


	public void setIdramcapacidad(Integer idramcapacidad) {
		this.idramcapacidad = idramcapacidad;
	}


	public Integer getRam() {
		return ram;
	}


	public void setRam(Integer ram) {
		this.ram = ram;
	}
	

	
	


}
