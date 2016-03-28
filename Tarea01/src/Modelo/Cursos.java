/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Keren
 */
public class Cursos {
    
    private String nombreCurso;
    private String siglasCurso;
    private String creditos;

    public Cursos(String nombreCurso, String siglasCurso, String creditos) {
        this.nombreCurso = nombreCurso;
        this.siglasCurso = siglasCurso;
        this.creditos = creditos;
    }

    public Cursos() {
    }

    
    /**
     * @return the cedula
     */
    public String getnombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the cedula to set
     */
    public void setnombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the nombreCompleto
     */
    public String getsiglasCurso() {
        return siglasCurso;
    }

    /**
     * @param siglasCurso the nombreCompleto to set
     */
    public void setsiglasCurso(String siglasCurso) {
        this.siglasCurso = siglasCurso;
    }

    /**
     * @return the direccion
     */
    public String getcreditos() {
        return creditos;
    }

    /**
     * @param creditos the direccion to set
     */
    public void setcreditos(String creditos) {
        this.creditos = creditos;
    }
    
    public String getInformacion()
    {
        return "Nombre del curso: "+nombreCurso+"Siglas del curso: "+siglasCurso+"Cantidad de créditos: "+creditos;
    }

    String getCreditos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSiglasCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getNombreCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombreCurso(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSiglasCurso(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCreditos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
