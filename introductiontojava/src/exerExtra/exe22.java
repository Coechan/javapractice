package exerExtra;

import java.util.Scanner;

public class exe22 {
	public static void main(String[] args) {
//		Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
//		muestre la suma de sus elementos.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese las dimesiones para la matriz");
		System.out.println("Ingrese el valor N");
		int dimN = sc.nextInt();
		System.out.println("Ingrese el valor M");
		int dimM = sc.nextInt();
		
		int [][] matriz =  new int [dimN][dimM];
		rellenar(matriz,dimN,dimM);
		sumaValores(matriz,dimN,dimM);
		
		
		
	}
	
	public static int [][] rellenar(int[][] matrix ,  int dim1 , int dim2) {
		for(int i = 0 ; i < dim1 ; i++) {
			for(int j = 0 ; j < dim2 ; j++) {
				matrix[i][j] = (int) Math.round(Math.random()* 100);
			}
			
		}
		return matrix;
		
	}
	
	public static void sumaValores(int[][] matrix ,  int dim1 , int dim2) {
		int suma = 0;
		for(int i = 0 ; i < dim1 ; i++) {
			for(int j = 0 ; j < dim2 ; j++) {
				suma = suma + matrix[i][j];
			}
		}
		System.out.println("La suma de todos los valores de la matriz es de: " + suma);
	}
	
	

}
