package exerExtra;

import java.util.Arrays;
import java.util.Scanner;

public class exe19 {
	public static void main(String[] args) {
//		Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//		comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//		elementos).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la dimension del array");
		int dim = sc.nextInt();
		
		int [] arr1 = new int[dim];
		
		int [] arr2 = new int [dim];
		
		for(int i = 0 ; i <dim ; i++) {
			arr1[i] = (int) Math.round(Math.random()*10);
			arr2[i] = (int) Math.round(Math.random()*10);
		}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		
		for(int i = 0 ; i <dim ; i++) {
			if(arr1[i] != arr2[i]) {
				System.out.println(arr1[i]);
				System.out.println(arr2[i]);
				System.out.println("Son distintas");
				break;
			}
			
		}
		
		
	}

}
