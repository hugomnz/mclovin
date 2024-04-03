package edu.ucjc.programacion.repaso.arrays;

public class ejercicioEmails {

	public static void main(String[] args) {
		String [] emails = {
				"Raquel@raquel.raq",
				"Alvaro@alva.alv",
				"Isabella@isab.isa"};
		for(String email : emails) {
			System.out.println(email);
			boolean isValid = true;
			String mensaje = "";
			email = email.trim();
			
			if (email.contains(" ")) {
				isValid = false;
				mensaje += "Tiene espacio/s";
			}
			if (email.contains("@")) {
				isValid = false;
				mensaje = "Tiene arroba/s";
			}
		}
	}

}
