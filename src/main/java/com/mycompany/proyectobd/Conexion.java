package com.mycompany.proyectobd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
<<<<<<< HEAD

     Connection conectar = null;
    String usuario = "root";
    String contrasenia = "mr.robot";
    String bd = "cafeteria";
    String ip = "localhost";
    String puerto = "3036";
    String cadena = "jdbc:mysql://localhost:3306/cafeteria?zeroDateTimeBehavior=CONVERT_TO_NULL";

=======
    Connection conectar = null;
    String usuario = "postgres";
    String contrasenia = "#Jorge4820";
    String bd = "cafeteria";
    String ip = "localhost";
    String puerto = "5432";
    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;
>>>>>>> main
    
    public Connection establecerConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
        return conectar;
    }
}