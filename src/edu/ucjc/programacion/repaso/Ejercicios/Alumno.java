package edu.ucjc.programacion.repaso.Ejercicios;

public class Alumno {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String cursando;
    private String curso;
    private String[] asignaturas;

    
    public Alumno(String nombre, String apellidos, int edad, String cursoActual, String curso, String[] asignaturas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cursando = cursoActual;
        this.curso = curso;
        this.asignaturas = asignaturas;
    }


    public void mostrarInfoAlumno() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estudiando: " + cursando);
        System.out.println("Curso: " + curso);
        System.out.println("Asignaturas:");
        for (String asignatura : asignaturas) {
            System.out.println(" - " + asignatura);
        }
        System.out.println();
    }
}
