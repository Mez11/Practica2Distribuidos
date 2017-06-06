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
@Table(name = "alumno")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matricula;
    private String nombreAlumno;
    private String paternoAlumno;
    private String maternoAlumno;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    private String calle;
    private String colonia;
    private int numero;
    private long codigoPostal;
    private char sexo;
    private String eMail;

    /**
     * @return the matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nombreAlumno
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * @param nombreAlumno the nombreAlumno to set
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * @return the paternoAlumno
     */
    public String getPaternoAlumno() {
        return paternoAlumno;
    }

    /**
     * @param paternoAlumno the paternoAlumno to set
     */
    public void setPaternoAlumno(String paternoAlumno) {
        this.paternoAlumno = paternoAlumno;
    }

    /**
     * @return the maternoAlumno
     */
    public String getMaternoAlumno() {
        return maternoAlumno;
    }

    /**
     * @param maternoAlumno the maternoAlumno to set
     */
    public void setMaternoAlumno(String maternoAlumno) {
        this.maternoAlumno = maternoAlumno;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the codigoPostal
     */
    public long getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getMatricula() + " ]";
    }
    
}
