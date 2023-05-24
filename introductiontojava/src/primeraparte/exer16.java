package primeraparte;

import java.util.Scanner;

public class exer16 {
	public static void main(String[] args) {
//		Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
//		al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//		numero y si se encuentra repetido
		
		Scanner exe16= new Scanner(System.in);
		
		System.out.println("Ingresar la longitd del vector");
		int longArr = exe16.nextInt();
		int [] array =  new int [longArr];
		
		for(int i=0 ; i <= longArr-1 ; i++) {
			array[i] = (int) Math.round(Math.random() *10);
			//System.out.println(array[i]);
		}
		
		System.out.println("Ingrese un numero a buscar: ");
		int search = exe16.nextInt();
		
		int contador = 0;
		int [] ubicacion = new int [longArr];
		
		for(int i=0 ; i <= longArr-1 ; i++) {
			if(array[i] == search) {
				ubicacion[contador] = i;
				contador ++;
				System.out.println("El numero se encuentra en la posicion " + i);
			}
		}
		
		System.out.println("El numero se encontro " + contador + " veces.");
		System.out.println(ubicacion[contador]);
		
	}
}
