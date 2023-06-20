package primeraparte;

import java.util.Scanner;

public class exer14 {
	public static void main(String[] args) {
//		Crea una aplicación que a través de una función nos convierta una cantidad de euros
//		introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//		función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//		una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//		(void).
//		El cambio de divisas es:
//		* 0.86 libras es un 1 €
//		* 1.28611 $ es un 1 €
//		* 129.852 yenes es un 1 €
		
		int euros;
		String moneda;
		
		Scanner exe14 = new Scanner(System.in);
		
		System.out.println("Ingrese el monto de euros a convertir");
		euros = exe14.nextInt();
		System.out.println("Ingrese la moneda a convertir: dolares, yenes o libras");
		moneda = exe14.next();
		
		moneda= moneda.toLowerCase();
		
		convertir(euros,moneda);
		
	}
	
	public static void convertir(int mon1, String mon2) {
		
		switch(mon2) {
		case "dolares":
			System.out.println("Los " + mon1 + " euros son: " + (mon1* 1.28611) + " dolares." );
			break;
		case "libras":
			System.out.println("Los " + mon1 + " euros son: " + (mon1* 0.86) + " libras.");
			break;
		case "yenes":
			System.out.println("Los " + mon1 + " euros son: " + (mon1* 126.852) + " yenes.");
			break;
		default:
			System.out.println("No ingreso una moneda valida.");
			
		}
		
		
	}

}
