package exerExtra;

import java.util.Iterator;

public class exe12 {
	public static void main(String[] args) {
//		Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
//		0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//		Ejemplo:
//		0-0-0
//		0-0-1
//		0-0-2
//		0-0-E
//		0-0-4
//		0-1-2
//		0-1-E
//		Nota: investigar función equals() y como convertir números a String.
		
		String contador = "0-0-0";
		String contadorInt = "";
		String [] arr = new String [1000];
		
		for( int i = 0 ; i <= 999 ; i++) {
			contadorInt = Integer.toString(i);
			if(i < 10) {
				contador = "0-0-" + contadorInt;
				arr[i] = contador;
				//System.out.println(contador);
			} else if (i < 100) {
				contador = "0-" + contadorInt.substring(0,1) +"-" + contadorInt.substring(1, 2);
				arr[i] = contador;
				//System.out.println(contador);
			} else {
				contador = contadorInt.substring(0,1) + "-" + contadorInt.substring(1, 2) + "-" + contadorInt.substring(2, 3);
				arr[i] = contador;
				//System.out.println(contador);
			}
			
		};
		
		for(int i=0 ; i <= arr.length-1 ; i++) {
			if(arr[i].contains("3")) {
			arr[i] = arr[i].replaceAll("3", "E");
			}
			System.out.println(arr[i]);
		}
		
		
	}

}




//int index = arr[i].indexOf("3");
//arr[i].substring(index, index + 1 ) ;
