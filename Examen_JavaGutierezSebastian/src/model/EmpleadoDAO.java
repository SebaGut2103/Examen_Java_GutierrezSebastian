/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.util.*;
import util.DataBasesConnection;
/**
 *
 * @author camper
 */
public class EmpleadoDAO implements EmpleadoDAOInterface{
    private Connection conn;

    public EmpleadoDAO() {
     conn = util.DataBasesConnection.getConnection();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        String sql = "insert into Cliente (Nombre, Representante, Correo, Teléfono, Dirección, Sector) values (?,?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setString(2, empleado.getCargo());
            pstmt.setDouble(3, empleado.getSalario());
            pstmt.setString(4, empleado.getEstado());
        } catch (SQLException e) {
            System.err.println("Error al agregar el cliente: " + empleado + "\n" + e.getMessage() );
        }
    }

    @Override
    public List<Empleado> listarTodos() {
        List<Empleado> lstemEmpleado = new ArrayList<Empleado>();

        String sql = "select * from Empleado";

        try (Statement stmt = conn.createStatement();
             ResultSet rs =stmt.executeQuery(sql)) {

            while(rs.next()) {
                Empleado empleado  = new Empleado(
                        rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getString("Cargo"),
                        rs.getDouble("Salario"),
                        rs.getString("Estado")
                );

                lstemEmpleado.add(empleado);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar todos los Empleados: " + e.getMessage() );
        }

        return lstemEmpleado;
    }

    @Override
    public Empleado buscarPorId(Integer id) {
        Empleado empleado = null;

        String sql = "select * from Empleado where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs =stmt.executeQuery(sql);

            if(rs.next()) {
                 empleado = new Empleado(
           rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getString("Cargo"),
                        rs.getDouble("Salario"),
                        rs.getString("Estado")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al listar todos los Empleados: " + e.getMessage() );
        }

        return empleado;
    }

    @Override
    public List<Empleado> buscarPorNombre(String nombre) {
        return List.of();
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {

    }

    @Override
    public void eliminarEmpleado(Integer id) {

    }
}
