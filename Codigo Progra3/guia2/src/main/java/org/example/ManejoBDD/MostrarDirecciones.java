package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarDirecciones {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "select a.nombre,d.calle,d.altura from direcciones d join alumnos a on d.alumno_id = a.id where a.id = 6;";
            PreparedStatement stmt = conexion.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                System.out.println("nombre: " + rs.getString("a.nombre")+
                        " calle: " + rs.getString("d.calle") +
                        " altura: " + rs.getString("d.altura")
                );
            }
            rs.close();
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
