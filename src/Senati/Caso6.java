package Senati;

import java.util.Scanner;

public class Caso6 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String continuar = "S", nombre = "", estado = "";
		int num_reg = 0, edad = 0, num_aptos = 0;
		
		while (continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			System.out.println("--------------------");
			System.out.println("Registo de datos " + num_reg + ": ");
			System.out.println("--------------------");

			System.out.print("Nombre del participante: ");
			nombre = scn.nextLine();
			System.out.print("Edad: " );
			edad = scn.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				num_aptos++;
			}
			else 
				estado = "Menor de edad";
			
			
			System.out.println("Estado del participante: " + estado);
			
			scn.nextLine();
			
			System.out.print("¿Desea registar otro participante? [S/N]: ");
			continuar = scn.nextLine();
			
			
		}
		
		System.out.println(" RESUMEN ");
		System.out.println("-------------------------------------");
		System.out.println("Participantes registrados: " + num_reg);
		System.out.println("Cantidad de participantes aptos para votar: " + num_aptos);


	}

}
