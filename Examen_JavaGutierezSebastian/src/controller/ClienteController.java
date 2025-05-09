/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
/**
 *
 * @author camper
 */
public class ClienteController {
        private ClienteDAOInterface clienteDAO;
        public ClienteController(ClienteDAOInterface clienteDAO){
            this.clienteDAO = clienteDAO;
        }
        
        public void agregarCliente(Cliente c){
            if(validarCliente(c)){
                clienteDAO.agregarCliente(c);
            }
        }
        private boolean validarCliente(Cliente c){
            if(c == null) return false;
            if(c.getNombre() == null || c.getNombre().isEmpty())return false;
            if(c.getRepresante() == null || c.getRepresante().isEmpty()) return false;
            if(c.getTelefono() == null || c.getTelefono().isEmpty()) return false;
            if(!(c.getSector().equalsIgnoreCase("Tecnologia") || c.getSector().equalsIgnoreCase("Salud")
                    || c.getSector().equalsIgnoreCase("Educación") || c.getSector().equalsIgnoreCase("Comercio"  ) 
                    || c.getSector().equalsIgnoreCase("Manufactura") ) ) return false;
            return true;
        }
       
}
