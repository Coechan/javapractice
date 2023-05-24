package DentroDeLaGuia;

import java.util.Scanner;

public class clase1 {

	public static void main(String[] args) {
		
		//number -> int
		//character -> char
		//strings -> String
		//true/false -> boolean
		
		//Scanner to create an input
		//Scanner scannername = new Scanner();
		//String name = scannername.next()
		//int num = scannername.next
		
		
		int num1 ;
		char letter;
		String name;
		boolean trueOrFalse;
		
		trueOrFalse = false;
		name = "Constanza";
		letter ='a';
		num1= 4;
		System.out.println(num1);
		//Deteccion de Errores
		
		String nombre;
		boolean bandera;
		char char1;
		
		int numero = 48;
		double decimales = 3.55;
		bandera = false;
		
		//EJERCICIO 4
		//Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
		//por pantalla.
		
		String name1 = "Constanza";
		int edad = 29;
		
		System.out.println("My name is " + name1 + " and I'm " + edad + " years old");
		
		System.out.println("Write your name");
		String input1 = new Scanner(System.in).next();
		System.out.println("Your name is " + input1);
		
		System.out.println("Enter a random num");
		Scanner justAScanner = new Scanner(System.in);
		//int randomNumber = justAScanner.next();
		//System.out.println(randomNumber);
		//String justALetter = justAScanner.nextLine();
		
		System.out.println("ingresar un char");
		char randomchar = justAScanner.nextLine().charAt(0);
		System.out.println(randomchar);
		
		
		
		//EJERCICIO 6
		//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
		//alguno de ellos es mayor a 25.
		
		double num = 4 ;
		int num10 = 4;
		
		boolean t = (num == num10);
		System.out.println(t);	
		
	}
}
