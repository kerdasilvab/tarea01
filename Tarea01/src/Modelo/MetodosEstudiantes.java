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
public class MetodosEstudiantes {
    
    ArrayList <Estudiante> arrayEstudiantes;
    
    public MetodosEstudiantes()
    {
        arrayEstudiantes= new ArrayList <Estudiante>();
    }
    
    public void agregarEstudiante(String informacion[])
    {
        Estudiante temporal= new Estudiante(informacion[0],informacion[1],informacion[2]);
        arrayEstudiantes.add(temporal);
    }
    
    public void mostrarInformacionEstudiantes()
    {
        Estudiante temporal;
        temporal= arrayEstudiantes.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    public String[] consultarEstudiante(String cedula)
    {
        String arregloDatos[]= new String[2];
        
        for(int contador=0;contador<arrayEstudiantes.size();contador++)
        {
            if (arrayEstudiantes.get(contador).getCedula().equals(cedula))
            {
                arregloDatos[0]= arrayEstudiantes.get(contador).getNombreCompleto();
                arregloDatos[1]= arrayEstudiantes.get(contador).getDireccion();
            }
        }
        return arregloDatos;
    }
    public void modificarEstudiantes(String devolverInformacion[])
    {
        for(int i=0;i<arrayEstudiantes.size();i++)
        {
            if(arrayEstudiantes.get(i).getCedula().equals(devolverInformacion[0]))
            {
                arrayEstudiantes.get(i).setCedula(devolverInformacion[0]);
                arrayEstudiantes.get(i).setNombreCompleto(devolverInformacion[1]);
                arrayEstudiantes.get(i).setDireccion(devolverInformacion[2]);
            }
           
        } JOptionPane.showMessageDialog(null,"Se modifico correctamente");
            
    }
    
    public void eliminarEstudianteDelArray(String informacion[])
    {
        
         
              for (int i = 0; i < arrayEstudiantes.size(); i++) {
            if (arrayEstudiantes.get(i).getCedula().equals(informacion[0]))
            { 
                arrayEstudiantes.remove(i);
                 JOptionPane.showMessageDialog(null, "El estudiante fué eliminado de forma correcta");
          
            }
        }
    }
}
