package com.mycompany.proyectobd;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cversiones {
    
    String codigo_version;
    String anio_version;
    String requisitos;
    String nombre_plataforma;

    public String getCodigo_version() {
        return codigo_version;
    }

    public void setCodigo_version(String codigo_version) {
        this.codigo_version = codigo_version;
    }

    public String getAnio_version() {
        return anio_version;
    }

    public void setAnio_version(String anio_version) {
        this.anio_version = anio_version;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getNombre_plataforma() {
        return nombre_plataforma;
    }

    public void setNombre_plataforma(String nombre_plataforma) {
        this.nombre_plataforma = nombre_plataforma;
    }
    
    public void mostrarVersiones(JTable tablaVersiones){
        Conexion cj = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("codigo_version");
        modelo.addColumn("anio_version");
        modelo.addColumn("requisitos");
        modelo.addColumn("nombre_plataforma");
        tablaVersiones.setModel(modelo);
        sql = "SELECT * FROM versiones";
        String[] datos = new String[4];
        Statement st;
        try{
            st = cj.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            tablaVersiones.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void insertarVersion(JTextField codigoVersion, JTextField anioVersion, JTextField requisitos, JTextField nombre_plataforma){
        setCodigo_version(codigoVersion.getText());
        setAnio_version(anioVersion.getText());
        setRequisitos(requisitos.getText());
        setNombre_plataforma(nombre_plataforma.getText());
        Conexion conec = new Conexion();
        String consulta = "INSERT INTO versiones(codigo_version, anio_version, requisitos, nombre_plataforma) VALUES (?, ?, ?, ?);";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getCodigo_version());
            cs.setString(2, getAnio_version());
            cs.setString(3, getRequisitos());
            cs.setString(4, getNombre_plataforma());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void seleccionarVersion(JTable tablaVersiones, JTextField codigoVersion, JTextField anioVersion, JTextField requisitos, JTextField nombrePlataforma){
        try{
            int fila = tablaVersiones.getSelectedRow();
            if(fila >= 0){
                codigoVersion.setText(tablaVersiones.getValueAt(fila, 0).toString());
                anioVersion.setText(tablaVersiones.getValueAt(fila, 1).toString());
                requisitos.setText(tablaVersiones.getValueAt(fila, 2).toString());
                nombrePlataforma.setText(tablaVersiones.getValueAt(fila, 3).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void modificarVersion(JTextField codigoVersion, JTextField anioVersion, JTextField requisitos, JTextField nombrePlataforma){
        setCodigo_version(codigoVersion.getText());
        setAnio_version(anioVersion.getText());
        setRequisitos(requisitos.getText());
        setNombre_plataforma(nombrePlataforma.getText());
        Conexion conec = new Conexion();
        String consulta = "UPDATE versiones SET codigo_version = ?, anio_version = ?, requisitos = ?, nombre_plataforma = ? WHERE versiones.codigo_version = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getCodigo_version());
            cs.setString(2, getAnio_version());
            cs.setString(3, getRequisitos());
            cs.setString(4, getNombre_plataforma());
            cs.setString(5, getCodigo_version());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void eliminarVersion(JTextField codigoVersion){
        setCodigo_version(codigoVersion.getText());
        Conexion conec = new Conexion();
        String consulta = "DELETE FROM versiones WHERE versiones.codigo_version = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getCodigo_version());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    //hola
}
