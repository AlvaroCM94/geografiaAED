package org.alvaro.geografia.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlocalidad;
	private String nombre;
	private int poblacion;
	
	public Localidad(int idlocalidad, String nombre, int poblacion) {
		super();
		this.idlocalidad = idlocalidad;
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	public Localidad(){}

	public int getIdLocalidad() {
		return idlocalidad;
	}

	public void setIdLocalidad(int idlocalidad) {
		this.idlocalidad = idlocalidad;
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

	
}
