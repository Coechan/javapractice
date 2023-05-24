package primeraparte;

import java.util.Scanner;

public class exer2 {
	
	public static void main(String[] args) {
		
//		Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//		pantalla.
		
		String myName;
		Scanner exe2 = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		myName =  exe2.next();
		System.out.println("el nombre ingresado fue: " + myName);
		
	}

}
