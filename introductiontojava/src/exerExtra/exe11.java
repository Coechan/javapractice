package exerExtra;

import java.util.Scanner;

public class exe11 {
	public static void main(String[] args) {
//		Escribir un programa que lea un número entero y devuelva el número de dígitos que
//		componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//		deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
//		operador de división. Nota: recordar que las variables de tipo entero truncan los
//		números o resultados.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		
		int num = sc.nextInt();
		int contador=0;
		while (num != 0) {
			num = num /10;
			contador ++;
		}
		
		System.out.println("El numero tiene " + contador + " digitos");
		
		//solo soporta hasta 10 digitos.
	}
}
