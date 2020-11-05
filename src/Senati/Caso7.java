package Senati;

import java.util.Scanner;

public class Caso7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = scn.nextLine();
		
		// for ascendente de 1 a 10 (aumenta de 1 en 1)
		for (int x = 1; x <= 10; x++) {
			System.out.println("Bienvenido " + nombre + " al curso.");
		}	
		// for ascendente de 1 a 10 (aumenta de 2 en 2)
		for (int i = 10; i >= 0; i -=2) {
			System.out.println(i);
		}
	    // int i = 1; 
	    // while (i <= 10){
			
	    // i++;
 		//	}
        
	}
}
