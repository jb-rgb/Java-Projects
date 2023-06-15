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
public class usuario {

    private String nombre_usuario;
    private String contrasena_usuario;
    private int tipo_usuario;
    private String correo_usuario;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public void crear_usuario(JTextField jTextField1_nombre, JTextField jTextField1_password,
            JTextField jTextField2_correo, int tipo_usuario) {
        Conexion objetoConexion = new Conexion();
           //validar los datos del usuario a ingresar  nombre
             String nombre = jTextField1_nombre.getText();
    String password = jTextField1_password.getText();
    String correo = jTextField2_correo.getText();
    int tipo = tipo_usuario + 1;
    
    // Validar los datos del usuario antes de ingresarlos a la base de datos
    if (nombre.isEmpty() || password.isEmpty() || correo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }else if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) { //correos validos: ejemplo@gmail.com , usuario_1@hotmail.com
        //realizar consulta de veriricacion de correo el pide 
        JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }else if (password.length() < 8) {  // Validar contraseña
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
       }else{
         //ingresar la informacion a la base de datos 
        String IngresarUsuarioConsulta = "INSERT INTO cafeteria.usuario (nombre_usuario, contrasena_usuario, tipo_usuario, correo_usuario) VALUES (?, ?, ?, ?);";
        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(IngresarUsuarioConsulta);
            cs.setString(1, getNombre_usuario());
            cs.setString(2, getContrasena_usuario());
            cs.setInt(3, getTipo_usuario());
            cs.setString(4, getCorreo_usuario());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Usuario creado con éxito");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR AL USUARIO CORRECTAMENTE" + e.toString());
        }
        
        
    }
    
   
    }
    public void listUsuario(JTable tabla_usuarios) {
        Conexion con = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("Id usuario");
        modelo.addColumn("Nombre de usuario ");
        modelo.addColumn("Contrasena");
        modelo.addColumn("Tipos de usuario");
        modelo.addColumn("Correo");

        tabla_usuarios.setModel(modelo);
        sql = "select id_usuario,nombre_usuario,contrasena_usuario,tipo_usuario,correo_usuario from usuario;"; // el texto de la consola

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
            tabla_usuarios.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        
        

    }
     public void research_usuario(JTable tabla_usuario, JTextField jTextField1_nombre) {
    Conexion con = new Conexion();
    DefaultTableModel modelo = new DefaultTableModel();

    String sql = "";
    modelo.addColumn("Id usuario");
    modelo.addColumn("Nombre de usuario ");
    modelo.addColumn("Contrasena");
    modelo.addColumn("Tipos de usuario");
    modelo.addColumn("Correo");

    tabla_usuario.setModel(modelo);
    
    // Obtener el texto ingresado en el jTextField1_nombre
    String nombreBusqueda = jTextField1_nombre.getText();
    
    // Consulta SQL modificada para incluir la búsqueda por nombre
    sql = "SELECT id_usuario,nombre_usuario,contrasena_usuario,tipo_usuario,correo_usuario from usuario WHERE nombre_usuario LIKE '%" + nombreBusqueda + "%';";

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
        tabla_usuario.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
   }

}
