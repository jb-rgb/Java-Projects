package com.mycompany.proyectobd;
import java.sql.Connection;
    
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.Driver;
public class Conexion {
    Connection conectar = null;
    String usuario = "Administrador";
    String contrasenia = "elbarahonaesputo1@#";
    String bd = "cafeteria";
    String ip = "cafeteriaproyecto.mysql.database.azure.com";
    String puerto = "3036";
    String cadena = "jdbc:mysql://cafeteriaproyecto.mysql.database.azure.com:3306/cafeteria?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
        return conectar;
    }
}
