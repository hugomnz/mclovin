package edu.ucjc.ejercicios.poo.ejercicio3;

import edu.ucjc.ejercicios.poo.Alumno;
import edu.ucjc.ejercicios.poo.Utilidades;

public class MenuUniversidad {

	public static void main(String[] args) {
		
//		int edad = Utilidades.pideDatoEntero("Introduce tu edad");
//		System.out.println(edad);
//		String nombre = Utilidades.pideDatoString("Introduce tu nombre");
//		System.out.println("nombre: "+nombre);
		int opcion = 0;
		Alumno[] alumnos = null;
		MenuUniversidad menu = new MenuUniversidad();
		do {
			String[] opciones = {"1. Crear Universidad","2. Insertar Alumnos","3. Buscar Alumno","4. Salir"};
			Utilidades.pintarMenu(opciones);
			opcion = Utilidades.pideDatoEntero("Introduce una opción");
			System.out.println("Opción seleccionada "+opcion);
			switch(opcion) {
				case 1:
					int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos de la Universidad");
					alumnos = new Alumno[numAlumnos];
					
					break;
				case 2: 
					if (alumnos!=null) {
						
					}
					
					break;
				case 3: break;
				case 4: System.out.println("Adios!!!");break;
				default: System.out.println("Opción incorrecta");
			}
			
		}while(opcion!=4);
		
	}

	private void crearUniversidad() {
		int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos de la Universidad");
		
		Alumno[] alumnos = new Alumno[numAlumnos];
	}
	
	private void insertarAlumnos() {
		
	
		
	}
	
	
}