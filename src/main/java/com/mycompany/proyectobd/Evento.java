/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.proyectobd;
import java.util.Date;
/**
 *
 * @author hp
 */
public class Evento {
    
    private int id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private int numero_platillos;
    private int menu;
    
    
    
     public Evento() {
        // Constructor vacío
    }
    
    public void guardar() {
        // Lógica para guardar el evento en la base de datos
    }
    
    public void actualizar() {
        // Lógica para actualizar el evento en la base de datos
    }
    
    public void eliminar() {
        // Lógica para eliminar el evento de la base de datos
    }
    
    public Evento obtener_por_id(int id) {
        // Lógica para obtener el evento por su ID de la base de datos
        return null;
    }
    
    public Evento[] obtener_por_fecha(Date fecha) {
        // Lógica para obtener los eventos por su fecha de la base de datos
        return null;
    }
    
    // Getters y setters
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getLugar() {
        return lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public int getNumero_platillos() {
        return numero_platillos;
    }
    
    public void setNumero_platillos(int numero_platillos) {
        this.numero_platillos = numero_platillos;
    }
    
    public int getMenu() {
        return menu;
    }
    
    public void setMenu(int menu) {
        this.menu = menu;
    }
    
    
   
}
