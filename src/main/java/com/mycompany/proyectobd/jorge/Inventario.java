package com.mycompany.proyectobd.jorge;

import com.mycompany.proyectobd.Conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorge
 */
public class Inventario {
    private int idInventario;
    private int idProducto;
    
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public void mostrarInventario(JTable tablaInventario) {
        Conexion conec = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_inventario");
        modelo.addColumn("id_producto");
        
    }
}
