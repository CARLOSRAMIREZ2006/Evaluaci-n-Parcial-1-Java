/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaasignaturas;

/**
 *
 * @author Duoc
 */
public class Sede {
    private int nroSede;
    private String nombre;
    private String comuna;

    // Constructor
    public Sede(int nroSede, String nombre, String comuna) {
        this.nroSede = nroSede;
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Getters y Setters
    public int getNroSede() {
        return nroSede;
    }

    public void setNroSede(int nroSede) {
        this.nroSede = nroSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Sede: " + nombre + ", Comuna: " + comuna;
    }
}

