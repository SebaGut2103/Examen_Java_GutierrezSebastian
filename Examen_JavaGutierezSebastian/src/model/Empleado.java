/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author camper
 */
public class Empleado {
    private  Integer id;
    private String Nombre;
    private String Cargo;
    private Double salario ;
    private String Estado;

    public Empleado(String Nombre, String Cargo, Double salario, String Estado) {
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.salario = salario;
        this.Estado = Estado;
    }

    public Empleado(Integer id, String Nombre, String Cargo, Double salario, String Estado) {
        this.id = id;
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.salario = salario;
        this.Estado = Estado;
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

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", Nombre=" + Nombre + ", Cargo=" + Cargo + ", salario=" + salario + ", Estado=" + Estado + '}';
    }
    
    
}
