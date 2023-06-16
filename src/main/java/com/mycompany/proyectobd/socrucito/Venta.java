/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd.socrucito;

/**
 *
 * @author socru
 */

public class Venta {

    private int id_venta;
    private int producto_id;
    private int usuario_id;
    private int cantidad = 1;
    private String fecha_venta;

    public Venta() {
    }

    public Venta(int id_venta, int producto_id, int usuario_id, int cantidad, String fecha_venta) {
        this.id_venta = id_venta;
        this.producto_id = producto_id;
        this.usuario_id = usuario_id;
        this.cantidad = cantidad;
        this.fecha_venta = fecha_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    //Metodos

    public void guardar() {
        //para guardar la venta en la base de datos
    }

    public Venta obtener_por_id(int id) {
        //para obtener la venta por su ID de la base de datos
        return null;
    }

    public Venta[] obtener_por_usuario(int usuario_id) {
        //para obtener las ventas por su usuario de la base de datos
        return null;
    }

    public Venta[] obtener_por_fecha(String fecha) {
        // para obtener las ventas por su fecha de la base de datos
        return null;
    }
}
