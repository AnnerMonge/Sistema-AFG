/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author yuri guevara
 */
public class Venta {
    private int id_Venta;
    private int id_Cliente;
    private String metodopagov;
    private Date fechaventa;
    private String estadoventa;

        public Venta(int id_Venta, int id_Cliente, String metodopagov, Date fechaventa, String estadoventa) {
        this.id_Venta = id_Venta;
        this.id_Cliente = id_Cliente;
        this.metodopagov = metodopagov;
        this.fechaventa = fechaventa;
        this.estadoventa = estadoventa;
    }
    
    public Venta(int id_Cliente, String metodopagov, Date fechaventa, String estadoventa) {
        this.id_Cliente = id_Cliente;
        this.metodopagov = metodopagov;
        this.fechaventa = fechaventa;
        this.estadoventa = estadoventa;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getMetodopagov() {
        return metodopagov;
    }

    public void setMetodopagov(String metodopagov) {
        this.metodopagov = metodopagov;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getEstadoventa() {
        return estadoventa;
    }

    public void setEstadoventa(String estadoventa) {
        this.estadoventa = estadoventa;
    }


    
      
    
}


