package primeraparte;

import java.util.Scanner;

public class exer11 {
	public static void main(String[] args) {
//		Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//		pantalla el siguiente menú:
//
//		MENU
//		1. Sumar
//		2. Restar
//		3. Multiplicar
//		4. Dividir
//		5. Salir
//		Elija opción:
//
//		El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//		pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//		opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
//		programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
//		seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
//		del programa, caso contrario se vuelve a mostrar el menú.
		
		int num1;
		int num2;
		boolean salir = true;
		Scanner exe11 = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		num1= exe11.nextInt();
		System.out.println("Ingrese otro numero");
		num2= exe11.nextInt();
		
		
		while(salir) {
		System.out.println("MENU");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir");
		System.out.println("Elija opcion");
		
		int opcion = exe11.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("La suma de los numeros es de: " + (num1+num2));
			break;
		case 2: 
			System.out.println("La resta de los numeros es de: " + (num1-num2));
			break;
		case 3: 
			System.out.println("La Multiplicacion de los numeros es de: " + (num1*num2));
			break;
		case 4:
			System.out.println("La division de los numeros es de: " + (num1/num2));
			break;
		case 5:
			System.out.println("Esta seguro que quiere salir? S/N");
			String exit = exe11.next();
			exit= exit.toUpperCase().substring(0,1);
			System.out.println(exit);
			if("S".equals(exit)) {
				System.out.println("Usted salio del programa");
				salir = false;
			}
			break;
		default:
			System.out.println("El numero ingresado no forma parte de las opciones");
		}
		}
		
		
	}

}
