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
    private int precio_menu;
    private String descripcion;
    private int numero_platillos;
    private int id_evento;
    
    // Constructor
    public MenuEvento() {
        this.id_MenuEvento =0;
        this.nombre ="";
        this.precio_menu=0;
        this.descripcion ="";
        this.numero_platillos = 0;
        this.id_evento = 0;  
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
       public int getPrecio_menu(){
            return precio_menu;
    }
    
    public void setPrecio_menu(int precioMenu){
         this.precio_menu=precioMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getId_Evento(){
            return id_evento;
    }
    
    public void setId_Evento(int IdEvento){
         this.id_evento=IdEvento;
    }
    
    

    public int getNumero_platillos() {
        return numero_platillos;
    }

    public void setNumero_platillos(int numero_platillos) {
        this.numero_platillos = numero_platillos;
    }
    
   
    
    //GUARDAR un nuevo menu 
    
    public void guardarMenu( JTextField nombre_recibido,JTextField precio_recibido, JTextField descripcion_recibida, JTextField numeroPlatillos_recibido,JTextField idEvento_recibido){
        //primero verificar que no se pase el numero de ingesar menus ; 
        
         Conexion coneccion = new Conexion();
         int id_eventoR = Integer.parseInt(idEvento_recibido.getText());
         
           String VerificarMenus="SELECT COUNT(*) AS cantidad_menus FROM menu_evento WHERE id_evento = ?";
         try{
              CallableStatement verificar = coneccion.establecerConexion().prepareCall(VerificarMenus);
               verificar.setInt(1,id_eventoR);
               ResultSet resultSet = verificar.executeQuery();
            if (resultSet.next()) {
                int cantidadMenus = resultSet.getInt("cantidad_menus");
                if (cantidadMenus >= 4) {
                    JOptionPane.showMessageDialog(null, "No se pueden agregar más menús. Ya hay 4 menús relacionados con el evento. ");
                
                } else {
                    //si hay menos de 4 menus se puede agregar 
                    
        
            String  nombreMenuEvento = nombre_recibido.getText();
            int precioMenu = Integer.parseInt(precio_recibido.getText());
            String descripcionMenuEvento = descripcion_recibida.getText();
            int numeroPlatRecibido = Integer.parseInt(numeroPlatillos_recibido.getText());     
            

            if(nombreMenuEvento.isEmpty()  || descripcionMenuEvento.isEmpty() || numeroPlatRecibido == 0 || descripcionMenuEvento.isEmpty() || id_eventoR ==0 ){
                //mensaje de error
                  JOptionPane.showMessageDialog(null, "Ingresar correctamente los datos ");
                 
            }else{
             setNombre(nombreMenuEvento);
             setPrecio_menu(precioMenu);
            setDescripcion(descripcionMenuEvento);
            setNumero_platillos(numeroPlatRecibido );
            setId_Evento(id_eventoR);
            
             
                  
            String consulta=" INSERT INTO menu_evento(nombre_menu,precio_menu,descripcion_menu,numero_platillos,id_evento) VALUES (?,?,?,?,?);" ; //donde va a estar guardada la consulta 
             
             try{
                CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
                 cs.setString(1,getNombre());
                 cs.setInt(2,getPrecio_menu()); 
                 cs.setString(3,getDescripcion());
                 cs.setInt(4,getNumero_platillos());
                 cs.setInt(5,getId_Evento());
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Menu para  Evento Ingresado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO INGRESAR AL USUARIO CORRECTAMENTE"+e.toString());
             }
                 
            }
                    
                   
                    
                }
            }
             
         }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ya no se pueden ingresar mas menus al evento ");
        
    }
        
        
        
             
    }
   public void actualizarMenu(JTextField idmenuEvento_recibido, JTextField nombre_recibido,JTextField precio_recibido, JTextField descripcion_recibida, JTextField numeroPlatillos_recibido,JTextField idEvento_recibido) {
       
            setId_MenuEvento(Integer.parseInt(idmenuEvento_recibido.getText()));
            setNombre(nombre_recibido.getText());
            setPrecio_menu(Integer.parseInt(precio_recibido.getText()));
            setDescripcion(descripcion_recibida.getText());
            setNumero_platillos(Integer.parseInt(numeroPlatillos_recibido.getText()));
            setId_Evento(Integer.parseInt(idEvento_recibido.getText()));
              Conexion coneccion = new Conexion();
          
           String consulta="UPDATE menu_evento SET nombre_menu=?,precio_menu=?,descripcion_menu=?,numero_platillos=?,id_evento=? WHERE menu_evento.id_menu=?" ;
         try{
               CallableStatement cs = coneccion.establecerConexion().prepareCall(consulta);
               
                 cs.setString(1,getNombre());                 
                 cs.setInt(2,getPrecio_menu());
                 cs.setString(3,getDescripcion());
                 cs.setInt(4,getNumero_platillos());
                 cs.setInt(5,getId_Evento());
                 cs.setInt(6,getId_MenuEvento());

    
                 cs.execute();
                 
                 JOptionPane.showMessageDialog(null, "Menu para  Evento modificado CORRECTAMENTE");
                 
             }catch(Exception e){
                 
                 JOptionPane.showMessageDialog(null, "NO SE PUDO modificar el menu del evento CORRECTAMENTE"+e.toString());
             }
        
    }
   
   
    public void listarMenus(JTable paraTotalDeMenus){
              Conexion coneccion = new Conexion();
              DefaultTableModel modelo = new DefaultTableModel(); 
               String sql ="";
         modelo.addColumn("Menu evento id");
        modelo.addColumn("Nombre"); 
        modelo.addColumn("Precio");        
       modelo.addColumn("descripcion");
        modelo.addColumn("numero_platillos");       
        modelo.addColumn("id_evento");
        
        paraTotalDeMenus.setModel(modelo);
        
        sql = "select * from menu_evento";//cambiar la consulta 
         String [] datos = new String[6];
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
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            paraTotalDeMenus.setModel(modelo);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+ e.toString());
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
    
    public void obtenerunMenu(JTable tablaRecibida ,JTextField idMenu_recibido, JTextField nombre_recibido, JTextField precio_recibido,JTextField descripcion_recibida, JTextField numeroPlatillos_recibido,JTextField idEvento_recibido){
        
        
        try{
            int fila = tablaRecibida.getSelectedRow();
            
            if(fila>=0){
                idMenu_recibido.setText(tablaRecibida.getValueAt(fila, 0).toString());
                nombre_recibido.setText(tablaRecibida.getValueAt(fila, 1).toString());
                precio_recibido.setText(tablaRecibida.getValueAt(fila,2).toString());
                descripcion_recibida.setText(tablaRecibida.getValueAt(fila, 3).toString());
                numeroPlatillos_recibido.setText(tablaRecibida.getValueAt(fila, 4).toString());//chechar si es setText
                idEvento_recibido.setText(tablaRecibida.getValueAt(fila, 5).toString());
                
                
            }else{
                JOptionPane.showMessageDialog(null, "FILA CORRECTAMENTE SELECCIONADA");
            }
            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "NO SE PUDO SELECCIONAR LA FILA DESEADA"+e.toString());
        }
    }
    
       public void clear(JTable tabla_alumnos, JTextField jTextField1_id, JTextField jTextField1_nombre,
            JTextField jTextField1_precio, JTextField jTextField1_descripcion, JTextField jTextField_numeroPlatillos,JTextField jTextField_idEvento) {
        jTextField1_id.setText(" ");
        jTextField1_nombre.setText(" ");
        jTextField1_precio.setText(" ");
        jTextField1_descripcion.setText(" ");
        jTextField_numeroPlatillos.setText(" ");
        jTextField_idEvento.setText(" ");

    }
    
    

}
