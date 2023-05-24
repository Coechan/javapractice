package primeraparte;

import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
//		Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//		Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
		
		double gradosC;
		double gradosF;
		
		Scanner exe4 = new Scanner(System.in);
		
		System.out.println("Ingrese grados centigrados para convertirlos en Fahremheit");
		gradosC = exe4.nextDouble();
		gradosF = 32 + (9* gradosC / 5);
		System.out.println(gradosC + " Grados centigrados son: " + gradosF + " Grados Fahrenheit");
		
	}

}
