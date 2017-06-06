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
@Table(name = "preguntas")
public class Preguntas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    private String pregunta;

    /**
     * @return the idPregunta
     */
    public int getIdPregunta() {
        return idPregunta;
    }

    /**
     * @param idPregunta the idPregunta to set
     */
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdPregunta() + " ]";
    }
}
