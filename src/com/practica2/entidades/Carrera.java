package com.practica2.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "carrera")
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrera;
    private String nombreCarrera;
    private int duracion;

    /**
     * @return the idCarrera
     */
    public int getIdCarrera() {
        return idCarrera;
    }

    /**
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * @return the nombreCarrera
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * @param nombreCarrera the nombreCarrera to set
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdCarrera() + " ]";
    }
}
