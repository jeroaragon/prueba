package org.example.ConectarBBD;

import java.sql.*;



public class Testeo {
    public static void main(String[] args) {
        // Obtener instancia única de la conexión
        Connection conexion = ConexionBD.getInstancia().getConexion();

        try {
            // Consulta SQL
            String sql = "SELECT id, nombre FROM alumnos";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println( "Nombre: " + rs.getString("nombre") + "apellido " + rs.getString("apellido"));
            }

            // Cerrar ResultSet y Statement
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar conexión
            ConexionBD.getInstancia().cerrarConexion();
        }
    }
    }

