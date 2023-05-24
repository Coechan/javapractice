package primeraparte;

import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
//		Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//		dos. El programa deberá después mostrar el resultado de la suma
		
		int num1;
		int num2;
		
		Scanner exe1 = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		num1 = exe1.nextInt();
		
		System.out.println("Ingrese otro numero");
		num2 = exe1.nextInt();
		
		int suma = num1 + num2;
		System.out.println("El resultado de la suma es de: " + suma);
		
	}

}
