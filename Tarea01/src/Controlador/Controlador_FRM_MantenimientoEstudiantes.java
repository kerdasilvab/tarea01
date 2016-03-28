/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Keren
 */
public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener{
    
    MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes= mantenimientoEstudiantes;
        metodos= new MetodosEstudiantes();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            mantenimientoEstudiantes.mostrarInformacion(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()));
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mostrarInformacionEstudiantes();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarEstudiantes(mantenimientoEstudiantes.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarEstudianteDelArray(mantenimientoEstudiantes.devolverInformacion());
        }
    }
    
}
