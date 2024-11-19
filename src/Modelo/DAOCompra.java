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
public class DAOCompra {

    public Compra Insertar(Date fechacompra, String estadocompra,
            java.math.BigDecimal cantidadcompra, String metodopago) {
        String transaccion = "INSERT INTO Compra (fechacompra,estadocompra,cantidadcompra,metodopago) VALUES('"
                + fechacompra + "', '"
                + estadocompra + "', '"
                + cantidadcompra + "', '"
                + metodopago + "')";
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Compra(fechacompra, estadocompra, cantidadcompra, metodopago);
        }
        return null;
    }

    public int Actualizar(int id, Date fechacompra, String estadocompra,
            java.math.BigDecimal cantidadcompra, String metodopago) {

        String transaccion = "UPDATE Compra SET fechacompra='"
                + fechacompra + "', estadocompra='"
                + estadocompra + "', cantidadcompra='"
                + cantidadcompra + "', metodopago='"
                + metodopago + "'WHERE id_compra="
                + id;

        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Compra";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Compra> compras = new ArrayList();

        for (Map registro : registros) {
            Compra com = new Compra((int) registro.get("id_compra"),
                    (Date) registro.get("fechacompra"),
                    (String) registro.get("estadocompra"),
                    (java.math.BigDecimal) registro.get("cantidadcompra"),
                    (String) registro.get("metodopago"));
            compras.add(com);
        }
        return compras;
    }

    public int Eliminar(int id) {
        String transaccion = "DELETE FROM Compra WHERE id_compra='" + id + "'";

        return new DataBase().Actualizar(transaccion);
    }

}
