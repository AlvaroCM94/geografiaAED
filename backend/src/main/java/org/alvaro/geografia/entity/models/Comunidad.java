package org.alvaro.geografia.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comunidadautonoma")
public class Comunidad implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComunidad;
	private String nombre;
	private int poblacion;
	private int superficie;
	private Provincia fkPostal;
	
	public Comunidad(int idComunidad, String nombre, int poblacion, int superficie, Provincia fkPostal) {
		super();
		this.idComunidad = idComunidad;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.fkPostal = fkPostal;
	}
	
	public Comunidad(){}

	public int getIdComunidad() {
		return idComunidad;
	}

	public void setIdComunidad(int idComunidad) {
		this.idComunidad = idComunidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public Provincia getFkPostal() {
		return fkPostal;
	}

	public void setFkPostal(Provincia fkPostal) {
		this.fkPostal = fkPostal;
	}
	
	
}
