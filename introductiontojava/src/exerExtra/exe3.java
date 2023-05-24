package exerExtra;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
//		Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//		Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
//		String.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		char vocal = sc.next().charAt(0);
		
		switch(vocal) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Es una vocal");
			break;
		default:
			System.out.println("No es una vocal");
		}
		
		
		
	}

}
