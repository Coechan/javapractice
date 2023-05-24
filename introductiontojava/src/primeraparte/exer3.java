package primeraparte;

import java.util.Scanner;

public class exer3 {
	
	public static void main(String[] args) {
//		Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//		en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//		Java.
		
		String quote;
		Scanner exe3 = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		quote =  exe3.nextLine();
		
		//next() primera palabra
		//nextLine() frase
		
		
		System.out.println("La frase ingresada en mayusculas: " + quote.toUpperCase());
		System.out.println("La frase ingresada en minisculas: " + quote.toLowerCase());
	}

}
