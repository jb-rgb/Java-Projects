/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectobd.leo;

import com.mycompany.proyectobd.JDueño;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonel
 */
public class alumno_frame extends javax.swing.JFrame {

    /**
     * Creates new form alumno_frame
     */
    public alumno_frame() {
        initComponents();
        Alumno alumnos = new Alumno();
        alumnos.list(tabla_alumnos);
        this.setLocationRelativeTo(null);
        jTextField1_beca.setEditable(false);
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
        jTextField1_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_matricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Faltas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_beca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jTextField1_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_idActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jTextField1_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Matricula");

        jTextField1_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_matriculaActionPerformed(evt);
            }
        });

        jLabel4.setText("Faltas");

        jTextField1_Faltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_FaltasActionPerformed(evt);
            }
        });

        jLabel5.setText("Id_beca");

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_alumnos);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar cambios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar asistencia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Verificar asistencias");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Busqueda por matricula");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar Usuario");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Lista de alumnos con beca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_Faltas)
                            .addComponent(jTextField1_beca)
                            .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_nombre)
                            .addComponent(jTextField1_matricula))
                        .addGap(71, 71, 71))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1_Faltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1_beca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(21, 21, 21)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_idActionPerformed

    private void jTextField1_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nombreActionPerformed

    private void jTextField1_FaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_FaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_FaltasActionPerformed

    private void tabla_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnosMouseClicked
        jTextField1_id.setEnabled(false);
        Alumno alumnoSelecionado = new Alumno();
        alumnoSelecionado.seleccionarAlumno(tabla_alumnos, jTextField1_id, jTextField1_nombre, jTextField1_matricula, jTextField1_Faltas, jTextField1_beca);
<<<<<<< HEAD
=======

        //alumnoSelecionado.seleccionar_usuario(tabla_alumnos, jTextField1_id, jTextField1_nombre, jTextField1_matricula, jTextField1_Faltas, jTextField1_beca);

>>>>>>> main
    }//GEN-LAST:event_tabla_alumnosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Alumno alumnos = new Alumno();
        alumnos.clear(tabla_alumnos, jTextField1_id, jTextField1_nombre, jTextField1_matricula, jTextField1_Faltas, jTextField1_beca);
        alumnos.list(tabla_alumnos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        agregar_alumno jd = new agregar_alumno();
        jd.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            /*Alumno alumnos = new Alumno();
            alumnos.modificar_alumno(jTextField1_id, jTextField1_nombre, jTextField1_matricula, jTextField1_Faltas, jTextField1_beca);
            alumnos.list(tabla_alumnos);*/
       if (!jTextField1_matricula.getText().isEmpty()) {
        if (!jTextField1_id.getText().isEmpty()) {
            try {
                Alumno alumnos = new Alumno();
                alumnos.modificar_alumno(jTextField1_id, jTextField1_nombre, jTextField1_matricula, jTextField1_Faltas, jTextField1_beca);
                alumnos.list(tabla_alumnos);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un ID válido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un alumno");
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!jTextField1_matricula.getText().isEmpty()) {
        if (!jTextField1_id.getText().isEmpty()) {
            try {
                int id = Integer.parseInt(jTextField1_id.getText());
                asistencia_alumno jd = new asistencia_alumno(jTextField1_matricula.getText(), id);
                jd.setVisible(true); 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un ID válido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un alumno");
           }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          if (!jTextField1_matricula.getText().isEmpty()) {
        if (!jTextField1_id.getText().isEmpty()) {
            try {
                int id = Integer.parseInt(jTextField1_id.getText());
                asistencias_por_alumno jd = new asistencias_por_alumno( id,jTextField1_matricula.getText(), jTextField1_nombre.getText());
                jd.setVisible(true); 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un ID válido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un alumno");
           }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!jTextField1_matricula.getText().isEmpty()) {
            Alumno alumnos = new Alumno();
            alumnos.research(tabla_alumnos, jTextField1_matricula);
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa por lo menos un digito");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_matriculaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String alumno = jTextField1_nombre.getText();
        Alumno alumnos = new Alumno();
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a "+alumno+"?\n", "Confirmar actualización", JOptionPane.YES_NO_OPTION);
        if(!alumno.isEmpty()){
            if (respuesta == JOptionPane.YES_OPTION) {
                alumnos.eliminarAlumno(jTextField1_id);
                alumnos.list(tabla_alumnos);
            } else {
                // El usuario seleccionó "No" o cerró el cuadro de diálogo
                JOptionPane.showMessageDialog(null, "No eliminaran los  datos.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un usuario");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(alumno_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumno_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumno_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumno_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alumno_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1_Faltas;
    private javax.swing.JTextField jTextField1_beca;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField1_matricula;
    private javax.swing.JTextField jTextField1_nombre;
    private javax.swing.JTable tabla_alumnos;
    // End of variables declaration//GEN-END:variables
}
