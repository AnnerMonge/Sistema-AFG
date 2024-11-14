/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
/**
 *
 * @author yuri guevara
 */
public class Compra {
    private int id_Compra;
    private Date fechacompra;
    private String estadocompra;
    private java.math.BigDecimal cantidadcompra;
    private String metodopago;
    
     public Compra (int id_Compra, Date fechacompra, String estadocompra, java.math.BigDecimal cantidadcompra,
            String metodopago){
        this.id_Compra = id_Compra;
        this.fechacompra = fechacompra;
        this.estadocompra = estadocompra;
        this.cantidadcompra = cantidadcompra;
        this.metodopago = metodopago;
    }
     public Compra (Date fechacompra, String estadocompra, java.math.BigDecimal cantidadcompra,
           String metodopago){
        this.fechacompra = fechacompra;
        this.estadocompra = estadocompra;
        this.cantidadcompra = cantidadcompra;
        this. metodopago =  metodopago;
}

    public int getId_Compra() {
        return id_Compra;
    }

    public void setId_Compra(int id_Compra) {
        this.id_Compra = id_Compra;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getEstadocompra() {
        return estadocompra;
    }

    public void setEstadocompra(String estadocompra) {
        this.estadocompra = estadocompra;
    }

    public java.math.BigDecimal getCantidadcompra() {
        return cantidadcompra;
    }

    public void setCantidadcompra(java.math.BigDecimal cantidadcompra) {
        this.cantidadcompra = cantidadcompra;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }
   }