package com.mycompany.proyectobd;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cjuego {

    String nombre_juego;
    String clasificacion;
    String descripcion_juego;
    String genero_juego;
    String codigo_version;
    
    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescripcion_juego() {
        return descripcion_juego;
    }

    public void setDescripcion_juego(String descripcion_juego) {
        this.descripcion_juego = descripcion_juego;
    }

    public String getGenero_juego() {
        return genero_juego;
    }

    public void setGenero_juego(String genero_juego) {
        this.genero_juego = genero_juego;
    }

    public String getCodigo_version() {
        return codigo_version;
    }

    public void setCodigo_version(String codigo_version) {
        this.codigo_version = codigo_version;
    }
    
    public void mostrarJuego(JTable tablaJuego){
        Conexion cj = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("nombre_juego");
        modelo.addColumn("clasificacion");
        modelo.addColumn("descripcion_juego");
        modelo.addColumn("genero_juego");
        modelo.addColumn("codigo_version");
        tablaJuego.setModel(modelo);
        sql = "SELECT * FROM juego";
        String[] datos = new String[5];
        Statement st;
        try{
            st = cj.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablaJuego.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void insertarJuego(JTextField nombreJuego, JTextField clasificacion, JTextField descripcionJuego, JTextField generoJuego, JTextField codigoVersion){
        setNombre_juego(nombreJuego.getText());
        setClasificacion(clasificacion.getText());
        setDescripcion_juego(descripcionJuego.getText());
        setGenero_juego(generoJuego.getText());
        setCodigo_version(codigoVersion.getText());
        Conexion conec = new Conexion();
        String consulta = "INSERT INTO juego(nombre_juego, clasificacion, descripcion_juego, genero_juego, codigo_version) VALUES (?, ?, ?, ?, ?);";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_juego());
            cs.setString(2, getClasificacion());
            cs.setString(3, getDescripcion_juego());
            cs.setString(4, getGenero_juego());
            cs.setString(5, getCodigo_version());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void seleccionarJuego(JTable tablaJuego, JTextField nombreJuego, JTextField clasificacion, JTextField descripcionJuego, JTextField generoJuego, JTextField codigoVersion){
        try{
            int fila = tablaJuego.getSelectedRow();
            if(fila >= 0){
                nombreJuego.setText(tablaJuego.getValueAt(fila, 0).toString());
                clasificacion.setText(tablaJuego.getValueAt(fila, 1).toString());
                descripcionJuego.setText(tablaJuego.getValueAt(fila, 2).toString());
                generoJuego.setText(tablaJuego.getValueAt(fila, 3).toString());
                codigoVersion.setText(tablaJuego.getValueAt(fila, 4).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void modificarJuego(JTextField nombreJuego, JTextField clasificacion, JTextField descripcionJuego, JTextField generoJuego, JTextField codigoVersion){
        setNombre_juego(nombreJuego.getText());
        setClasificacion(clasificacion.getText());
        setDescripcion_juego(descripcionJuego.getText());
        setGenero_juego(generoJuego.getText());
        setCodigo_version(codigoVersion.getText());
        Conexion conec = new Conexion();
        String consulta = "UPDATE juego SET nombre_juego = ?, clasificacion = ?, descripcion_juego = ?, genero_juego = ?, codigo_version = ? WHERE juego.nombre_juego = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_juego());
            cs.setString(2, getClasificacion());
            cs.setString(3, getDescripcion_juego());
            cs.setString(4, getGenero_juego());
            cs.setString(5, getCodigo_version());
            cs.setString(6, getNombre_juego());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
    public void eliminarJuego(JTextField nombreJuego){
        setNombre_juego(nombreJuego.getText());
        Conexion conec = new Conexion();
        String consulta = "DELETE FROM juego WHERE juego.nombre_juego = ?;";
        try{
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre_juego());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
    
}
