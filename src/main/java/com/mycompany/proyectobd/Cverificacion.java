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
        
        String consulta = "SELECT * FROM usuario WHERE password = '" + contrasena + "' AND correo_usuario = '" + correo + "'";
        Statement st ;
        
        try{
            
             st = con.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            if(rs.next()){//si existe el usuario 
                
                String correoU=rs.getString("correo_usuario");
                String passwordU = rs.getString("password");
                int rol  = rs.getInt("tipo_usuario");
               
                if(rol==3){
                  System.out.println("es dueño");
                  JDueño jd = new JDueño();
                  jd.setVisible(true);
                }else if(rol==2){
                   System.out.println("es admin");
                   JAdmin ja = new JAdmin();
                   ja.setVisible(true);
                }else if(rol==1){
                     System.out.println("es vendedor");
                     JVendedor jv = new JVendedor();
                     jv.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null,"No existe el usuario");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}
