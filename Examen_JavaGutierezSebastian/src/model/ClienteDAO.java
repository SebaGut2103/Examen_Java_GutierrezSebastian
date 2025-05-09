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
public class ClienteDAO implements ClienteDAOInterface{
         private Connection conn;

    public ClienteDAO() {
     conn = util.DataBasesConnection.getConnection();
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        String sql = "insert into Cliente (Nombre, Representante, Correo, Teléfono, Dirección, Sector) values (?,?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getRepresante());
            pstmt.setString(2, cliente.getDireccion());
            pstmt.setString(2, cliente.getTelefono());
            pstmt.setString(2, cliente.getSector());
        } catch (SQLException e) {
            System.err.println("Error al agregar el cliente: " + cliente + "\n" + e.getMessage() );
        }
    }

    @Override
    public List<Cliente> listarTodos() {
        List<Cliente> lstCliente = new ArrayList<Cliente>();

        String sql = "select * from Cliente";

        try (Statement stmt = conn.createStatement();
             ResultSet rs =stmt.executeQuery(sql)) {

            while(rs.next()) {
                Cliente cliente  = new Cliente(
                        rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getString("Representante"),
                        rs.getString("Correo"),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        rs.getString("Sector")
                );

                lstCliente.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar todos los clientes: " + e.getMessage() );
        }

        return lstCliente;
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        Cliente cliente = null;

        String sql = "select * from Cliente where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs =stmt.executeQuery(sql);

            if(rs.next()) {
                 cliente = new Cliente(
                      rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getString("Representante"),
                        rs.getString("Correo"),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        rs.getString("Sector")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al listar todos los clientes: " + e.getMessage() );
        }

        return cliente;
    }

    @Override
    public List<Cliente> buscarPorNombre(String nombre) {
        return List.of();
    }

    @Override
    public void actualizarEstudiante(Cliente cliente) {

    }

    @Override
    public void eliminarEstudiante(Integer id) {

    }
}
