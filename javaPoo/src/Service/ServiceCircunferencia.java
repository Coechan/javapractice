package Service;

import java.util.Scanner;

import Clases.Circunferencia;

public class ServiceCircunferencia {
	Scanner sc = new Scanner(System.in);
	public Circunferencia crearCircunferencia() {
	
		System.out.println("Ingresar el radio");
		double radio = sc.nextInt();
		
		return new Circunferencia(radio);
		
	}
	
//	public void area(double radio) {
//		double area = Math.PI * Math.pow(radio,2);
//		
//		System.out.println("El area de la circuferencia es: " + area);
//	}
//	
//	public void perimetro(double radio) {
//		double perimetro = Math.PI * 2 * radio;
//		
//		System.out.println("El area de la circuferencia es: " + perimetro);
//	}

}
