package Caso2;

import java.util.Scanner;

public class EstudianteInteractivo {

    // Clase interna Estudiante con atributos privados
    static class Estudiante {
        private String nombre;
        private int edad;
        private String carrera;

        // Constructor
        public Estudiante(String nombre, int edad, String carrera) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
        }

        // Métodos Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        // Método para mostrar los datos del estudiante
        public void mostrarInformacion() {
            System.out.println("\n Información del Estudiante:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Estudiante ===");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese la carrera: ");
        String carrera = scanner.nextLine();

        // Crear objeto Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(nombre, edad, carrera);

        // Mostrar la información registrada
        estudiante.mostrarInformacion();

        scanner.close();
    }
}
