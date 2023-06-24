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
   int tipo_evento;
   
  
    
    
     public Evento() {
     this.id_evento = 0;
     this.nombreEvento = "";
     this.descripcionEvento = "";
     this.fechaEvento = null;
     this.lugarEvento = "";
       this.tipo_evento=0;
    }
     
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
     public int getTipo_evento() {
        return tipo_evento;
    }
    
    public void setTipo_evento(int tipo) {
        this.tipo_evento= tipo;
    }
  
    
    public void guardarEvento(JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido,int tipo_Evento) {
  
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
        setTipo_evento(tipo_evento);
        
     
          Conexion coneccion = new Conexion();
          
           String consulta=" INSERT INTO eventos(nombre_evento,fecha_evento,descripcion_evento,lugar_evento,tipo_evento) VALUES (?,?,?,?,?);" ;
             try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
                 cs.setInt(5,getTipo_evento());
              
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Evento Ingresado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR EL EVENTO"+e.toString());
             }
            
        }
      
    }
    
    public void actualizarEvento(JTextField  IdEvento_recibido ,JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido,JTextField Tipo_evento) {
        
        setId_Evento(Integer.parseInt(IdEvento_recibido.getText()));
        setNombre_Evento(nombreEvento_recibido.getText());
        setDescripcion_Evento(descripcionEvento_recibido.getText());
        setLugar_Evento(lugarEvento_recibido.getText());
        setFecha_Evento(fechaEvento_recibido.getText());
        setTipo_evento(Integer.parseInt(Tipo_evento.getText()));
        Conexion coneccion = new Conexion();
          
           String consulta="UPDATE eventos SET nombre_evento =?, descripcion_evento = ? , fecha_evento = ? , lugar_evento=? ,tipo_evento=? WHERE eventos.id_evento=?;" ;
         try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre_Evento());
                 cs.setString(2,getDescripcion_Evento());
                 cs.setString(3,getFecha_Evento());
                 cs.setString(4,getLugar_Evento());
                      cs.setInt(5,getTipo_evento());
                  cs.setInt(6,getId_Evento());
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Evento Modficado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR EL EVENTO"+e.toString());
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
    
    public void selecionaEvento(JTable tablaRecibida ,JTextField  IdEvento_recibido,JTextField  nombreEvento_recibido , JTextField  descripcionEvento_recibido,JTextField  fechaEvento_recibido, JTextField  lugarEvento_recibido,JTextField  tipoEvento_recibido){
        
       //  menuEvento_recibido.getValueAt(fila,4);
        try{
            int fila = tablaRecibida.getSelectedRow();
            
            if(fila>=0){
                IdEvento_recibido.setText(tablaRecibida.getValueAt(fila,0).toString());
                nombreEvento_recibido.setText(tablaRecibida.getValueAt(fila, 1).toString());
                descripcionEvento_recibido.setText(tablaRecibida.getValueAt(fila, 2).toString());
                 fechaEvento_recibido.setText(tablaRecibida.getValueAt(fila, 3).toString());
                 lugarEvento_recibido.setText(tablaRecibida.getValueAt(fila, 4).toString());
                 tipoEvento_recibido.setText(tablaRecibida.getValueAt(fila, 5).toString());
                 
                
                
                
            }else{
                JOptionPane.showMessageDialog(null, "FILA CORRECTAMENTE SELECCIONADA");
            }
            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "NO SE PUDO SELECCIONAR LA FILA DESEADA"+e.toString());
        }
    }
    
     public void clearEvento(JTable tabla_eventos,JTextField jTextField1_idEvento, JTextField jTextField1_nombre, JTextField jTextField1_descripcion,
            JTextField jTextField1_fecha, JTextField jTextField1_lugar) {
        jTextField1_idEvento.setText(" ");
        jTextField1_nombre.setText(" ");
        jTextField1_descripcion.setText(" ");
        jTextField1_fecha.setText(" ");
        jTextField1_lugar.setText(" ");
    }

    
    public void listarEventos(JTable paraTotalDeEventos){
              Conexion coneccion = new Conexion();
              DefaultTableModel modelo = new DefaultTableModel(); 
               String sql ="";
        modelo.addColumn("Id evento");
        modelo.addColumn("nombreEvento");
        modelo.addColumn("descripcionEvento");
        modelo.addColumn("fechaEvento");
        modelo.addColumn("lugarEvento");
        paraTotalDeEventos.setModel(modelo);
        
        sql = "select * from eventos;";
         String [] datos = new String[5];
        
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
                datos[4] = rs.getString(5);  

                
                modelo.addRow(datos);
            }
            paraTotalDeEventos.setModel(modelo);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+ e.toString());
        }
    }
    
  
    
    // Getters y setters
    

    

    
   
}
