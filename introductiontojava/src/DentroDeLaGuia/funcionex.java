package DentroDeLaGuia;
import java.util.Scanner;

public class funcionex {
	public static void main(String[] args) {
//			Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//			en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//			reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//			vocales acentuadas) se mantienen sin cambios.
//			
//			a e i o u
//			@ # $ % *
		
		Scanner fux = new Scanner(System.in);
		String frase;
		System.out.println("Ingrese una palabra");
		frase = fux.nextLine();
		frase = frase.toLowerCase();
		String newQuote;
		System.out.println(codificar(frase));
		
		
	}

	public static String codificar(String quote) {
		String newQuote;
		
		quote= quote.replace("a","@");
		quote= quote.replace("e","#");
		quote= quote.replace("i","$");
		quote= quote.replace("o","%");
		quote= quote.replace("u","*");
		return quote;
	}
	
	
}



