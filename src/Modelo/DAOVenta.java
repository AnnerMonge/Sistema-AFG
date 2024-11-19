package Modelo;

import java.util.*;
import java.sql.Date;

/**
 *
 * @author yuri guevara
 */
public class DAOVenta {

    public Venta Insertar(int id_cliente, String metodopagov, Date fechaventa, String estadoventa) {
        String transaccion = "INSERT INTO venta (id_cliente,metodopagov,fechaventa,estadoventa) VALUES('"
                + id_cliente + "', '"
                + metodopagov + "', '"
                + fechaventa + "', '"
                + estadoventa + "')";
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Venta(id_cliente, metodopagov, fechaventa, estadoventa);
        }
        return null;
    }

    public int Actualizar(int id_Venta, int id_Cliente, String metodopagov, Date fechaventa,
            String estadoventa) {

        String transaccion = "UPDATE Venta SET id_cliente='"
                + id_Cliente + "', metodopagov='"
                + metodopagov + "', fechaventa='"
                + fechaventa + "', estadoventa='"
                + estadoventa + "' WHERE id_venta="
                + id_Venta;
        return new DataBase().Actualizar(transaccion);
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM venta";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Venta> Ventas = new ArrayList();

        for (Map registro : registros) {
            Venta ven = new Venta((int) registro.get("id_venta"),
                    (int) registro.get("id_cliente"),
                    (String) registro.get("metodopagov"),
                    (Date) registro.get("fechaventa"),
                    (String) registro.get("estadoventa"));
            Ventas.add(ven);
        }
        return Ventas;
    }

    public int Eliminar(int id) {
        String transaccion = "DELETE FROM Venta WHERE id_Venta='" + id + "'";

        return new DataBase().Actualizar(transaccion);
    }

}
