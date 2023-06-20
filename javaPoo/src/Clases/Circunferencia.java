package Clases;

import java.util.Scanner;

public class Circunferencia {

	private double radio;
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if(radio > 0) {
			this.radio = radio;
		} else {
			this.radio = 0;
		}
	}
	
//	public void crearCircunferencia() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresar el radio");
//		radio = sc.nextInt();
//		setRadio(radio);
//	}
	
	public void area(double radio) {
		double area = Math.PI * Math.pow(radio,2);
		
		System.out.println("El area de la circuferencia es: " + area);
	}
	
	public void perimetro(double radio) {
		double perimetro = Math.PI * 2 * radio;
		
		System.out.println("El area de la circuferencia es: " + perimetro);
	}
		
	
}
