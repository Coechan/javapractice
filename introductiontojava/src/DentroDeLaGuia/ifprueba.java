package DentroDeLaGuia;

import java.util.Scanner;

public class ifprueba {
	public static void main(String[] args) {
	//	Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
	//	alguno de ellos es mayor a 25.
		
			//declaro variables enteras
		int num1;
		int num2;
		
		//declaro el scanner
		Scanner scan1 = new Scanner(System.in);
	
		//pido los datos al usuario
		System.out.println("ingrese un numero");
		num1 = scan1.nextInt();
		System.out.println("ingrese otro numero");
		num2 = scan1.nextInt();
		
		// if == al SI
		if (num1 >25 && num2>25) {
		System.out.println("ambos son mayores a 25");
		} else if (num1 >25 || num2>25) { // es igual al sino si
			System.out.println("uno de los dos numeros es mayor a 25");
		} else  { // es igual al sino
			System.out.println("ninguno de los dos es mayor a 25");
		}
	
	}
}
