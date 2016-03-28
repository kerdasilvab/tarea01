/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Keren
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener{
    
    MetodosCursos metodos;
    FRM_MantenimientoCursos mantenimientoCursos;
    
    
    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCursos)
    {
        this.mantenimientoCursos= mantenimientoCursos;
        metodos= new MetodosCursos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            mantenimientoCursos.mostrarInformacion(metodos.consultarCurso(mantenimientoCursos.devolverNombreCurso()));
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarCurso(mantenimientoCursos.devolverInformacion());
            metodos.mostrarInformacionEstudiantes();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarCurso(mantenimientoCursos.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarCursoDelArray(mantenimientoCursos.devolverInformacion());
        }
    }
}
