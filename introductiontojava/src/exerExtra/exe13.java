package exerExtra;

import java.util.Scanner;

public class exe13 {
	public static void main(String[] args) {
//		Crear un programa que dibuje una escalera de números, donde cada línea de números
//		comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//		usuario al comenzar. Ejemplo: si se ingresa el número 3:
//		1
//		12
//		123
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para formar una escalerita");
		int num = sc.nextInt();
		
		escalera(num);
		
	}
	
	public static void escalera(int num) {
		for(int i =1 ; i <= num ; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();;
		}
	}

}
