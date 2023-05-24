package DentroDeLaGuia;

import java.util.Scanner;

public class doWhileLopp {
	public static void main(String[] args) {
//		Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//		bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
//		el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//		Nota: recordar el uso de la sentencia break.	
		
		int askFor;
		int suma = 0;
		int contador = 0 ;
		Scanner scDo = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese 20 numeros");
			contador ++;
			askFor = scDo.nextInt();
			if(askFor > 0)
			suma = suma + askFor;
			System.out.println("Numero ingresado " + askFor + " van " + contador + " numeros ingresados");
		} while(askFor != 0) ;
		System.out.println("Se capturo el numero 0");
		System.out.println("El total de los numeros ingresados es de " + suma);
	}

}
