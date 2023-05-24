package DentroDeLaGuia;

import java.util.Scanner;

public class FuncionesVoid {
	public static void main(String[] args) {
//		Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//		que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//		segundo, sino informe que no lo son.
		
		Scanner fux = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Ingrese un numero");
		num1 = fux.nextInt();
		System.out.println("Ingrese otro numero");
		num2 = fux.nextInt();
		
		esMultiplo(num1,num2);
		
		
	}
	
	public static void esMultiplo(int num1, int num2){
		
		if(num1%num2 == 0) {
			System.out.println("El numero " + num1 + " es multiplo de " + num2);
		} else {
			System.out.println("El numero " + num1 + " no es multiplo de " + num2);
		}
		
	}

}
