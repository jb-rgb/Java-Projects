/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectobd.leo;
import java.time.LocalDate;
import java.sql.Date;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Leonel
 */
public class asistencia_alumno extends javax.swing.JFrame {

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    /**
     * Creates new form asistencia_alumno
     */
    public void setId(int id) {
        this.id = id;
    }

     private String matricula;
     private int id;


    public asistencia_alumno(String matricula, int id) {
        
        initComponents();
        
        //jTextField1_name.setText(matricula);
        this.setMatricula(matricula);
        this.setId(id);
        this.setLocationRelativeTo(null);
        jTextField1_fecha.setEditable(false); // Opción 2
        LocalDate fechaHoy = LocalDate.now();

        // Formatear la fecha en el formato deseado
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFecha);

        // Asignar la fecha al JTextField
        jTextField1_fecha.setText(fechaFormateada);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1_fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1_opciones = new javax.swing.JComboBox<>();
        jButton1_aceptar = new javax.swing.JButton();
        jButton2_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1_comida = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fecha");

        jTextField1_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_fechaActionPerformed(evt);
            }
        });

        jLabel2.setText("Asistio");

        jComboBox1_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        jButton1_aceptar.setText("Aceptar");
        jButton1_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_aceptarActionPerformed(evt);
            }
        });

        jButton2_cancelar.setText("Cancelar");
        jButton2_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_cancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        jComboBox1_comida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almuerzo", "Comida" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_aceptar)
                        .addGap(125, 125, 125)
                        .addComponent(jButton2_cancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1_comida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1_opciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_aceptar)
                    .addComponent(jButton2_cancelar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_fechaActionPerformed
        
    }//GEN-LAST:event_jTextField1_fechaActionPerformed

    private void jButton2_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2_cancelarActionPerformed

    private void jButton1_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_aceptarActionPerformed
        Alumno alo = new Alumno();
        alo.insertar_asistencia(jTextField1_fecha,  String.valueOf(jComboBox1_opciones.getSelectedItem()), String.valueOf(jComboBox1_comida.getSelectedItem()), getMatricula(), getId());
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(asistencia_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistencia_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistencia_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistencia_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asistencia_alumno("",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_aceptar;
    private javax.swing.JButton jButton2_cancelar;
    private javax.swing.JComboBox<String> jComboBox1_comida;
    private javax.swing.JComboBox<String> jComboBox1_opciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1_fecha;
    // End of variables declaration//GEN-END:variables
}
