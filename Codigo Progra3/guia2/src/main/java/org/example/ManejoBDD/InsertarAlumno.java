package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.*;


public class InsertarAlumno {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "insert into alumnos(nombre,apellido,edad,email) values(?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(consulta);

            stmt.setString(1, "Jeronimo");
            stmt.setString(2,"Aragon");
            stmt.setInt(3,20);
            stmt.setString(4,"Jeronimoismael10@gmail.com");

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
