/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Keren
 */
public class MetodosCursos {
 
    ArrayList <Cursos> arrayCursos;
        private Object nombreCurso;
    
    public MetodosCursos()
    {
        arrayCursos= new ArrayList <Cursos>();
    }
    
    public void agregarEstudiante(String informacion[])
    {
        Cursos temporal= new Cursos(informacion[0],informacion[1],informacion[2]);
        arrayCursos.add(temporal);
    }
    
    public void mostrarInformacionCursos()
    {
        Cursos temporal;
        temporal= arrayCursos.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    public String[] consultarCurso(String cedula)
    {
        String arregloDatos[]= new String[2];
        
        for(int contador=0;contador<arrayCursos.size();contador++)
        {
            if (arrayCursos.get(contador).getnombreCurso().equals(nombreCurso))
            {
                arregloDatos[0]= arrayCursos.get(contador).getSiglasCurso();
                arregloDatos[1]= arrayCursos.get(contador).getCreditos();
            }
        }
        return arregloDatos;
    }
    public void modificarCursos(String devolverInformacion[])
    {
        for(int i=0;i<arrayCursos.size();i++)
        {
            if(arrayCursos.get(i).getNombreCurso().equals(devolverInformacion[0]))
            {
                arrayCursos.get(i).setNombreCurso(devolverInformacion[0]);
                arrayCursos.get(i).setSiglasCurso(devolverInformacion[1]);
                arrayCursos.get(i).setCreditos(devolverInformacion[2]);
            }
           
        } JOptionPane.showMessageDialog(null,"Se modifico correctamente");
            
    }
    
    public void eliminarCursoDelArray(String informacion[])
    {
        
         
              for (int i = 0; i < arrayCursos.size(); i++) {
            if (arrayCursos.get(i).getNombreCurso().equals(informacion[0]))
            { 
                arrayCursos.remove(i);
                 JOptionPane.showMessageDialog(null, "El estudiante fué eliminado de forma correcta");
          
            }
        }
    }

    public void mostrarInformacionEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarCurso(String[] devolverInformacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void modificarCurso(String[] devolverInformacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
