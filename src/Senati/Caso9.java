package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int num_reg = 0, num_cer = 0, num_nocer = 0;
		
		float prom_nota = 0, prom_asis = 0, mayor_prom = 0, menor_prom = 20;
		String estado = "", veces = "S", mayor_nom = "" , menor_nom = "";
		
		while(veces.equals("S") || veces.equals("s")) {
			num_reg ++;
			
			System.out.println("----------------");
			System.out.print("Registro " + num_reg + " : ");
			System.out.print("\n----------------");

			System.out.print("\nNombre de alumno: ");
			String nombre = scn.nextLine();
			
			System.out.print("Nota 1: ");
			float nota1 = scn.nextFloat();
			
			System.out.print("Nota 2: ");
			float nota2 = scn.nextFloat();
			
			System.out.print("Nota 3: ");
			float nota3 = scn.nextFloat();
			
			System.out.print("Asistencia [1-12]: ");
			float asistencia = scn.nextFloat();
			
			System.out.println("----------------");
			System.out.print("---Resultados---");
			System.out.print("\n----------------");
			
			
			
			prom_nota = nota1*0.2f + nota2*0.3f + nota3*0.5f;
			
			prom_asis = asistencia/12 * 100f;
			
			if(prom_nota >= 13 && prom_asis >= 70) 
				estado = "Obtiene Certificado";
			else
				estado = "Sin Certificado";
		
			
			
			System.out.println("\nPromedio: " + df.format(prom_nota));
			System.out.println("Asistencia: " + df.format(prom_asis) + " %");
			System.out.println("Estado: " + estado);
			
			System.out.println("----------------");
			scn.nextLine();
			System.out.print("¿Registrar otro?: [S/N]: " );
			veces = scn.nextLine();
			
			if(mayor_prom < prom_nota) {
				mayor_prom = prom_nota;
				mayor_nom = nombre;
			}
			
			if(menor_prom > prom_nota) {
				menor_prom = prom_nota;
				menor_nom = nombre;
			}
			
			
			
			if(estado.equals("Obtiene Certificado")) 
				num_cer ++;
			else
				num_nocer ++;
			
		}
		
		
		System.out.println("\n-------------------");
		System.out.println("---R E S U M E N---");
		System.out.println("-------------------");
		System.out.println("Número de alumnos: " + num_reg);
		System.out.println("Mayor promedio: " + df.format(mayor_prom) + " pertenece a: " + mayor_nom);
		System.out.println("Menor promedio: " + df.format(menor_prom) + " pertenece a: " + menor_nom);
		System.out.println("Número de alumnos certificados: " + num_cer);
		System.out.println("Número de alumnos no certificados: " + num_nocer);

	}
}