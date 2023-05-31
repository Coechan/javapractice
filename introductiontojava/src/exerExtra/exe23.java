package exerExtra;

import java.util.Scanner;

public class exe23 {
	public static void main(String[] args) {
//		Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
//		que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
//		20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
//		será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
//		rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
//		por pantalla la sopa de letras creada.
//		Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
//		de Java substring(), Length() y Math.random().
		
		String [][] sopaDeLetras = new String[20][20];
		
		addWords(sopaDeLetras);
		addNumbers(sopaDeLetras, 20,20);
		imprimir(sopaDeLetras,20,20);
		
	}
	
	public static void addWords(String [][] matriz ) {
		Scanner sc = new Scanner(System.in);
		
		String [] arrWords = new String[5]; 
		
		for(int i = 0 ; i <5 ; i++) {
			String palabra ="";
			while(palabra.length() <3 || palabra.length() >5 ) {
				System.out.println("Ingrese palabras de 3 a 5 caracteres");
				palabra = sc.next();
			
			}
			System.out.println("Selecciones una fila para ingresar la palabra a la sopa de letra (1 al 20)");
			int fila = sc.nextInt();
			int columna = ((int) Math.round(Math.random()*19)) - palabra.length();
			if (columna < 0 ) {
				columna = 0;
			}
			for(int j = 0 ; j < palabra.length();j ++) {
				matriz[fila][columna + j] =  palabra.substring(j,j+1);
			}
		
		}
		
		
	}
	
	public static void imprimir(String [][] matrix ,  int dim1 , int dim2) {
		for(int i = 0 ; i < dim1 ; i++) {
			for(int j = 0 ; j < dim2 ; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("");
		}
	
	}
	
	public static void addNumbers(String [][] matrix ,  int dim1 , int dim2) {
		for(int i = 0 ; i < dim1 ; i++) {
			for(int j = 0 ; j < dim2 ; j++) {
				if(matrix[i][j] == null) {
					matrix[i][j] = Integer.toString(((int) Math.round(Math.random() * 9)));
				}
			}
			
		}
	}

}
