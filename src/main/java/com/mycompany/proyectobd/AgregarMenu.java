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
public class AgregarMenu extends javax.swing.JFrame {

    /**
     * Creates new form AgregarMenu
     */
    public AgregarMenu() {
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

        jLabelNombreMenu = new javax.swing.JLabel();
        jButtonIngresarMenu = new javax.swing.JButton();
        jTextFieldNombreMenu = new javax.swing.JTextField();
        jLabelPrecioMenu = new javax.swing.JLabel();
        jTextFieldPrecioMenu = new javax.swing.JTextField();
        jLabelDescripcionMenu = new javax.swing.JLabel();
        jTextFieldDescripcionMenu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroPlatillos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldId_Evento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombreMenu.setText("Nombre menu:");

        jButtonIngresarMenu.setText("Nuevo menu");
        jButtonIngresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarMenuActionPerformed(evt);
            }
        });

        jLabelPrecioMenu.setText("Precio del menu:");

        jLabelDescripcionMenu.setText("Descripcion: ");

        jTextFieldDescripcionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de platillos : ");

        jTextFieldNumeroPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroPlatillosActionPerformed(evt);
            }
        });

        jLabel2.setText("Evento relacionado: ");

        jTextFieldId_Evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId_EventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecioMenu)
                    .addComponent(jLabelNombreMenu)
                    .addComponent(jLabelDescripcionMenu)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombreMenu)
                            .addComponent(jTextFieldPrecioMenu, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumeroPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescripcionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId_Evento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(87, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButtonIngresarMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreMenu))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioMenu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescripcionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescripcionMenu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumeroPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldId_Evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButtonIngresarMenu)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroPlatillosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroPlatillosActionPerformed

    private void jTextFieldId_EventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId_EventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId_EventoActionPerformed

    private void jTextFieldDescripcionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionMenuActionPerformed

    private void jButtonIngresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarMenuActionPerformed

        // TODO add your handling code here:
        MenuEvento nuevoMenu = new MenuEvento();
        nuevoMenu.guardarMenu(jTextFieldNombreMenu, jTextFieldPrecioMenu, jTextFieldDescripcionMenu, jTextFieldNumeroPlatillos, jTextFieldId_Evento);
    }//GEN-LAST:event_jButtonIngresarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDescripcionMenu;
    private javax.swing.JLabel jLabelNombreMenu;
    private javax.swing.JLabel jLabelPrecioMenu;
    private javax.swing.JTextField jTextFieldDescripcionMenu;
    private javax.swing.JTextField jTextFieldId_Evento;
    private javax.swing.JTextField jTextFieldNombreMenu;
    private javax.swing.JTextField jTextFieldNumeroPlatillos;
    private javax.swing.JTextField jTextFieldPrecioMenu;
    // End of variables declaration//GEN-END:variables
}
