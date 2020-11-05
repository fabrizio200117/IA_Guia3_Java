package Senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = scn.nextInt();
		int m = n;
		
		int i = 1;
		int com = 1;
		
		while (i <= n && n <= 7) {
			if (i < n)
				System.out.print(n +" * ");
			
			com = com * n;
			
			if (i == n) {
				System.out.println(n + " = " + com);
				System.out.println("");
			    System.out.println("El factorial es " + m + " es: " + com);
			}
			
			n --;
		}
		   
		if (n > 7) {
		    System.out.println("El numero es superior de 7");
		}
	    
	}

}
		// n = 6
		// Factorial  -> 1 * 2 * 3 * 4 * 5 * 6 = 720
	


