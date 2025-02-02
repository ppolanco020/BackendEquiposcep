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
@Table(name="marca")


public class Marca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4169381654194846293L;


	/**
	 * 
	 */



	@Id
	@Column(name = "idmarca")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private String idmarca;
	
	
	@Column(name = "marca")
	private String marca;
	

	



	public String getIdmarca() {
		return idmarca;
	}




	public void setIdmarca(String idmarca) {
		this.idmarca = idmarca;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}







	


	
	
}
