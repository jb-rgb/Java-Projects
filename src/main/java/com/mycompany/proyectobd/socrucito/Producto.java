/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobd.socrucito;

/**
 *
 * @author socru
 * puto el que lo lea;
 * propiedades: id int, nombre string, descripcion string, precio_unitario decimal
 * metodos
 * constructor, guardar, actualizar, eliminar
 */
public class Producto {
   private int id;
   private String nombre;
   private float precio_unitario;
   private String descripcion;

   public Producto(int id, String nombre, float precio_unitario, String descripcion) {
      this.id = id;
      this.nombre = "nombre";
      this.precio_unitario = precio_unitario;
      this.descripcion = "descripcion";
   }

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

   public float getPrecio_unitario() {
      return precio_unitario;
   }

   public void setPrecio_unitario(float precio_unitario) {
      this.precio_unitario = precio_unitario;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
}

