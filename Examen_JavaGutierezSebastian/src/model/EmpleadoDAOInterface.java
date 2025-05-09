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
public interface EmpleadoDAOInterface {
     void agregarEmpleado(Empleado empleado);
    List<Empleado> listarTodos();
    Empleado buscarPorId(Integer id);
    List<Empleado> buscarPorNombre(String nombre);
    void actualizarEmpleado(Empleado empleado);
    void eliminarEmpleado(Integer id);
}
