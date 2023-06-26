/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectobd.socrucito;

import com.mycompany.proyectobd.JVendedor;

import com.mycompany.proyectobd.Conexion;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author socru
 */
public class Cobro_Alimento_Interfaz extends javax.swing.JFrame {
    public float totalCalculado;
    public float calculado;
    /**
     * Creates new form Cobro_Alimento_Interfaz
     */
    public Cobro_Alimento_Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno A", "Desayuno B", "Comida A", "Comida B" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jButton1.setText("Cobrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cobro de alimento");

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       String botones[]={"Cerrar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this,"Desea cerrar la ventana  alimentos","Titulo",0,0,null,botones,this);
        if(eleccion == JOptionPane.YES_OPTION){
            this.dispose();
        }else if(eleccion==JOptionPane.NO_OPTION){
            System.out.println("Se cancelo el cierre ");
           //JOptionPane.showConfirmDialog("pasa", evt);
        }     
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     // Crear una instancia de Producto
    Producto producto = new Producto();

    // Obtener los valores necesarios para llamar a mostrarTotal
    String tipoAlimento = (String) jComboBox1.getSelectedItem();
    int cantidad = Integer.parseInt((String) jComboBox2.getSelectedItem());

    // Llamar a mostrarTotal y obtener el total calculado
    JLabel labelTotal = jLabel1; // Usar el JLabel existente
    producto.mostrarTotal(tipoAlimento, cantidad, labelTotal);
    float total = Float.parseFloat(labelTotal.getText().replace("Total: ", ""));

    // Actualizar la etiqueta labelTotal con el total calculado
    calculado= total;
    labelTotal.setText("Total: " + total);
    totalCalculado = Float.parseFloat(labelTotal.getText().replace("Total: ", ""));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          // Obtener los valores seleccionados del ComboBox
        // Obtener los valores seleccionados del ComboBox
    String tipoAlimento = (String) jComboBox1.getSelectedItem();
    int cantidad = Integer.parseInt((String) jComboBox2.getSelectedItem());

    // Crear una instancia de la clase Conexion para establecer la conexión con la base de datos
    Conexion conexion = new Conexion();

    // Establecer la conexión con la base de datos
    Connection connection = conexion.establecerConexion();

    // Verificar si la conexión se estableció correctamente
    if (connection != null) {
        try {
            // Crear la consulta para aumentar la cantidad seleccionada en el elemento correspondiente de la base de datos
            String updateQuery = "";
            switch (tipoAlimento) {
                case "Desayuno A":
                    updateQuery = "UPDATE alimentos SET Desayuno_A = Desayuno_A + " + cantidad + ", total_vendidos = total_vendidos + " + cantidad;
                    break;
                case "Desayuno B":
                    updateQuery = "UPDATE alimentos SET Desayuno_B = Desayuno_B + " + cantidad + ", total_vendidos = total_vendidos + " + cantidad;
                    break;
                case "Comida A":
                    updateQuery = "UPDATE alimentos SET Comida_A = Comida_A + " + cantidad + ", total_vendidos = total_vendidos + " + cantidad;
                    break;
                case "Comida B":
                    updateQuery = "UPDATE alimentos SET Comida_B = Comida_B + " + cantidad + ", total_vendidos = total_vendidos + " + cantidad;
                    break;
            }

            // Crear un objeto Statement para ejecutar la consulta de actualización
            Statement statement = connection.createStatement();

            // Ejecutar la consulta de actualización
            int rowsAffected = statement.executeUpdate(updateQuery);

            // Verificar si la actualización fue exitosa
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Cobro correcto.");
            } else {
                JOptionPane.showMessageDialog(null,"Cobro erroneo.");
            }

            // Obtener el valor actual de precio_total desde la base de datos
            ResultSet resultSet = statement.executeQuery("SELECT precio_total FROM alimentos");
            resultSet.next();
            float precioTotalActual = resultSet.getFloat("precio_total");
            resultSet.close();
            float total = cantidad * precioTotalActual;

            // Sumar el valor de total al precio_total actual
            float nuevoPrecioTotal = precioTotalActual + total;

            // Actualizar el valor de precio_total en la base de datos
            String updateQueryPrecio = "UPDATE alimentos SET precio_total = " + calculado;
            int rowsAffectedPrecio = statement.executeUpdate(updateQueryPrecio);

            // Verificar si la actualización fue exitosa
            if (rowsAffectedPrecio > 0) {
                System.out.println("El precio_total se actualizó correctamente en la base de datos.");
            } else {
                System.out.println("No se realizaron cambios en la base de datos.");
            }

            // Cerrar el Statement
            statement.close();

            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    } else {
        System.out.println("No se pudo establecer la conexión con la base de datos.");
    }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cobro_Alimento_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cobro_Alimento_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cobro_Alimento_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cobro_Alimento_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cobro_Alimento_Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
