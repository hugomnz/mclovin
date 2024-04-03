package edu.ucjc.programacion.repaso.strings;

public class prueba {

	public static void main(String[] args) {
		
		String cadena = "texto";
		
		cadena.toUpperCase();
		
		System.out.println(cadena);
		
		String cadena2 = new String("texto");
		String cadena3 = "texto";
		
		System.out.println(cadena==cadena2);
		System.out.println(cadena==cadena3);
		System.out.println(cadena.equals(cadena2));
		
		System.out.println(cadena.contains("te"));
		
		System.out.println(cadena.indexOf("t"));
		System.out.println(cadena.lastIndexOf("t"));
		
		System.out.println(cadena.charAt(2));
		
		String texto = "    Mamabicho   ";
		System.out.println(texto.replace(" ",""));
		System.out.println(texto.trim());
		System.out.println(texto.trim().replace(" "," "));
		
		System.out.println(texto.trim().substring(10));
		System.out.println(texto.trim().substring(10,15));
		
		String dato = "qhifibf;wfef;Wfwf;wfw;44";
		String [] datos= dato.split(";");
		System.out.println(datos[3]);
	}

}
