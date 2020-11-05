package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String continuar = "S", empleado = "", m_mayor = "", m_menor = "", m_tardanza = "";
		int num_reg = 0, min = 0, horas = 0, tarifa = 0, nporcentaje = 0, x = 0;
		float sueldoneto = 0, porcentaje = 0, n_mayor = 0, n_menor = 0, t_tardanza = 0;
		
		while(continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			System.out.println("======================");
			System.out.println("Registro de datos " + "(" + num_reg + ")");
			System.out.println("======================");
			
			System.out.print("\nEmpleado: ");
			empleado = scn.nextLine();
			
			System.out.print("Horas trabajadas: ");
			horas = scn.nextInt();
			
			System.out.print("Tarifa por hora: ");
			tarifa = scn.nextInt();
			
			System.out.print("Minutos de tardanza: ");
			min = scn.nextInt();
			
			float sueldobruto = (float)(horas * tarifa);
			float bonificacion =  0;
			if (horas <= 50) {
				bonificacion = 0;
			}else if (horas > 50 && horas <= 60) {
				bonificacion = sueldobruto * 0.02f;
			}else if (horas > 60 && horas <= 70) {
				bonificacion = sueldobruto * 0.08f;
			}else if (horas > 70 && horas <= 80) {
				bonificacion = sueldobruto * 0.13f;
			}else if (horas > 80) {
				bonificacion = sueldobruto * 0.15f;
			}
			float dscnto = 0;
			if (min <= 15) {
				dscnto = 0;
			}else if (min > 15 && min <= 30) {
				dscnto = (0.003f * sueldobruto) * min;
			}else if (min > 30) {
				dscnto = (0.005f * sueldobruto) * min;
			}	
			
			
			sueldoneto = (sueldobruto + bonificacion) - dscnto;
			porcentaje = horas * 100 / 80;
			
			System.out.println("\n====================");
			System.out.println("=====Resultados=====	");
			System.out.println("====================");
			System.out.println("");
			System.out.println("Sueldo bruto....: " + "S/." + df.format(sueldobruto));
			System.out.println("Bonificación....: " + "S/." + bonificacion);
			System.out.println("Descuento.......: " + "S/." + dscnto);
			System.out.println("Sueldo neto.....: " + "S/." + sueldoneto);
			System.out.println("% Alcanzado.....: " + porcentaje + "%");
			System.out.println("\n-----------------------");
			scn.nextLine();
			System.out.print("¿Nuevo empleado? [S|N]: ");
			continuar = scn.nextLine();
			System.out.println("-----------------------");
			System.out.println("");


			if (x == 0) {
				n_menor = sueldoneto;
				x = 1;
			}
		
			if (n_mayor < sueldoneto) {
				n_mayor = sueldoneto;
				m_mayor = empleado;
			}
			if (n_menor > sueldoneto) {
				n_menor = sueldoneto;
				m_menor = empleado;
			}
			if (t_tardanza < min) {
				t_tardanza = min;
			    m_tardanza = empleado;
			}
			
			if (porcentaje > 90) {
				nporcentaje ++;
			}
				
			
		}
		System.out.println("-------------------");		
	    System.out.println(" R E S U M E N ");
	    System.out.println("-------------------");
	    System.out.println("Numero de empleado: " + num_reg);
	    System.out.println("Sueldo neto mayor: " + n_mayor + " pertenece a " + m_mayor);
	    System.out.println("Sueldo neto menor: " + n_menor + " pertenece a " + m_menor);
	    System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + m_tardanza + "(" + (t_tardanza) + " min" +")");
	    System.out.println("Cantidad de empleados con mas del 90% de la meta: " + nporcentaje);
	}

}