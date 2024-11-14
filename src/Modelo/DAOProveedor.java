/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author yuri guevara
 */
public class DAOProveedor {
    public Proveedor Insertar(String nombre, String direccion,String telefono, 
            String email){
        String transaccion = "INSERT INTO Proveedor (nombre,direccion,telefono,email) VALUES('"
                + nombre + "', '"
                + direccion + "', '"
                + telefono + "', '"
                + email + "')";
        if (new DataBase().Actualizar(transaccion) >0) {
            return new Proveedor ( nombre,direccion, telefono, email);
        }
        return null;
    }
    
    public int Actualizar(int id, String nombre, String direccion, 
            String telefono, String email) {
        
        String transaccion = "UPDATE Proveedor SET nombre='"
                + nombre + "', direccion='"
                + direccion + "', telefono='"
                + telefono + "', email='"
                + email + "' WHERE id_proveedor="
                + id ;
        
        return new DataBase().Actualizar(transaccion);
    } 
    
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Proveedor";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Proveedor> proveedores = new ArrayList();
        
        for (Map registro : registros){
            Proveedor prov = new Proveedor ((int) registro.get("id_proveedor"),
                    (String) registro.get("nombre"),
                    (String) registro.get("direccion"),
                    (String) registro.get("telefono"),
                    (String) registro.get("email"));
            proveedores.add(prov);
        }
        return proveedores;
    }
    
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Proveedor WHERE id_proveedor='"+ id +"'";
        
        return new DataBase().Actualizar(transaccion);
    }
    
}
