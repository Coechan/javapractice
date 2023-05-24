package exerExtra;

import java.util.Scanner;

public class exe7 {
	public static void main(String[] args) {
//		Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//		promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
//		números serán introducidos por el usuario. Realice dos versiones del programa, una
//		usando el bucle “while” y otra con el bucle “do - while”.
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int min;
		int max;
		int avg;
		
		System.out.println("Ingrese la cantidad de numeros que quiere introducir");
		int n = sc.nextInt();
		int [] arrNum = new int [n];
		
		while(i < n) {
			System.out.println("Ingrese un numero random");
			arrNum[i] = sc.nextInt();
			i++;
		}
		
		min = arrNum[0];
		max = arrNum[0];
		avg = arrNum[0]; 
		for (int j = 1 ; j <n ; j++){
			avg = avg + arrNum[j];
			
			if(arrNum[j] <= min) {
				min = arrNum[j];
			}
			if(arrNum[j] >= max) {
				max = arrNum[j];
			}
			
		}
		
		System.out.println("El minimo es: " + min);
		System.out.println("El maximo es: " + max);
		System.out.println("El average es: " + avg/n);
		
	}

}
