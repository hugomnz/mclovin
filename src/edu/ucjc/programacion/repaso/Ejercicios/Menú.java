package edu.ucjc.programacion.repaso.Ejercicios;
import java.util.Scanner;
public class Menú {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do{System.out.println(" 1. Mostrar matriz \n 2. Pintar cuadro \n 3. Serie Fibonacci \n 4. Salir");
		System.out.println("Introduce una nota");
		Scanner scan1 = new Scanner(System.in);
		opcion = scan1.nextInt();
		switch(opcion) {
		case 1:
			for(int i = 1;i < 10; i++) {
				System.out.println(i+"\t");
				if(i%3==0) {
					System.out.println("\n");
				}
				}
			break;
		case 2: 
			int tamanio = 4;
				for (int i = 0; i < tamanio; i++) {
					for( int j = 0; j < tamanio; j++) {
						if(i == 0 || i == tamanio - 1) {
					System.out.print("* ");
						}else {
							if(j == 0 || j == tamanio -1) {
								System.out.print("* ");
							}else {
								System.out.print("  ");
							}
						}
					}
				}
				System.out.println();
			
			break;
		case 3:
				System.out.println("Introduce números a mostrar de la serie de Fibonacci: ");
				int cantidadNumeros = scan.nextInt();
				int num1 = 0;
				int num2 = 1;
				System.out.println(num1);
				System.out.println(num2);
				for(int i = 0; i<cantidadNumeros -2; i++) {
					int suma = num1 + num2;
					num1 = num2;
					num2 = suma;
				}
				break;
		case 4: System.out.println("Adiós!!");break;
		default: System.out.println("Incorrecto");break;
		}		
		}while (opcion != 4);
		System.out.println("");
		}
	    

}
