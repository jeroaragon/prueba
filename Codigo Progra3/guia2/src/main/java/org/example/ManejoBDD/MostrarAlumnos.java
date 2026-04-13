package org.example.ManejoBDD;

import org.example.ConectarBBD.ConexionBD;

import java.sql.*;

public class MostrarAlumnos {

    public static void main(String[] args) {
        try{
            Connection conexion = ConexionBD.getInstancia().getConexion();
            String consulta = "select a.nombre,a.apellido,a.edad,d.calle,d.altura from alumnos a join direcciones d on a.id = d.alumno_id";
            PreparedStatement stmt = conexion.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                System.out.println("nombre: " + rs.getString("a.nombre")+
                        " apellido: " + rs.getString("a.apellido") +
                        " edad: " + rs.getString("a.edad") +
                        " calle: " + rs.getString("d.calle") +
                        " altura: " + rs.getString("d.altura")
                        );
            }
            stmt.close();
            rs.close();


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            ConexionBD.getInstancia().cerrarConexion();
        }
    }
}
