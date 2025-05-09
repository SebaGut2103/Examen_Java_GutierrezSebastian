/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author camper
 */
public class Cliente {
    private Integer id;
    private String Nombre;
    private String Represante;
    private String Direccion;
    private String Telefono;
    private String Sector;

    public Cliente(String Nombre, String Represante, String Direccion, String Telefono, String Sector) {
        this.Nombre = Nombre;
        this.Represante = Represante;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Sector = Sector;
    }

    public Cliente(Integer id, String Nombre, String Represante, String Direccion, String Telefono, String Sector) {
        this.id = id;
        this.Nombre = Nombre;
        this.Represante = Represante;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Sector = Sector;
    }

    Cliente(int aInt, String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRepresante() {
        return Represante;
    }

    public void setRepresante(String Represante) {
        this.Represante = Represante;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Nombre=" + Nombre + ", Represante=" + Represante + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Sector=" + Sector + '}';
    }
    
    
}
