package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarAlumno {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "delete from alumnos where id = ? ";
            PreparedStatement stmt = conexion.prepareStatement(consulta);

            stmt.setInt(1,6);

            stmt.executeUpdate();
            stmt.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
