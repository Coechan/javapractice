package exerExtra;

import java.util.Scanner;

public class exe14 {
	public static void main(String[] args) {
//		Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//		hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
//		cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cantidad de familias");
		int familias = sc.nextInt();
		int contadorDeHijos = 0;
		int sumaEdades = 0;
		
		for(int i=1 ; i <= familias; i++) {
			System.out.println("Ingrese la cantidad de hijos de la familia "+ i);
			int hijos = sc.nextInt();
			contadorDeHijos = contadorDeHijos + hijos;
			for(int j = 1 ; j <= hijos ; j++) {
				System.out.println("Ingrese la edad del hijo " + j);
				int edad = sc.nextInt();
				sumaEdades = sumaEdades + edad;
			}
		}
		
		double avg =  sumaEdades / contadorDeHijos;
		System.out.println("El promedio de las edades de los hijos de todas las familias es de " + avg + " . Total de hijos: " + contadorDeHijos + " , suma de las edades " + sumaEdades );
		
	}

}
