/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobd;

/**
 *
 * @author hp
 */
public class Eventoframe extends javax.swing.JFrame {

    /**
     * Creates new form Eventoframe
     */
    public Eventoframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_eventos = new javax.swing.JTable();
        jLabelNombreE = new javax.swing.JLabel();
        jLabelFechaE = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelLugarE = new javax.swing.JLabel();
        jLabelMenuId = new javax.swing.JLabel();
        jTextFieldNombreEvento1 = new javax.swing.JTextField();
        jTextFieldFechaEvento1 = new javax.swing.JTextField();
        jTextFieldDescripcionE2 = new javax.swing.JTextField();
        jTextFieldLugarEvento2 = new javax.swing.JTextField();
        jTextFieldIdEvento = new javax.swing.JTextField();
        jButtonClearEvento = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_eventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_eventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_eventos);

        jLabelNombreE.setText("Nombre del evento:");

        jLabelFechaE.setText("Fecha evento:");

        jLabelDescripcion.setText("Descripcion del evento");

        jLabelLugarE.setText("Lugar del evento:");

        jLabelMenuId.setText("Menu id");

        jTextFieldNombreEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreEvento1ActionPerformed(evt);
            }
        });

        jTextFieldFechaEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaEvento1ActionPerformed(evt);
            }
        });

        jTextFieldDescripcionE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionE2ActionPerformed(evt);
            }
        });

        jButtonClearEvento.setText("Limpiar");
        jButtonClearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearEventoActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");

        jButtonEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNombreE)
                            .addComponent(jLabelFechaE)
                            .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLugarE)
                            .addComponent(jLabelMenuId)
                            .addComponent(jButtonClearEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreEvento1)
                            .addComponent(jTextFieldFechaEvento1)
                            .addComponent(jTextFieldDescripcionE2)
                            .addComponent(jTextFieldLugarEvento2)
                            .addComponent(jTextFieldIdEvento)
                            .addComponent(jModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreE)
                            .addComponent(jTextFieldNombreEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaE)
                            .addComponent(jTextFieldFechaEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescripcion)
                            .addComponent(jTextFieldDescripcionE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLugarE)
                            .addComponent(jTextFieldLugarEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMenuId)
                            .addComponent(jTextFieldIdEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClearEvento)
                            .addComponent(jModificar))
                        .addGap(31, 31, 31)
                        .addComponent(jButtonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaEvento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaEvento1ActionPerformed

    private void jTextFieldDescripcionE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionE2ActionPerformed

    private void jButtonClearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearEventoActionPerformed

    private void tabla_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_eventosMouseClicked
        // TODO add your handling code here:
         
        Evento eventoSelecionado = new Evento();
     
        
        eventoSelecionado.selecionaEvento(tabla_eventos,jTextFieldNombreEvento1,jTextFieldDescripcionE2, jTextFieldFechaEvento1,jTextFieldLugarEvento2 ,jTextFieldIdEvento); 
        
        
    }//GEN-LAST:event_tabla_eventosMouseClicked

    private void jTextFieldNombreEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreEvento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreEvento1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eventoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eventoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eventoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eventoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eventoframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClearEvento;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFechaE;
    private javax.swing.JLabel jLabelLugarE;
    private javax.swing.JLabel jLabelMenuId;
    private javax.swing.JLabel jLabelNombreE;
    private javax.swing.JButton jModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDescripcionE2;
    private javax.swing.JTextField jTextFieldFechaEvento1;
    private javax.swing.JTextField jTextFieldIdEvento;
    private javax.swing.JTextField jTextFieldLugarEvento2;
    private javax.swing.JTextField jTextFieldNombreEvento1;
    private javax.swing.JTable tabla_eventos;
    // End of variables declaration//GEN-END:variables
}
