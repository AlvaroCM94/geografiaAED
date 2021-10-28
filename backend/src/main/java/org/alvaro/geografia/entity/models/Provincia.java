package org.alvaro.geografia.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codpostal;
	private String nombre;
	private int poblacion;
	private String superficie;
	private Localidad fklocalidad;
	
	public Provincia(int codpostal, String nombre, int poblacion, String superficie, Localidad fklocalidad) {
		super();
		this.codpostal = codpostal;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.fklocalidad = fklocalidad;
	}
	
	public Provincia(){}

	public int getCodPostal() {
		return codpostal;
	}

	public void setCodPostal(int codpostal) {
		this.codpostal = codpostal;
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

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public Localidad getFkLocalidad() {
		return fklocalidad;
	}

	public void setFkLocalidad(Localidad fklocalidad) {
		this.fklocalidad = fklocalidad;
	}
	
}
