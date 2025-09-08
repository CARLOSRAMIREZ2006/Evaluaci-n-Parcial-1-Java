/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaasignaturas;

/**
 *
 * @author Duoc
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private Docente docente;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Asignatura(String codigo, String nombre, Estudiante estudiante, Docente docente, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Métodos para cálculo de nota
    public double calcularNotaPresentacion() {
        return (nota1 * 0.4) + (nota2 * 0.4) + (nota3 * 0.2);
    }

    public boolean estaEximido(double notaPresentacion) {
        return notaPresentacion >= 5.5;
    }

    public String calcularNotaFinal(double notaExamen) {
        double notaPresentacion = calcularNotaPresentacion();
        double notaFinal = (notaPresentacion * 0.7) + (notaExamen * 0.3);
        if (notaFinal >= 4.5) {
            return "Aprobado: " + notaFinal;
        } else {
            return "Reprobado: " + notaFinal;
        }
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Asignatura: " + nombre + ", Código: " + codigo + ", Estudiante: " + estudiante.getNombre() + ", Docente: " + docente.getNombre();
    }
}

