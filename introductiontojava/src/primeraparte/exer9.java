package primeraparte;

import java.util.Scanner;

public class exer9 {
	public static void main(String[] args) {
//		Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//		es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
//		que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
//		investigar la función Substring y equals() de Java.
		
		
		String quote;
		
		Scanner exe9 = new Scanner(System.in);
		
		System.out.println("Ingrese una frase o palabra que empiece con A");
		quote = exe9.nextLine();
		
		quote= quote.toUpperCase();
		
		// guardar el primer char con charAt(), en una variable tipo char
		//comparar con char '' A;
		//funciona porque es un tipo de dato, pero con String no, porque es un objeto? 
		
		char primeraLetra = quote.charAt(0);
		
		if( 'A' == primeraLetra ) {
			System.out.println("CORRECTO");
		} else {
			System.out.println("INCORRECTO");
		}
		
	
		
		if("A".equals(quote.substring(0, 1))) {
			System.out.println("CORRECTO");
		} else {
			System.out.println("INCORRECTO");
		}
		
	}

}
