package edu.ucjc.programacion.repaso.poo;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(null);
		
		Persona persona5 = new Persona("Eva");
		
		persona1.nombre = "Eva";
		System.out.println(persona1.nombre);
		System.out.println(persona1.dni);
		System.out.println(persona1.edad);
		
		String nombre = "Luis";
		Persona persona2 = new Persona(nombre, "111A");
		System.out.println(persona2.nombre);
		
		Persona persona3 = new Persona("Nombre1","Apellido1");
		Persona persona4 = persona2;
		persona2 = persona3;
		
		persona2.setEdad(26);
		
		System.out.println(persona3.edad);
	}

}
