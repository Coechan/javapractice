package exerExtra;

import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {
//		Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//		usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
		
		int min;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Ingrese el valor de lo minutos para calcular las hs y dias equivalentes");
		min = sc.nextInt();
		
		hsDias(min);
		
	}
	
	public static void hsDias(int min) {
		int hs;
		int dias;
		
		 hs = min / 60;
		 dias = hs/24;
		 System.out.println("Los " + min + " minutos son, " + hs + " horas y " + dias + " dias.");
		 
	}
}
