package edu.ucjc.programacion.repaso.poo;

public class Persona {

	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	public Persona (String string) {
	
	}
	public Persona (String nombre, String dni) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Persona (String nombre, String apellidos, String dni, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return this.dni;
	}
	
	public void setDni (String dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	public void correr() {
		if (this.edad<18) {
			System.out.println("Corre muy rápido");}
			else if (edad >= 18 && edad < 40) {
				System.out.println("Corre rápido");
			}
			else{
				System.out.println("Corre lento");
			}
		}
	}



