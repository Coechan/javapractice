package Clases;

import java.util.Scanner;

public class Operacion {

	private int num1;
	private int num2;
	
	public Operacion() {
		
	}
	
	public Operacion(int num1,int num2) {
			
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void crearOperacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar numero 1");
		int num1 = sc.nextInt();
		setNum1(num1);
		System.out.println("Ingresar numero 2");
		int num2 = sc.nextInt();
		setNum2(num2);
		
		}
	
	public int sumar(int num1, int num2) {
		return (num1 + num2);
		
	}
	
	public int restar(int num1, int num2) {
		return (num1 - num2);
		
	}
	
	public int multiplicar(int num1, int num2) {
		if(num1 != 0 && num2 != 0) {
			return (num1 + num2);
		} else {
			System.out.println("No se puede multiplicar por cero");
			return 0;
		}
		
	}
	
	public int dividir(int num1, int num2) {
		if(num1 != 0 && num2 != 0) {
			return (num1 + num2);
		} else {
			System.out.println("No se puede dividir por cero");
			return 0;
		}
		
	}
}
