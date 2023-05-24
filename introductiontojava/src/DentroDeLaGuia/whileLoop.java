package DentroDeLaGuia;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
//		Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//		pedirá de nuevo hasta que la nota sea correcta.
		
		int nota;
		Scanner scWhile = new Scanner (System.in);
		
		boolean check = true;
		
		while(check) {
			System.out.println("Ingrese una nota para corroborar si esta correcta");
			nota= scWhile.nextInt();
			//check = !(nota >= 0 && nota <= 10);
			if (!(nota >= 0 && nota <= 10)) {
				System.out.println("La nota es incorrecta");
			} else {
				System.out.println("La nota ingresada es correcta");
				check = false;
			}
		}
		
	}

}
