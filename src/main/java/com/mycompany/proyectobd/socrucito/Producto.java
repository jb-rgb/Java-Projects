/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd.socrucito;
import com.mycompany.proyectobd.jorge.Inventario;

import com.mycompany.proyectobd.Conexion;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JComboBox;
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
<<<<<<< HEAD

=======
>>>>>>> main
    private int precioDesayunoA;
    private int precioDesayunoB;
    private int precioComidaA;
    private int precioComidaB;

    /*
    public Producto(int id_producto, String nombre_producto, String descripcion_producto, float precio_producto, int cantidad_producto) {
        this.idProducto = id_producto;
        this.nombreProducto = nombre_producto;
        this.descripcionProducto = descripcion_producto;
        this.precioProducto = precio_producto;
        this.cantidadProducto = cantidad_producto;
        this.precioComidaA = 43;
        this.precioComidaB = 48;
        this.precioDesayunoA = 40;
        this.precioDesayunoB = 45;
    }
<<<<<<< HEAD

=======
    */
    
>>>>>>> main
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
    
    public void guardarProducto(JTextField id_producto, JTextField nombre_producto, JTextField descripcion_producto, JTextField precio_producto, JTextField cantidad_producto) {
        String idProductoString = id_producto.getText();
        BigInteger idProductoBigInt = new BigInteger(idProductoString);
        setNombreProducto(nombre_producto.getText());
        setDescripcionProducto(descripcion_producto.getText());
        setPrecioProducto(Float.parseFloat(precio_producto.getText()));
        setCantidadProducto(Integer.parseInt(cantidad_producto.getText()));
        Conexion conec = new Conexion();
        String consulta = "INSERT INTO productos(id_producto, nombre_producto, descripcion_producto, precio_producto, cantidad_producto) VALUES (?, ?, ?, ?, ?);";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setBigDecimal(1, new BigDecimal(idProductoBigInt));
            cs.setString(2, getNombreProducto());
            cs.setString(3, getDescripcionProducto());
            cs.setFloat(4, getPrecioProducto());
            cs.setInt(5, getCantidadProducto());
            cs.execute();
            JOptionPane.showMessageDialog(null, "El producto se guardó correctamente");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void seleccionarProducto(JTable tablaProducto, JTextField id_producto, JTextField nombre_producto, JTextField descripcion_producto, JTextField precio_producto, JTextField cantidad_producto) {
        try {
            int row = tablaProducto.getSelectedRow();
            if(row >= 0) {
                id_producto.setText(tablaProducto.getValueAt(row, 0).toString());
                nombre_producto.setText(tablaProducto.getValueAt(row, 1).toString());
                descripcion_producto.setText(tablaProducto.getValueAt(row, 2).toString());
                precio_producto.setText(tablaProducto.getValueAt(row, 3).toString());
                cantidad_producto.setText(tablaProducto.getValueAt(row, 4).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void actualizarProducto(JTextField id_producto, JTextField nombre_producto, JTextField descripcion_producto, JTextField precio_producto, JTextField cantidad_producto) {
        String idProductoString = id_producto.getText();
        BigInteger idProductoBigInt = new BigInteger(idProductoString);
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
            cs.setFloat(3, getPrecioProducto());
            cs.setInt(4, getCantidadProducto());
            cs.setBigDecimal(5, new BigDecimal(idProductoBigInt));
            cs.execute();
            JOptionPane.showMessageDialog(null, "El producto se actualizó correctamente");
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
        String idProductoString = id_producto.getText();
        BigInteger idProductoBigInt = new BigInteger(idProductoString);
        Conexion conec = new Conexion();
        String consulta = "DELETE FROM productos WHERE id_producto = ?;";
        try {
            CallableStatement cs = conec.establecerConexion().prepareCall(consulta);
            cs.setBigDecimal(1, new BigDecimal(idProductoBigInt));
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
    
    public void cobrarProducto(JTextField idProducto, int id, JTextField cantidadComprada, int cantidad) {
        idProducto.setText(String.valueOf(id));
        cantidadComprada.setText(String.valueOf(cantidad));
        Inventario inventario = new Inventario();
        Timer timer = new Timer();      // variable timer
        long maximumTime = 2 * 60 * 1000;   // Establecer el tiempo máximo de ejecución en 2 minutos
        long startTime = System.currentTimeMillis();    // Guardamos el tiempo de inicio
        Conexion conec = new Conexion();
        String consulta = "UPDATE productos SET cantidad_producto = cantidad_producto - ? WHERE id_producto = ?;";
        try {
            Connection conexion = conec.establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            JOptionPane.showMessageDialog(null, cantidad + ", " + id);
            ps.setInt(1, cantidad);
            ps.setInt(2, id);
            int filasActualizadas = ps.executeUpdate();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Tarea en ejecución");
                    if(filasActualizadas > 0) {
                        JOptionPane.showMessageDialog(null, "Cobro realizado correctamente");
                        inventario.reducirInventario();
                        timer.cancel();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puso realizar el cobro");
                        timer.cancel();
                    }
                    if(System.currentTimeMillis() - startTime > maximumTime) {
                        JOptionPane.showMessageDialog(null, "Tiempo limite alcanzado");
                        timer.cancel();
                    }
                }
            }, 0, 1000);    // Retardo inicial de 0 segundos y repetición cada segundo
            ps.close();
            conexion.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
        
    public void cobrarAlimento(JComboBox<String> comboBox1, JComboBox<String> comboBox2, JTextField cantidadAlimento) {
        String tipoAlimento = (String) comboBox1.getSelectedItem();
        int cantidad = Integer.parseInt(cantidadAlimento.getText());
        Conexion conec = new Conexion();
        String columnaAlimento = "";
        switch (tipoAlimento) {
            case "Desayuno A":
                columnaAlimento = "Desayuno_A";
                break;
            case "Desayuno B":
                columnaAlimento = "Desayuno_B";
                break;
            case "Comida A":
                columnaAlimento = "Comida_A";
                break;
            case "Comida B":
                columnaAlimento = "Comida_B";
                break;
        }
        String consultaCantidad = "SELECT " + columnaAlimento + " FROM productos;";
        String consultaActualizacion = "UPDATE productos SET " + columnaAlimento + " = ?;";
        try {
            Connection conexion = conec.establecerConexion();
            // Obtener la cantidad actual
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(consultaCantidad);
            int cantidadActual = 0;
            if (rs.next()) {
                cantidadActual = rs.getInt(columnaAlimento);
            }
            // Sumar la cantidad seleccionada
            int nuevaCantidad = cantidadActual + cantidad;
            // Actualizar la cantidad en la base de datos
            PreparedStatement ps = conexion.prepareStatement(consultaActualizacion);
            ps.setInt(1, nuevaCantidad);
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Cobro realizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizar el cobro");
            }
            ps.close();
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}