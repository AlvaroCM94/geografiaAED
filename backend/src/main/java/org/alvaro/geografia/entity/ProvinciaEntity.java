package org.alvaro.geografia.entity;

import javax.persistence.*;

@Entity
@Table(name = "provincia", schema = "geografia", catalog = "")
public class ProvinciaEntity {
    private int codPostal;
    private String nombre;
    private int poblacion;
    private int superficie;

    @Id
    @Column(name = "codPostal", nullable = false)
    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
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

    @Basic
    @Column(name = "superficie", nullable = false)
    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvinciaEntity that = (ProvinciaEntity) o;

        if (codPostal != that.codPostal) return false;
        if (poblacion != that.poblacion) return false;
        if (superficie != that.superficie) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codPostal;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + poblacion;
        result = 31 * result + superficie;
        return result;
    }
}
