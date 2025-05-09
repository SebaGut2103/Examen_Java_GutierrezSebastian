/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.*;
/**
 *
 * @author camper
 */
public class DataBasesConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/EficientesSAS";
    private static final String USER = "campus2023";
    private static final String PASSWORD = "campus2023";
    private static Connection conn = null;

    public DataBasesConnection() {
        this.conn = null;
    }

    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }

        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();;
                conn = null;
            } catch (SQLException e) {
                System.err.println("Error al desconectar de la base de datos: " + e.getMessage());
            }
        }
    }
    
}


