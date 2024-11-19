package Modelo;

import java.util.*;

/**
 *
 * @author Carlos guevara
 */
public class DAOProducto {

    // Método para insertar datos en la BD
    public Producto Insertar(String nombre,
            String color, String marca, java.math.BigDecimal precio) {
        String transaccion = "INSERT INTO Producto (nombre,color,marca,precio) VALUES('"
                + nombre + "', '"
                + color + "', '"
                + marca + "', '"
                + precio + "')";
        // Llama al método Actualizar ubicado en Database.java
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Producto(nombre, color, marca, precio);
        }
        return null;
    }

    // Método para actualizar un registro en la BD
    public int Actualizar(int id, String nombre, String color,
            String marca, java.math.BigDecimal precio) {

        String transaccion = "UPDATE Producto SET nombre='"
                + nombre + "', precio='"
                + precio + "', color='"
                + color + "', marca='"
                + marca + "' WHERE id_producto="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Producto";
        // Llama a método Listar de DataBase.java
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Producto> productos = new ArrayList(); //Arreglo de productos
        // Ciclo que recorre cada registro y los agrega al arreglo productos
        for (Map registro : registros) {
            Producto pro = new Producto((int) registro.get("id_producto"),
                    (String) registro.get("nombre"),
                    (String) registro.get("color"),
                    (String) registro.get("marca"),
                    (java.math.BigDecimal) registro.get("precio"));
            productos.add(pro);
        }
        return productos; // Retorna todos los productos ubicados en la tabla BD
    }

    public int Eliminar(int id) {
        String transaccion = "DELETE FROM  Producto WHERE id_producto='" + id + "'";

        return new DataBase().Actualizar(transaccion);
    }

    public List<Producto> BuscarProductos(String nombre) {
        // Corregir la consulta SQL para incluir el nombre de la tabla
        String transaccion = "SELECT * FROM Producto WHERE nombre LIKE '%" + nombre + "%'";

        // Llama al método Listar de DataBase.java para ejecutar la consulta
        List<Map<String, Object>> registros = new DataBase().Listar(transaccion);

        // Lista para almacenar los productos encontrados
        List<Producto> productos = new ArrayList<>();

        // Recorrer los registros devueltos por la consulta y construir objetos Producto
        for (Map<String, Object> registro : registros) {
            Producto pro = new Producto(
                    (int) registro.get("id_producto"), // Asegurarse de que coincide con la columna en la tabla
                    (String) registro.get("nombre"),
                    (String) registro.get("color"),
                    (String) registro.get("marca"),
                    (java.math.BigDecimal) registro.get("precio")
            );
            productos.add(pro);
        }

        // Retornar la lista de productos encontrados
        return productos;
    }

}
