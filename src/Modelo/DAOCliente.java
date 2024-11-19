package Modelo;

import java.util.*;

/**
 *
 * @author Carlos guevara
 */
public class DAOCliente {

    public Cliente Insertar(String nombre, String direccion, String telefono) {
        String transaccion = "INSERT INTO Cliente (nombre,direccion,telefono) VALUES('"
                + nombre + "', '"
                + direccion + "', '"
                + telefono + "')";
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Cliente(nombre, direccion, telefono);
        }
        return null;
    }

    public int Actualizar(int id, String nombre, String direccion,
            String telefono) {

        String transaccion = "UPDATE cliente SET nombre='"
                + nombre + "', direccion='"
                + direccion + "', telefono='"
                + telefono + "' WHERE id_cliente="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM cliente";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Cliente> clientes = new ArrayList();

        for (Map registro : registros) {
            Cliente cli = new Cliente((int) registro.get("id_cliente"),
                    (String) registro.get("nombre"),
                    (String) registro.get("direccion"),
                    (String) registro.get("telefono"));
            clientes.add(cli);
        }
        return clientes;
    }

    public int Eliminar(int id) {
        String transaccion = "DELETE FROM Cliente WHERE id_cliente='" + id + "'";

        return new DataBase().Actualizar(transaccion);
    }

}
