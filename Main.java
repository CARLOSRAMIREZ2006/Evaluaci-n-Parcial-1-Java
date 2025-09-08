/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaasignaturas;

/**
 *
 * @author Duoc
 */
import java.util.Scanner;

public class Main {
    private static Estudiante estudiante;
    private static Docente docente;
    private static Asignatura asignatura;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== SISTEMA DE REGISTRO DE ASIGNATURAS ===");
            System.out.println("1. Ingresar Estudiante");
            System.out.println("2. Ingresar Docente");
            System.out.println("3. Ingresar Asignatura");
            System.out.println("4. Calcular Resultados");
            System.out.println("5. Mostrar Notas");
            System.out.println("6. Buscar Estudiante");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1 -> ingresarEstudiante(scanner);
                case 2 -> ingresarDocente(scanner);
                case 3 -> ingresarAsignatura(scanner);
                case 4 -> calcularResultados(scanner);
                case 5 -> mostrarNotas();
                case 6 -> buscarEstudiante();
                case 7 -> {
                    System.out.println("¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    public static void ingresarEstudiante(Scanner scanner) {
        System.out.println("--- INGRESO DE ESTUDIANTE ---");
        System.out.print("Ingrese RUT del estudiante: ");
        String rut = scanner.nextLine();
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();

        estudiante = new Estudiante(rut, nombre, edad, fechaNacimiento);
        System.out.println("Estudiante registrado con éxito.");
    }

    public static void ingresarDocente(Scanner scanner) {
        System.out.println("--- INGRESO DE DOCENTE ---");
        System.out.print("Ingrese RUT del docente: ");
        String rut = scanner.nextLine();
        System.out.print("Ingrese número de docente: ");
        String nroDocente = scanner.nextLine();
        System.out.print("Ingrese nombre del docente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese fecha de ingreso (AAAA-MM-DD): ");
        String fechaIngreso = scanner.nextLine();
        System.out.print("Ingrese sede en la que trabaja el docente: ");
        String sede = scanner.nextLine();

        docente = new Docente(rut, nroDocente, nombre, fechaIngreso, sede);
        System.out.println("Docente registrado con éxito.");
    }

    public static void ingresarAsignatura(Scanner scanner) {
        if (estudiante == null || docente == null) {
            System.out.println("Primero debe ingresar un estudiante y un docente.");
            return;
        }

        System.out.println("--- INGRESO DE ASIGNATURA ---");
        System.out.print("Ingrese código de la asignatura: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre de la asignatura: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        asignatura = new Asignatura(codigo, nombre, estudiante, docente, nota1, nota2, nota3);
        System.out.println("Asignatura registrada con éxito.");
    }

    public static void calcularResultados(Scanner scanner) {
        if (asignatura == null) {
            System.out.println("Primero debe ingresar una asignatura.");
            return;
        }

        System.out.print("Ingrese la nota del examen: ");
        double notaExamen = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        double notaPresentacion = asignatura.calcularNotaPresentacion();
        System.out.println("Nota de presentación: " + notaPresentacion);
        if (asignatura.estaEximido(notaPresentacion)) {
            System.out.println("El estudiante está eximido.");
        } else {
            System.out.println("El estudiante no está eximido.");
        }

        String resultado = asignatura.calcularNotaFinal(notaExamen);
        System.out.println("Resultado final: " + resultado);
    }

    public static void mostrarNotas() {
        if (asignatura == null) {
            System.out.println("Primero debe ingresar una asignatura.");
            return;
        }
        System.out.println("Notas de la asignatura: ");
        System.out.println(asignatura.toString());
    }

    public static void buscarEstudiante() {
        if (estudiante == null) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("Estudiante encontrado: " + estudiante.toString());
    }
}