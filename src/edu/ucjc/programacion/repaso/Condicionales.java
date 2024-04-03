package edu.ucjc.programacion.repaso;

public class Condicionales {

	public static void main(String[] args) {
		int numero = 8;
		boolean cumple = numero > 5;
		if (cumple) {
			System.out.println("Número mayor que 9");
			
		}else if (numero > 6 & numero < 7){
			System.out.println("Número mayor que 6");
		}else if (numero > 4 || numero == 2){
			System.out.println("Número mayor 4 o 2");
		}else {
			System.out.println("Número menor que 6");
		}int option = 3;
		   switch (option){
		   	case 3: System.out.println("El valor es 3");
		   	case 9: System.out.println("El valor es 9");break;
		  	default: System.out.println("El valor es otro");
		   }
	}

}