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
	private int idcomunidad;
	private String nombre;
	private int poblacion;
	private int superficie;
	private Provincia fkpostal;
	
	public Comunidad(int idcomunidad, String nombre, int poblacion, int superficie, Provincia fkpostal) {
		super();
		this.idcomunidad = idcomunidad;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.fkpostal = fkpostal;
	}
	
	public Comunidad(){}

	public int getIdComunidad() {
		return idcomunidad;
	}

	public void setIdComunidad(int idcomunidad) {
		this.idcomunidad = idcomunidad;
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
		return fkpostal;
	}

	public void setFkPostal(Provincia fkpostal) {
		this.fkpostal = fkpostal;
	}
	
	
}
