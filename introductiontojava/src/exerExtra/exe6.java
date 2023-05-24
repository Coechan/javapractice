package exerExtra;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
//		Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
//		por debajo de 1.60 mts. y el promedio de estaturas en general.
		
		Scanner sc = new Scanner(System.in);
		double alt;
		double debajo = 0;
		int pPorDebajo = 0;
		double prom = 0;
		
		
		System.out.println("Ingresar cantidad de personas");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Ingrese la altura en centimetros");
			alt = sc.nextDouble();
			
			prom = prom + alt;
			
			if(alt <= 160) {
				debajo = debajo + alt;
				pPorDebajo ++;	
			}
			
		}
		System.out.println("El promedio de las estaturas por debajo de 1.60m es de: " + (debajo/100/pPorDebajo) + "m");
		System.out.println("El promerio de las estaturas en general es de: " + (prom/n/100) + "m");
}
}
