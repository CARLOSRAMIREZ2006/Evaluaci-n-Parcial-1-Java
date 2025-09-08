/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaasignaturas;

/**
 *
 * @author Duoc
 */
public class Docente {
    private String rut;
    private String nroDocente;
    private String nombre;
    private String fechaIngreso;
    private String sede;

    // Constructor
    public Docente(String rut, String nroDocente, String nombre, String fechaIngreso, String sede) {
        this.rut = rut;
        this.nroDocente = nroDocente;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(String nroDocente) {
        this.nroDocente = nroDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Docente: " + nombre + ", RUT: " + rut;
    }
}

