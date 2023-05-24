package primeraparte;

import java.util.Scanner;

public class exer12 {
	public static void main(String[] args) {
//	Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//	dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//	fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//	ser X y el último tiene que ser una O.
//	Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//	especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//	distinta de FDE, que no respete el formato se considera incorrecta.
//	Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//	e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//	siguientes funciones de Java Substring(), Length(), equals().
	
		String cadena;
		int CC = 0;
		int CI = 0;
		boolean FDE = true;
		Scanner exe12 = new Scanner(System.in);		
		
		while(FDE) {
			System.out.println("Ingrese una cadena de caracteres");
			cadena= exe12.nextLine();
			cadena= cadena.toUpperCase();
			FDE = !("&&&&&".equals(cadena));	
			if ( cadena.length() == 5 && "X".equals(cadena.substring(0, 1)) && "O".equals(cadena.substring(3, 4)) ) {
				System.out.println("La secuencia ingresada es correcta");
				CC ++;
				
			} else {
				System.out.println("La secuencia ingresada es incorrecta");
				CC ++;
			}			
		
		}
		
		System.out.println("Usted a ingresado la secuencia '&&&&&' y ha salido del programa");
		System.out.println("Ingresos de secuencia Correctos: " + CC);
		System.out.println("Ingresos de secuencia Correctos: " + CI);
	}
}
