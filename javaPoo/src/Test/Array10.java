package Test;

import java.util.Arrays;

public class Array10 {
	public static void main(String[] args) {
		/**Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
		de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 
		El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
		Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
		ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
		0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
		20. **/
		
		double [] arr1 =  new double [50];
		double [] arr2 =  new double [20];
		
		for (int i=0 ; i < arr1.length ; i ++) {
			arr1[i] = Math.round(Math.random()*50);
		}
		
		print(arr1);
		
		
		Arrays.sort(arr1);
		
		print(arr1);
		
		
		for(int i = 0 ; i <arr2.length ; i++) {
			if(i <10) {
				arr2[i] = arr1[i];
			} else {
				arr2[i] = 0.5;
			}
		}
		
		print(arr2);
		
	}
	
	public static void print(double[] arr) {
		System.out.println();
		for(double i : arr) {
			System.out.print(i + ", ");
		}
	}

}
