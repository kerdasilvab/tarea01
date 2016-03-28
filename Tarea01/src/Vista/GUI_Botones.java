/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_MantenimientoCursos;
import Controlador.Controlador_FRM_MantenimientoEstudiantes;

/**
 *
 * @author Keren
 */
public class GUI_Botones extends javax.swing.JPanel {
    private Controlador_FRM_MantenimientoEstudiantes controlador;
Controlador_FRM_MantenimientoCursos controlador1;
    /**
     * Creates new form GUI_Botones
     */
    public GUI_Botones() {
        initComponents();
    }
    public void agregarEventos(Controlador_FRM_MantenimientoEstudiantes controlador)
    {
       this.controlador= controlador;
       this.btn_buscar.addActionListener(controlador);
       this.btn_Agregar.addActionListener(controlador);
       this.btn_Modificar.addActionListener(controlador);
       this.btn_Eliminar.addActionListener(controlador);
    }
    
    public void agregarEventos(Controlador_FRM_MantenimientoCursos controlador1)
    {
       this.controlador1= controlador1;
       this.btn_buscar.addActionListener(controlador1);
       this.btn_Agregar.addActionListener(controlador1);
       this.btn_Modificar.addActionListener(controlador1);
       this.btn_Eliminar.addActionListener(controlador1);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setActionCommand("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_Agregar.setActionCommand("Agregar");

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_Modificar.setActionCommand("Modificar");

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_Eliminar.setActionCommand("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_buscar.getAccessibleContext().setAccessibleName("Buscar");
        btn_Agregar.getAccessibleContext().setAccessibleName("Agregar");
        btn_Modificar.getAccessibleContext().setAccessibleName("Modificar");
        btn_Eliminar.getAccessibleContext().setAccessibleName("Eliminar");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_buscar;
    // End of variables declaration//GEN-END:variables
}
