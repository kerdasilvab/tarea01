/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author Keren
 */
public class GUI_InformacionEstudiantes extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionEstudiantes
     */
    public GUI_InformacionEstudiantes() {
        initComponents();
    }
    public String[] devolverInformacion() 
    {
        String arreglo[];
        arreglo=new String [3];
        arreglo[0]=this.jt_Cedula.getText();
        arreglo[1]=this.jt_NombreCompleto.getText();
        arreglo[2]=this.jt_Direccion.getText();
        
        return arreglo;
    }
    public String devolverCedula()
    {
        return this.jt_Cedula.getText();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_NombreCompleto.setText(arreglo[0]);
        this.jt_Direccion.setText(arreglo[1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jt_Dirección = new javax.swing.JTextField();
        jl_Cedula = new javax.swing.JLabel();
        jl_NombreCompleto = new javax.swing.JLabel();
        jl_Direccion = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_NombreCompleto = new javax.swing.JTextField();
        btn_consultaRapida = new javax.swing.JButton();
        jt_Direccion = new javax.swing.JTextField();

        jt_Dirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_DirecciónActionPerformed(evt);
            }
        });

        jl_Cedula.setText("Cédula");

        jl_NombreCompleto.setText("Nombre Completo");

        jl_Direccion.setText("Dirección");

        jt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_CedulaActionPerformed(evt);
            }
        });

        jt_NombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NombreCompletoActionPerformed(evt);
            }
        });

        btn_consultaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Cedula)
                    .addComponent(jl_NombreCompleto)
                    .addComponent(jl_Direccion))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jt_Cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultaRapida)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_NombreCompleto)
                            .addComponent(jt_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_consultaRapida)
                    .addComponent(jl_Cedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreCompleto)
                    .addComponent(jt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Direccion)
                    .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_CedulaActionPerformed

    private void jt_NombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_NombreCompletoActionPerformed

    private void jt_DirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_DirecciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_DirecciónActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultaRapida;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Direccion;
    private javax.swing.JLabel jl_NombreCompleto;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_Dirección;
    private javax.swing.JTextField jt_NombreCompleto;
    // End of variables declaration//GEN-END:variables
}
