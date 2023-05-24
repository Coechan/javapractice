package primeraparte;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class exer8 {
	public static void main(String[] args) {
//		Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
//		el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
//		por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//		“INCORRECTO”. Nota: investigar la función Lenght() en Java.
		
		String quote;
		
		Scanner exe8 = new Scanner(System.in);
		
		System.out.println("Ingrese una frase o palabras de hasta 8 caracteres");
		
		quote = exe8.nextLine();
		if(quote.length() == 8) {
			System.out.println("El ingreso es correcto, el largo es de 8");
		} else {
			System.out.println("El ingreso es incorrecto, el largo no es de 8");
		}
		
	}

}
