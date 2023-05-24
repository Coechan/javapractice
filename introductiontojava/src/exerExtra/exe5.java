package exerExtra;

import java.util.Scanner;

public class exe5 {
	public static void main(String[] args) {
//	Una obra social tiene tres clases de socios:
//		o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//		todos los tipos de tratamientos.
//		o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
//		para los mismos tratamientos que los socios del tipo A.
//		o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//		tratamientos.
//		o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//		real que represente el costo del tratamiento (previo al descuento) y determine el
//		importe en efectivo a pagar por dicho socio.
		
		Scanner sc = new Scanner(System.in);
		char tipo;
		double monto;
		
		System.out.println("Ingrese su tipo de socio A,B,C");
		tipo = sc.next().charAt(0);
	
		System.out.println("Ingrese el costo del tratamiento");
		monto =  sc.nextInt();
		
		costoTratamiento(monto,tipo);

	}
	
	public static void costoTratamiento(double monto, char tipo) {
		
		//tipo = tipo.toUpperCase();
		if(tipo == 'a' ||tipo == 'A' ) {
			monto =  monto * 0.5;
			System.out.println("El costo a pagar es de: $" + monto+ " tiene un descuento del 50%");
		} else if(tipo == 'b' || tipo == 'B') {
			monto =  monto * 0.35;
			System.out.println("El costo a pagar es de: $" + monto+ " tiene un descuento del 35%");
		} else {
			System.out.println("El costo a pagar es de: $" + monto);
		}
	}
	
}
