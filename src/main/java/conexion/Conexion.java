/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Conexion {

    public Connection Conexion() throws SQLException {
        String url = "jdbc:mysql://localhost/tienda";
        String usuario = "johann";
        String contrasenia = "manager";
        Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
        return conexion;
    }
}