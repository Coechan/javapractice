package primeraparte;

import java.util.Scanner;

public class exer7 {
	public static void main(String[] args) {
//		Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//		pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//		investigar la función equals() en Java.
		
		
		String quote;
		
		Scanner exe7 = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");
		quote = exe7.nextLine();
		
		if("eureka".equals(quote)) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
		
		
		//equals -> compara string con un objeto.
	}

}
