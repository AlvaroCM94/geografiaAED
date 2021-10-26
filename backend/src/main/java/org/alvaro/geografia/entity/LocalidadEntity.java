package org.alvaro.geografia.entity;

import javax.persistence.*;

@Entity
@Table(name = "localidad", schema = "geografia", catalog = "")
public class LocalidadEntity {
    private int idLocalidad;
    private String nombre;
    private int poblacion;

    @Id
    @Column(name = "idLocalidad", nullable = false)
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "poblacion", nullable = false)
    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalidadEntity that = (LocalidadEntity) o;

        if (idLocalidad != that.idLocalidad) return false;
        if (poblacion != that.poblacion) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocalidad;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + poblacion;
        return result;
    }
}
