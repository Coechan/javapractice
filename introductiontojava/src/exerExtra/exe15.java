package exerExtra;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class exe15 {
	public static void main(String[] args) {
//		Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//		restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//		matemática y deben devolver sus resultados para imprimirlos en el main.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		
		System.out.println("Menu");
		System.out.println("Ingrese 1 - Si quiere sumar");
		System.out.println("Ingrese 2 - Si quiere restar");
		System.out.println("Ingrese 3 - Si quiere multiplicar");
		System.out.println("Ingrese 4 - Si quiere dividir");
		int opcion = sc.nextInt();
		
		switch(opcion) {
		case 1: 
			sumar(num1,num2);
			break;
		case 2:
			restar(num1,num2);
			break;
		case 3:
			multiplicar(num1,num2);
			break;
		case 4:
			dividir(num1,num2);
			break;
		default:
			System.out.println("Ingreso una opcion incorrecta");
		}
		
		
	}
	
	public static void sumar(double num1, double num2) {
		System.out.println("El resultado de la suma es de: " + (num1+num2));
	}
	
	public static void restar(double num1, double num2) {
		System.out.println("El resultado de la resta es de: " + (num1-num2));
	}
	
	public static void multiplicar(double num1, double num2) {
		System.out.println("El resultado de la multiplicacion es de: " +(num1*num2));
	}
	
	public static void dividir(double num1, double num2) {
		System.out.println("El resultado de la division es de: " + (num1/num2));
	}

}
