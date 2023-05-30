package exerExtra;

import java.util.Scanner;

public class exe18 {
	public static void main(String[] args) {
//		Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//		N, con los valores ingresados por el usuario.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la dimesion del vector");
		int d =sc.nextInt();
		
		int [] arr = new int [d];
		int suma = 0;
		
		for(int i = 0 ; i < d ; i++) {
			System.out.println("Ingrese el valor " + i + " para el vector");
			int num = sc.nextInt();
			suma = suma + num;
			arr[i] = num;
		}
		
		System.out.println("La suma de todos los elementos del vector es de " + suma);
		
		
	
}
}
