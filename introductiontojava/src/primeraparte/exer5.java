package primeraparte;

import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
//		Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//		doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//		Math.sqrt().
		
		int num;
		
		Scanner exe5 = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		num = exe5.nextInt();
		
		System.out.println("El numero ingresado: " + num);
		System.out.println("El doble del numero ingresado: " + (num*2));
		System.out.println("El triple del numero ingresado: " + (num*3));
		System.out.println("La raiz cuadrada del numero ingresado: " + Math.sqrt(num) );
		
		
		
	}

}
