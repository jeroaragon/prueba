package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDireccion {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "insert into direcciones(calle,altura,alumno_id) values(?,?,?) " ;
            PreparedStatement stmt = conexion.prepareStatement(consulta);

            stmt.setString(1,"arturo alio");
            stmt.setInt(2,180);
            stmt.setInt(3,6);

            stmt.executeUpdate();

            stmt.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            ConexionBD.getInstancia().cerrarConexion();
        }
    }
}
