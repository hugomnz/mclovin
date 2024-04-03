package edu.ucjc.programacion.repaso;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int n = scan.nextInt ();
		System.out.println(n);
		
		
		if (n >= 0 & n < 5){
			System.out.println("Suspenso");
				
		}else if (n >= 5 & n < 7){
			System.out.println("Aprobado");
				
		}else if (n >= 7 & n < 9){
			System.out.println("Notable");
				
		}else if (n >= 9 & n <= 10){
			System.out.println("Sobresaliente");
				
		}else {
			System.out.println("La nota es incorrecta");
		}
		
		switch(n) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Suspenso");break;
		case 5:
		case 6: System.out.println("Aprobado");break;
		case 7:
		case 8: System.out.println("Notable");break;
		case 9:
		case 10: System.out.println("Sobresaliente");break;
		case 11: System.out.println("La nota es incorrecta");break;
		}
			 
	}

}
