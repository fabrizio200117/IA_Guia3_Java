package Senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		int i = 1;
		
		int menor = 0;
		
		while (i <= 5) {
			System.out.print("Ingrese número " + i + ": ");
			n = sc.nextInt();
			
			if (i == 1)
				menor = n;			
			
			if (n < menor)
				
				menor = n;
								
			i++;
			
		}
		
		
		System.out.println("El número menor es: " + menor);
	}

}