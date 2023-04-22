
package com.mycompany.proyectobd;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cplataforma {
    
    String nombre_plataforma;
    String anio_plataforma;
    String modelo_plataforma;

    public String getNombre_plataforma() {
        return nombre_plataforma;
    }

    public void setNombre_plataforma(String nombre_plataforma) {
        this.nombre_plataforma = nombre_plataforma;
    }

    public String getAnio_plataforma() {
        return anio_plataforma;
    }

    public void setAnio_plataforma(String anio_plataforma) {
        this.anio_plataforma = anio_plataforma;
    }

    public String getModelo_plataforma() {
        return modelo_plataforma;
    }

    public void setModelo_plataforma(String modelo_plataforma) {
        this.modelo_plataforma = modelo_plataforma;
    }
    
    private void setNombre_Plaforma(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAnio_Plataforma(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void mostrarPlataforma(JTable tablaPlataforma){
        Conexion cj = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("nombre_plataforma");
        modelo.addColumn("anio_plataforma");
        modelo.addColumn("modelo");
        tablaPlataforma.setModel(modelo);
        sql = "SELECT * FROM plataforma ";
        String[] datos = new String[3];
        Statement st;
        try{
            st = cj.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tablaPlataforma.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
 
       public void insertarPlataforma(JTextField nombrePlataforma, JTextField anioPlataforma, JTextField modelo_Plataforma){
        setNombre_plataforma(nombrePlataforma.getText());
        setAnio_plataforma(anioPlataforma.getText());
        setModelo_plataforma(modelo_Plataforma.getText());
        Conexion conec = new Conexion();
        String consulta = "INSERT INTO plataforma(nombre_plataforma, anio_plataforma, modelo) VALUES (?, ?, ?);";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_plataforma());
            cs.setString(2, getAnio_plataforma());
            cs.setString(3, getModelo_plataforma());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
  public void seleccionarPlataforma(JTable tablaPlataforma, JTextField nombrePlataforma, JTextField anioPlataforma, JTextField modeloPlataforma){
        try{
            int fila = tablaPlataforma.getSelectedRow();
            if(fila >= 0){
                nombrePlataforma.setText(tablaPlataforma.getValueAt(fila, 0).toString());
                anioPlataforma.setText(tablaPlataforma.getValueAt(fila, 1).toString());
                modeloPlataforma.setText(tablaPlataforma.getValueAt(fila, 2).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
  
  public void modificarPlataforma(JTextField nombrePlataforma, JTextField anioPlataforma, JTextField modeloPlataforma){
        setNombre_plataforma(nombrePlataforma.getText());
        setAnio_plataforma (anioPlataforma.getText());
        setModelo_plataforma(modeloPlataforma.getText());
        Conexion conec = new Conexion();
        String consulta = "UPDATE plataforma SET nombre_plataforma = ?, anio_plataforma = ?, modelo = ? WHERE plataforma.nombre_plataforma = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_plataforma());
            cs.setString(2, getAnio_plataforma());
            cs.setString(3, getModelo_plataforma());
            cs.setString(4, getNombre_plataforma());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
  
  public void eliminarPlataforma(JTextField nombrePlataforma){
        setNombre_plataforma(nombrePlataforma.getText());
        Conexion conec = new Conexion();
        String consulta = "DELETE FROM plataforma WHERE plataforma.nombre_plataforma = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_plataforma());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}

