package primeraparte;

import java.util.Scanner;

public class exer10 {
	public static void main(String[] args) {
//		Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//		solicite números al usuario hasta que la suma de los números introducidos supere el
//		límite inicial.
		
		int value;
		int num = 0;
		int aux = 0;
		Scanner exe10 = new Scanner(System.in);
		
		System.out.println("Ingrese un valor limite");
		value = exe10.nextInt();
		
		for(int i = 0 ; aux <= value ; i++) {
			System.out.println("Ingrese un valor");
			num= exe10.nextInt();
			aux = aux + num;
			System.out.println(aux);
		}
		
	}
}
