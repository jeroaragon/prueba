package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarDireccion {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "delete from direcciones where id = ?";
            PreparedStatement stmt = conexion.prepareStatement(consulta);

            stmt.setInt(1,5);

            stmt.executeUpdate();
            stmt.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
          ConexionBD.getInstancia().cerrarConexion();
        }
    }
}
