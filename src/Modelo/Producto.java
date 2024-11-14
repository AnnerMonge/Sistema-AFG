
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author yuri guevara
 */
public class Producto {
    private int id_producto;
    private String nombre;
    private String color;
    private String marca;
    //private Double precio;
    private java.math.BigDecimal precio;
    
    public Producto (int id_producto, String nombre, String color, String marca,
          java.math.BigDecimal precio){
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }
    
    public Producto (String nombre, String color, String marca,
            java.math.BigDecimal precio){
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public java.math.BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(java.math.BigDecimal precio) {
        this.precio = precio;
    }
    
    
    
}
