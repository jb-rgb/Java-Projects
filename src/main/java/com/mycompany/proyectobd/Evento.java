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
    
    int id_evento;
     String nombreEvento;
    String descripcionEvento;
    String fechaEvento;
   String lugarEvento;
   int numeroPlatillos;
   
    
    
     public Evento() {
     this.id_evento = 0;
     this.nombreEvento = "";
     this.descripcionEvento = "";
     this.fechaEvento = null;
     this.lugarEvento = "";
     this.numeroPlatillos=0;

        
    }
    
    public void guardarEvento(JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, int menuEvento_recibido) {
       
        String nombre_evento= nombreEvento_recibido.getText();
        String descripcion_evento= descripcionEvento_recibido.getText();
        String lugar_evento= lugarEvento_recibido.getText();
        String fecha_evento= fechaEvento_recibido.getText();
        if (nombre_evento.isEmpty() || descripcion_evento.isEmpty() || lugar_evento.isEmpty() || fecha_evento.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }else{
            setNombre_Evento(nombre_evento);
        setDescripcion_Evento(descripcion_evento);
        setLugar_Evento(lugar_evento);
        setFecha_Evento(fecha_evento);
     
          Conexion coneccion = new Conexion();
          
           String consulta=" INSERT INTO eventos(nombre_evento,fecha_evento,descripcion_evento,lugar_evento,id_menuEvento) VALUES (?,?,?,?,?);" ;
             try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
              
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Evento Ingresado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR EL EVENTO"+e.toString());
             }
            
        }
      
    }
    
    public void actualizarEvento(JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, int menuEvento_recibido) {
                setNombre_Evento(nombreEvento_recibido.getText());
        setDescripcion_Evento(descripcionEvento_recibido.getText());
        setLugar_Evento(lugarEvento_recibido.getText());
        setFecha_Evento(fechaEvento_recibido.getText());
        Conexion coneccion = new Conexion();
          
           String consulta="UPDATE eventos SET (nombre,fecha,descripcion,lugar,menuEvento) VALUES (?,?,?,?,?);" ;
         try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
    
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
    
    public void selecionaEvento(JTable tablaRecibida ,JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido, JTextField menuEvento_recibido){
        
       //  menuEvento_recibido.getValueAt(fila,4);
        try{
            int fila = tablaRecibida.getSelectedRow();
            
            if(fila>=0){
                nombreEvento_recibido.setText(tablaRecibida.getValueAt(fila, 0).toString());
                descripcionEvento_recibido.setText(tablaRecibida.getValueAt(fila, 1).toString());
                 lugarEvento_recibido.setText(tablaRecibida.getValueAt(fila, 2).toString());
                 fechaEvento_recibido.setText(tablaRecibida.getValueAt(fila, 3).toString());
                
                
            }else{
                JOptionPane.showMessageDialog(null, "FILA CORRECTAMENTE SELECCIONADA");
            }
            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "NO SE PUDO SELECCIONAR LA FILA DESEADA"+e.toString());
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

    
    public void listarEventos(JTable paraTotalDeEventos){
              Conexion coneccion = new Conexion();
              DefaultTableModel modelo = new DefaultTableModel(); 
               String sql ="";
        modelo.addColumn(nombreEvento);
        modelo.addColumn(lugarEvento);
        modelo.addColumn(descripcionEvento);
        modelo.addColumn(fechaEvento);
        
        
        paraTotalDeEventos.setModel(modelo);
        
        sql = "select nombre_evento,fecha_evento,descripcion_evento,lugar_evento,id_menuEvento from eventos;";
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
    
  
    
    // Getters y setters
    
    public int getId_Evento() {
        return id_evento;
    }
    
    public void setId_Evento(int id) {
        this.id_evento = id;
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
    
  
    

    
   
}
