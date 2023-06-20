package Service;

import java.util.Scanner;

import Clases.Persona;

public class ServicePersona {

//	 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//	al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//	Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//	O. Si no es correcto se deberá mostrar un mensaje
	
	Scanner sc = new Scanner(System.in).useDelimiter("\n");
	public Persona crearPersona() {
		System.out.println("Ingrese el nombre de la persona");
		String nombre = sc.next();
		System.out.println("Ingrese el edad de la persona");
		int edad = sc.nextInt();
		System.out.println("Ingrese el sexo de la persona");
		char sexo = sc.next().charAt(0);
		System.out.println("Ingrese el peso de la persona");
		double peso = sc.nextDouble();
		System.out.println("Ingrese el altura de la persona");
		double altura = sc.nextDouble();
		
	return new Persona(nombre, edad, sexo , peso , altura);
		
	}
	
	public int calcularIMC(Persona p) {
		double imc = p.getPeso() / Math.pow(p.getAltura() ,2 ); 
		if(imc < 20) {
			System.out.println("La persona esta por debajo de su peso ideal");
			return -1;
		} else if (imc >= 20 && imc <=25) {
			System.out.println("La persona esta en su peso ideal");
			return 0;
		} else {
			System.out.println("La persona tiene sobrepeso");
			return 1;
		}
	}
	
	public boolean esMayorDeEdad(Persona p) {
		return (p.getEdad() >= 18) ;
			
		
	}
}
