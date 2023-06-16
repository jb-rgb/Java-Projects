/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobd;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class MenuEvento {
    private int id_MenuEvento;
    private String nombre;
    private String descripcion;
    private int numero_platillos;
    //private int id_evento;
    
    // Constructor
    public MenuEvento(int id_MenuEvento, String nombre, String descripcion, int numero_platillos) {
        this.id_MenuEvento = id_MenuEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numero_platillos = numero_platillos;
    }
    
    
    
    // Getters y Setters
    public int getId_MenuEvento() {
        return id_MenuEvento;
    }

    public void setId_MenuEvento(int id_MenuEvento) {
        this.id_MenuEvento = id_MenuEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero_platillos() {
        return numero_platillos;
    }

    public void setNumero_platillos(int numero_platillos) {
        this.numero_platillos = numero_platillos;
    }
    
    //obtener un menu por el ID:
        public MenuEvento obtenerMenuPorId(int id_MenuEvento) {
            
                  Conexion coneccion = new Conexion();
                   Statement ps ;
        String consulta = "SELECT * FROM menu_evento WHERE id_MenuEvento = ?";//modificar la consulta
        try {
            
              ps = coneccion.establecerConexion().createStatement();
            ResultSet rs = ps.executeQuery(consulta);
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                int numero_platillos = rs.getInt("numero_platillos");

                MenuEvento menu = new MenuEvento(id_MenuEvento, nombre, descripcion, numero_platillos);
                return menu;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
        
      
    
    //GUARDAR un nuevo menu 
    
    public void guardarMenu(JTextField idmenuEvento_recibido, JTextField nombre_recibido, JTextField descripcion_recibida, JTextField numeroPlatillos_recibido){
        
            setNombre(nombre_recibido.getText());
            setDescripcion(descripcion_recibida.getText());
            setNumero_platillos(Integer.parseInt(numeroPlatillos_recibido.getText()));
              Conexion coneccion = new Conexion();
                  
            String consulta=" INSERT INTO usuario(nickname,email,nombre,fecha_nac,telefono,plataforma) VALUES (?,?,?,?,?,?);" ; //donde va a estar guardada la consulta 
             
             try{
                CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre());
                 cs.setString(2,getDescripcion());
                 cs.setInt(3,getNumero_platillos());
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Menu para  Evento Ingresado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR AL USUARIO CORRECTAMENTE"+e.toString());
             }
             
    }
   public void actualizarEvento(JTextField idmenuEvento_recibido, JTextField nombre_recibido, JTextField descripcion_recibida, JTextField numeroPlatillos_recibido) {
               setNombre(nombre_recibido.getText());
            setDescripcion(descripcion_recibida.getText());
            setNumero_platillos(Integer.parseInt(numeroPlatillos_recibido.getText()));
              Conexion coneccion = new Conexion();
          
           String consulta="UPDATE eventos SET (nombre,fecha,descripcion,lugar,menuEvento) VALUES (?,?,?,?,?);" ;
         try{
               CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre());
                 cs.setString(2,getDescripcion());
                 cs.setInt(3,getNumero_platillos());
    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Menu para  Evento modificado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO modificar el menu del evento CORRECTAMENTE"+e.toString());
             }
        
    }
    
    public void eliminarEvento(int id_evento) {
        // Lógica para eliminar el evento de la base de datos
             setId_MenuEvento(id_evento);
                  Conexion coneccion = new Conexion();
                  String consulta="DELETE eventos WHERE id_evento=?" ;

                  try{
                 CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setInt(1,getId_MenuEvento());
       
                 cs.execute();
                 
                JOptionPane.showMessageDialog(null, "Evento se elimino CORRECTAMENTE");

                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO Eliminar el evento CORRECTAMENTE"+e.toString());
             }

    }
    
    public void selecionaEvento(JTable tablaRecibida , JTextField nombre_recibido, JTextField descripcion_recibida, JTextField numeroPlatillos_recibido){
        
        
        try{
            int fila = tablaRecibida.getSelectedRow();
            
            if(fila>=0){
                nombre_recibido.setText(tablaRecibida.getValueAt(fila, 0).toString());
                descripcion_recibida.setText(tablaRecibida.getValueAt(fila, 1).toString());
                numeroPlatillos_recibido.setText(tablaRecibida.getValueAt(fila, 2).toString());//chechar si es setText
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
         modelo.addColumn(id_MenuEvento);
        modelo.addColumn(nombre);        
        modelo.addColumn(descripcion);
        modelo.addColumn(numero_platillos);
    
        
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
    

}
