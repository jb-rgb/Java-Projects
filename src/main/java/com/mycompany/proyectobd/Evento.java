/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.proyectobd;
import java.util.Date;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public class Evento {
    
    int id;
     String nombreEvento;
    String descripcionEvento;
    String fechaEvento;
   String lugarEvento;
   int numeroPlatillos;
   int menuEvento;
    
    
    
     public Evento() {
     this.id = 0;
     this.nombreEvento = "";
     this.descripcionEvento = "";
     this.fechaEvento = null;
     this.lugarEvento = "";
     this.numeroPlatillos=0;
     this.menuEvento = 0;
        
    }
    
    public void guardarEvento(JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, int menuEvento_recibido) {
       
        setNombre_Evento(nombreEvento_recibido.getText());
        setDescripcion_Evento(descripcionEvento_recibido.getText());
        setLugar_Evento(lugarEvento_recibido.getText());
        
        
        setFecha_Evento(fechaEvento_recibido.getText());
        setMenu_Evento(menuEvento_recibido);
          Conexion coneccion = new Conexion();
          
           String consulta=" INSERT INTO eventos(nombre,fecha,descripcion,lugar,menuEvento) VALUES (?,?,?,?,?);" ;
             try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
                 cs.setInt(5,getMenu_Evento());
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Evento Ingresado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR el evento CORRECTAMENTE"+e.toString());
             }
        

        
        
    }
    
    public void actualizarEvento(JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, int menuEvento_recibido) {
                setNombre_Evento(nombreEvento_recibido.getText());
        setDescripcion_Evento(descripcionEvento_recibido.getText());
        setLugar_Evento(lugarEvento_recibido.getText());
        setFecha_Evento(fechaEvento_recibido.getText());
        setMenu_Evento(menuEvento_recibido);
        Conexion coneccion = new Conexion();
          
           String consulta="UPDATE eventos SET (nombre,fecha,descripcion,lugar,menuEvento) VALUES (?,?,?,?,?);" ;
         try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
                 cs.setInt(5,getMenu_Evento());
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Evento Modficado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR AL USUARIO CORRECTAMENTE"+e.toString());
             }
        
    }
    
    public void eliminarEvento(int id_evento) {
        // Lógica para eliminar el evento de la base de datos
             setId_Evento(id_evento);
                  Conexion coneccion = new Conexion();
                  String consulta="DELETE eventos WHERE id_evento=?" ;

                  try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setInt(1,getId_Evento());
       
                 cs.execute();
                 
                JOptionPane.showMessageDialog(null, "Evento se elimino CORRECTAMENTE");

                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO Eliminar el evento CORRECTAMENTE"+e.toString());
             }

    }
    
    public void selecionaEvento(JTable tablaRecibida ,JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, int menuEvento_recibido){
        
        
        try{
            int fila = tablaRecibida.getSelectedRow();
            
            if(fila>=0){
                nombreEvento_recibido.setText(tablaRecibida.getValueAt(fila, 0).toString());
                descripcionEvento_recibido.setText(tablaRecibida.getValueAt(fila, 1).toString());
                 lugarEvento_recibido.setText(tablaRecibida.getValueAt(fila, 2).toString());
                 fechaEvento_recibido.setText(tablaRecibida.getValueAt(fila, 3).toString());
                //menuEvento_recibido.setText(tablaRecibida.getValueAt(fila, 4));
                
                
            }else{
                JOptionPane.showMessageDialog(null, "FILA CORRECTAMENTE SELECCIONADA");
            }
            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "NO SE PUDO SELECCIONAR LA FILA DESEADA"+e.toString());
        }
    }
    
    public void listarEventos(JTable paraTotalDeEventos){
              Conexion coneccion = new Conexion();
              DefaultTableModel modelo = new DefaultTableModel(); 
               String sql ="";
        modelo.addColumn(nombreEvento);
        modelo.addColumn(lugarEvento);
        modelo.addColumn(descripcionEvento);
        modelo.addColumn(fechaEvento);
        
        
        paraTotalDeEventos.setModel(modelo);
        
        sql = "select nickname,email,nombre,fecha_nac,telefono,plataforma from eventos;";
         String [] datos = new String[4];
        
        Statement st;
        
        try{
            //me va a lanzar un resultado
            st = coneccion.establecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
              
        
                
                modelo.addRow(datos);
            }
            paraTotalDeEventos.setModel(modelo);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+ e.toString());
        }
    }
    
    public Evento obtener_por_id_Evento(int id) {
        // Lógica para obtener el evento por su ID de la base de datos
        return null;
    }
    
    public Evento[] obtener_por_fecha(Date fecha) {
        // Lógica para obtener los eventos por su fecha de la base de datos
        return null;
    }
    
    // Getters y setters
    
    public int getId_Evento() {
        return id;
    }
    
    public void setId_Evento(int id) {
        this.id = id;
    }
    
    public String getNombre_Evento() {
        return nombreEvento;
    }
    
    public void setNombre_Evento(String nombre) {
        this.nombreEvento = nombre;
    }
    
    public String getDescripcion_Evento() {
        return descripcionEvento;
    }
    
    public void setDescripcion_Evento(String descripcion) {
        this.descripcionEvento = descripcion;
    }
    
    public String getFecha_Evento() {
        return fechaEvento;
    }
    
    public void setFecha_Evento(String fecha) {
        this.fechaEvento = fecha;
    }
    
    public String getLugar_Evento() {
        return lugarEvento;
    }
    
    public void setLugar_Evento(String lugar) {
        this.lugarEvento = lugar;
    }
    
  
    
    public int getMenu_Evento() {
        return menuEvento;
    }
    
    public void setMenu_Evento(int menu) {
        this.menuEvento = menu;
    }
    
    
   
}
