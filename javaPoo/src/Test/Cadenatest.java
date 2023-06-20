package Test;

import java.util.Scanner;

import Clases.Cadena;

public class Cadenatest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese una frase");
		String frase = sc.nextLine();
		
		
		Cadena c = new Cadena();
		
		c.setFrase(frase);
		c.setLongitud(frase.length());
		
//		c.mostarVocales();
//		c.invertirFrase();
//		
//		c.vecesRepetido();
//		
//		c.compararLongitud();
//		
//		c.unirFrases();
		c.reemplazar();
		System.out.println(c.contiene());
		
	}
}
