/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd.socrucito;

import com.mycompany.proyectobd.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author socru
 * puto el que lo lea;
 * propiedades: id int, nombre string, descripcion string, precio_unitario decimal
 * metodos
 * constructor, guardar, actualizar, eliminar
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private float precioProducto;
    private int cantidadProducto;
    private int cantidadVendida;

    public Producto(String nombre_producto, String descripcion_producto, float precio_producto, int cantidad_producto) {
        this.nombreProducto = nombre_producto;
        this.descripcionProducto = descripcion_producto;
        this.precioProducto = precio_producto;
        this.cantidadProducto = cantidad_producto;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    
    public void setCantidadVendidad(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    
    public int getCantidadVendida() {
        return this.cantidadVendida;
    }
    
    public void guardarProducto(JTextField nombre_producto, JTextField descripcion_producto, JTextField precio_producto, JTextField cantidad_producto) {
        setNombreProducto(nombre_producto.getText());
        setDescripcionProducto(descripcion_producto.getText());
        setPrecioProducto(Float.parseFloat(precio_producto.getText()));
        setCantidadProducto(Integer.parseInt(cantidad_producto.getText()));
        Conexion conec = new Conexion();
        String consulta = "INSERT INTO productos(nombre_producto, descripcion_producto, precio_producto, cantidad_producto) VALUES (?, ?, ?, ?);";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombreProducto());
            cs.setString(2, getDescripcionProducto());
            cs.setString(3, Float.toString(getPrecioProducto()));
            cs.setString(4, Integer.toString(getCantidadProducto()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "El producto se guardó correctamente");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void actualizarProducto(JTextField nombre_producto, JTextField descripcion_producto, JTextField precio_producto, JTextField cantidad_producto) {
        setNombreProducto(nombre_producto.getText());
        setDescripcionProducto(descripcion_producto.getText());
        setPrecioProducto(Float.parseFloat(precio_producto.getText()));
        setCantidadProducto(Integer.parseInt(cantidad_producto.getText()));
        Conexion conec = new Conexion();
        String consulta = "UPDATE productos SET nombre_producto = ?, descripcion_producto = ?, precio_producto = ?, cantidad_producto = ? WHERE productos.id_producto = ?;";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombreProducto());
            cs.setString(2, getDescripcionProducto());
            cs.setString(3, Float.toString(getPrecioProducto()));
            cs.setString(4, Integer.toString(getCantidadProducto()));
            cs.setString(5, Integer.toString(getIdProducto()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se actualizó correctamente el producto");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void mostrarProducto(JTable tablaProducto) {
        Conexion conec = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_producto");
        modelo.addColumn("nombre_producto");
        modelo.addColumn("descripcion_producto");
        modelo.addColumn("precio_producto");
        modelo.addColumn("cantidad_producto");
        tablaProducto.setModel(modelo);
        String sql = "SELECT * FROM productos";
        String[] datos = new String[5];
        Statement st;
        try {
            st = conec.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablaProducto.setModel(modelo);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void eliminarProducto(JTextField id_producto) {
        setIdProducto(Integer.parseInt(id_producto.toString()));
        Conexion conec = new Conexion();
        String consulta = "DELETE FROM productos WHERE productos.id_producto = ?;";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, Integer.toString(getIdProducto()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el producto");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void buscarProducto(JTextField nombre_producto) {
        setNombreProducto(nombre_producto.toString());
        Conexion conec = new Conexion();
        String consulta = "SELECT * FROM productos WHERE productos.nombre_producto = ?;";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombreProducto());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Producto encontrado");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void reducirCantidad(JTextField id_producto, JTextField cantidadAumentada) {
        setIdProducto(Integer.parseInt(id_producto.toString()));
        Conexion conec = new Conexion();
        String consulta = "UPDATE productos SET cantidad_producto = cantidad_producto - ? WHERE productos.id_producto = ?;";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, cantidadAumentada.toString());
            cs.setString(2, Integer.toString(getIdProducto()));
            JOptionPane.showMessageDialog(null, "Se actualizo la cantidad del producto");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void aumentarCantidad(JTextField id_producto, JTextField cantidadComprada) {
        setIdProducto(Integer.parseInt(id_producto.toString()));
        Conexion conec = new Conexion();
        String consulta = "UPDATE productos SET cantidad_producto = cantidad_producto + ? WHERE productos.id_producto = ?";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setString(1, cantidadComprada.toString());
            cs.setString(2, Integer.toString(getIdProducto()));
            JOptionPane.showMessageDialog(null, "Se actualizo la cantidad del producto");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void cobrarProducto(JTextField idProducto, JTextField cantidadComprada) {
        int productoId = Integer.parseInt(idProducto.getText());
        int cantidad = Integer.parseInt(cantidadComprada.getText());
        Conexion conec = new Conexion();
        String consulta = "UPDATE productos SET cantidad_producto = cantidad_producto - ? WHERE productos.id_producto = ?;";
        try {
            Connection conexion = conec.establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, cantidad);
            ps.setInt(2, productoId);
            int filasActualizadas = ps.executeUpdate();
            if(filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Cobro realizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se puso realizar el cobro");
            }
            ps.close();
            conexion.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}
/*
    public void cobrarAlimento(JTextField idAlimento, JTextField cantidadAlimento) {
        int AlimentoId = Integer.parseInt(idAlimento.getText());
        int cantidad = Integer.parseInt(cantidadAlimento.getText());
        Conexion conec = new Conexion();
       // Consulta para agregar alimento vendido String incremento = "UPDATE productos SET cantidad_producto = cantidad_producto - ? WHERE productos.id_producto = ?;";
        try {
            Connection conexion = conec.establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, cantidad);
            ps.setInt(2, AlimentoId);
            int filasActualizadas = ps.executeUpdate();
            if(filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Cobro realizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se puso realizar el cobro");
            }
            ps.close();
            conexion.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}*/