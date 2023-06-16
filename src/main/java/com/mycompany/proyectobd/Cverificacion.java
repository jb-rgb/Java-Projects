/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Cverificacion {
    
    public void Validar(String correo, String contrasena){
        Conexion con = new Conexion();
        
        String consulta = "SELECT * FROM usuario WHERE contrasena_usuario = '" + contrasena + "' AND correo_usuario = '" + correo + "'";
        Statement st ;
        
        try{
            
             st = con.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            if(rs.next()){//si existe el usuario 
                
                String correoU=rs.getString("correo_usuario");
                String passwordU = rs.getString("contrasena_usuario");
                int rol  = rs.getInt("tipo_usuario");
               
                if(rol==3){
                  System.out.println("es dueño");
                  JDueño dueno = new JDueño();
                  dueno.setVisible(true);
                }else if(rol==2){
                   System.out.println("es admin");
                   JAdmin administrador = new JAdmin();
                   administrador.setVisible(true);
                }else if(rol==1){
                     System.out.println("es vendedor");
                     JVendedor vendedor = new JVendedor();
                     vendedor.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null,"No existe el usuario");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}
