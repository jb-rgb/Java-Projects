package com.mycompany.proyectobd.jorge;

/**
 *
 * @author jorge
 */
public class Inventario {
    private int idInventario;
    private int idProducto;
    private int cantidad;
    
    public Inventario() {
        this.cantidad = 0;
    }
    
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void guardar() {
        
    }
    
    public void actualizar() {
        
    }
    
    public void eliminar() {
        
    }
    
    public void obtenerPorIdInventario() {
        
    }
    
    public void obtenerPorProducto() {
        
    }
}
