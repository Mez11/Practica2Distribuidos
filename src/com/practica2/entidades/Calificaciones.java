package com.practica2.entidades;

/**
 *
 * @author Omar
 */
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
@Table(name = "alumno")
public class Calificaciones implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCalificaciones;
    private double puntaje;

    /**
     * @return the idCalificaciones
     */
    public long getMatricula() {
        return idCalificaciones;
    }

    /**
     * @param idCalificaciones the idCalificaciones to set
     */
    public void setMatricula(long idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    /**
     * @return the puntaje
     */
    public double getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getMatricula() + " ]";
    }
    
}
