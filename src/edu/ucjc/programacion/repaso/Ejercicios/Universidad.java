package edu.ucjc.programacion.repaso.Ejercicios;

public class Universidad {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Aitana", "Ocaña", 24, "OT", "tercero", new String[]{"Canto", "dirección de orquesta"});
        Alumno alumno2 = new Alumno("Samuel", "de Luque", 34, "Youtube", "cuarto", new String[]{"IRL", "Derechos de imagen"});
        Alumno alumno3 = new Alumno("Maeb", "Roquetera", 30, "Grado medio FP Estética", "primero", new String[]{"GRWM", "Diseño de eyeliner"});

        
        System.out.println("Información de los alumnos:");
        alumno1.mostrarInfoAlumno();
        alumno2.mostrarInfoAlumno();
        alumno3.mostrarInfoAlumno();
    }
}