package exerExtra;

import java.util.Scanner;

public class exe16 {
	public static void main(String[] args) {
//		Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//		las personas ingresadas por teclado e indique si son mayores o menores de edad.
//		Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//		mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
		
		//Scanner sc = new Scanner(System.in);
		
		consulta(4);
	}
	
	public static void consulta(int personas) {
		Scanner sc = new Scanner(System.in);
		String edadCondicion = "";
		for(int i= 1 ; i <= personas ; i++) {
			System.out.println("Ingrese el nombre de la persona " + i);
			String nombre = sc.next();
			System.out.println("Ingrese la edad de la persona " + i);
			int edad = sc.nextInt();
			if(edad <18) {
				edadCondicion = "menor de edad";
			} else {
				edadCondicion = "mayor de edad";
			}
			
			System.out.println("El nombre de la persona " + i + " es " + nombre + " y tiene " + edad + " anos. Por ende es " + edadCondicion);
			
			if(i < personas)
			System.out.println("Quiere ingresar/ver mas personas Si/No");
			String opcion = sc.next();
			if(opcion.toLowerCase().equals("no")) {
				break;
			}
			
		}
	}

}
