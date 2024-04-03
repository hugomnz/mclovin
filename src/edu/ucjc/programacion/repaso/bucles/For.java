package edu.ucjc.programacion.repaso.bucles;

public class For {

	public static void main(String[] args) {
		// Primero evalúa la condición y luego ejecuta
		for ( int i = 1, j = 100; i <= 99 && j >= 2; i+=2, j -= 2) {
			System.out.println(i + "-" + j);
		}
		System.out.println("Fin");
	}

}
