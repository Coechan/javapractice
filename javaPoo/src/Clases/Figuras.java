package Clases;

import java.util.Scanner;

public class Figuras {
//	Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras geométricas. 
//	Las figuras son las siguientes:
//	Cuadrado, Rectángulo, Triangulo, Circulo, Hexágono, Pentágono, Rombo
//	El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y 
//	le debe mostrar por pantalla el área y el perímetro.
//	Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los 
//	cálculos para luego mostrar en pantalla.
	
	public double base;
	public double altura;
	public double radio;
	public String tipo;
	
	public Figuras() {
		
	}
	
	public Figuras(String tipo) {
		this.tipo = tipo;
	}
	
	public Figuras(double base, double altura, double radio, String tipo) {
		this.base = base;
		this.altura = altura;
		this.radio = radio;
		this.tipo = tipo;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Figuras [base=" + base + ", altura=" + altura + ", radio=" + radio + ", tipo=" + tipo + "]";
	}
	
	public void crearFigura() {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		if("Circulo".equals(tipo)) {
			System.out.println("Ingrese el radio");
			this.radio = sc.nextDouble();
		} else if ("Rectangulo".equals(tipo)) {
			System.out.println("Ingrese la base");
			this.base = sc.nextDouble();
			System.out.println("Ingrese la altura");
			this.altura = sc.nextDouble();
		} else {
			System.out.println("Ingrese el lado");
			this.base = sc.nextDouble();
		}
	}
	
	public void area(int opcion) {
		switch(opcion) {
		case 1: 
			System.out.println("El area del cuadrado es: " + (this.base * this.base));
			break;
		case 2: 
			System.out.println("El area del rectangulo es: " + (this.base * this.altura));
			break;
		case 3: 
			System.out.println("El area del triangulo es: " + ((this.base * this.altura)/2));
			break;
		case 4: 
			System.out.println("El area del circulo es: " + (Math.PI * this.radio * this.radio));
			break;
		case 5: 
			System.out.println("El area del hexagono es: " + ((3 * Math.sqrt(3) * Math.pow(this.base, 2)) / 2));
			break;
		case 6: 
			System.out.println("El area del pentagono es: " + ((0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(this.base, 2))));
			break;
		case 7: 
			System.out.println("El area del rombo es: " + ((this.base * this.altura) / 2));
			break;
		
		}
	}
	
	
	

}
