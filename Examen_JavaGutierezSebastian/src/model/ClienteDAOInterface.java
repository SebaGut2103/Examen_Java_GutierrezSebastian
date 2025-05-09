/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author camper
 */
public interface ClienteDAOInterface {
     void agregarCliente(Cliente cliente);
    List<Cliente> listarTodos();
    Cliente buscarPorId(Integer id);
    List<Cliente> buscarPorNombre(String nombre);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
}
