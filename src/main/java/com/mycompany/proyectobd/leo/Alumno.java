/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd.leo;

import com.mycompany.proyectobd.Conexion;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonel
 */
public class Alumno {
    // Conexion con = new Conexion();
    // zona de declaracion de variables
    private int id_alumno; // Id del alumno por lo general se genera de forma automatica
    private String nombre_alumno;
    private String matricula; // matricula del alumno
    private int faltas; // conteo de cuantas faltas lleva
    private int id_beca; // beca en la que esta asignado

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getId_beca() {
        return id_beca;
    }

    public void setId_beca(int id_beca) {
        this.id_beca = id_beca;
    }

    public void list(JTable tabla_alumnos) {
        Conexion con = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("Id alumno");
        modelo.addColumn("Nombre del alumno");
        modelo.addColumn("Matricula");
        modelo.addColumn("Faltas");
        modelo.addColumn("Tipo de beca");

        tabla_alumnos.setModel(modelo);
        sql = "select id_alumno,nombre_alumno,matricula,faltas, id_beca from alumnos;"; // el texto de la consola

        String[] datos = new String[5];
        Statement st;
        try {
            st = con.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tabla_alumnos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

    public void seleccionar_usuario(JTable tabla_alumnos, JTextField jTextField1_id, JTextField jTextField1_nombre,
            JTextField jTextField1_matricula, JTextField jTextField1_Faltas, JTextField jTextField1_beca) {
        try {
            int fila = tabla_alumnos.getSelectedRow();

            if (fila >= 0) {
                jTextField1_id.setText(tabla_alumnos.getValueAt(fila, 0).toString());
                jTextField1_nombre.setText(tabla_alumnos.getValueAt(fila, 1).toString());
                jTextField1_matricula.setText(tabla_alumnos.getValueAt(fila, 2).toString());
                jTextField1_Faltas.setText(tabla_alumnos.getValueAt(fila, 3).toString());
                String valor = tabla_alumnos.getValueAt(fila, 4).toString();
                if (valor.equals("1")) {
                    jTextField1_beca.setText("Alimenticia");
                } else {
                    jTextField1_beca.setText(tabla_alumnos.getValueAt(fila, 4).toString());
                }

            } else {
                JOptionPane.showMessageDialog(null, "FILA CORRECTAMENTE SELECCIONADA");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO SELECCIONAR LA FILA DESEADA" + e.toString());
        }
    }

    public void clear(JTable tabla_alumnos, JTextField jTextField1_id, JTextField jTextField1_nombre,
            JTextField jTextField1_matricula, JTextField jTextField1_Faltas, JTextField jTextField1_beca) {
        jTextField1_id.setText(" ");
        jTextField1_nombre.setText(" ");
        jTextField1_matricula.setText(" ");
        jTextField1_Faltas.setText(" ");
        jTextField1_beca.setText(" ");
    }

    public void insertar_alumno(JTextField jTextField1_nombre, JTextField jTextField1_matricula, int comboBox) {
        Conexion objetoConexion = new Conexion();
        setNombre_alumno(jTextField1_nombre.getText());
        setMatricula(jTextField1_matricula.getText());
        setFaltas(0);
        setId_beca(comboBox + 1);
        String consulta = "INSERT INTO alumnos (nombre_alumno, matricula, faltas, id_beca) VALUES (?,?,?,?);";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_alumno());
            cs.setString(2, getMatricula());
            cs.setInt(3, getFaltas());
            cs.setLong(4, getId_beca());
            cs.execute();
            JOptionPane.showMessageDialog(null, "USUARIO INGRESADO CORRECTAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR AL USUARIO CORRECTAMENTE" + e.toString());
        }
    }

    public void modificar_alumno(JTextField jTextField1_id, JTextField jTextField1_nombre,
            JTextField jTextField1_matricula, JTextField jTextField1_Faltas, JTextField jTextField1_beca) {
        /*
         * private int id_alumno; //Id del alumno por lo general se genera de forma
         * automatica
         * private String nombre_alumno;
         * private String matricula; //matricula del alumno
         * private int faltas; //conteo de cuantas faltas lleva
         * private int id_beca;
         */
        setId_alumno(Integer.parseInt(jTextField1_id.getText()));
        setNombre_alumno(jTextField1_nombre.getText());
        setMatricula(jTextField1_matricula.getText());
        setFaltas(Integer.parseInt(jTextField1_Faltas.getText()));
        String aux = (jTextField1_beca.getText());
        if (aux.equals("Alimenticia")) {
            setId_beca(1);
        } else {
            setId_beca(2);
        }

        // setNickname(nickname_recibido.getText());
        // setEmail(email_recibido.getText());

        // setFecha_nacimiento(Date.valueOf(fecha_nac_recibida.getText()));
        Conexion objetoConexion = new Conexion();

        String consulta = "UPDATE alumnos SET nombre_alumno=?, matricula=?, faltas=?,id_beca=? WHERE alumnos.id_alumno=?; "; // donde
                                                                                                                             // va
                                                                                                                             // a
                                                                                                                             // estar
                                                                                                                             // guardada
                                                                                                                             // la
                                                                                                                             // consulta
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setString(1, getNombre_alumno());
            cs.setString(2, getMatricula());
            cs.setInt(3, getFaltas());
            cs.setInt(4, getId_beca());
            cs.setInt(5, getId_alumno());
            cs.execute();

            JOptionPane.showMessageDialog(null, "USUARIO MODIFICADO CORRECTAMENTE");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR AL USUARIO SELECCIONADO" + e.toString());
        }

    }

    public void listar_becas(JComboBox comboBox) {
        // Obtener los datos de la tabla "becas"
        Conexion con = new Conexion();
        String consulta = "SELECT tipo_beca FROM becas";

        // Agregar los datos al modelo del combo
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

        Statement st;
        try {
            st = con.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                modeloCombo.addElement(rs.getString(1));
            }
            comboBox.setModel(modeloCombo); // Establecer el modelo del combo recibido como parámetro
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

}
