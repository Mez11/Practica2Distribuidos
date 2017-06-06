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
@Table(name = "respuestas")
public class Respuestas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuestas;
    private String Respuesta;

    /**
     * @return the idRespuestas
     */
    public int getIdRespuestas() {
        return idRespuestas;
    }

    /**
     * @param idRespuestas the idRespuestas to set
     */
    public void setIdRespuestas(int idRespuestas) {
        this.idRespuestas = idRespuestas;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdRespuestas() + " ]";
    }
}
