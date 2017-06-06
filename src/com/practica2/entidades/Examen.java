package com.practica2.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "examen")
public class Examen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamen;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    /**
     * @return the idExamen
     */
    public int getIdExamen() {
        return idExamen;
    }

    /**
     * @param idExamen the idExamen to set
     */
    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdExamen() + " ]";
    }
}
