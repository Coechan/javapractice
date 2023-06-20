package Service;

import java.util.Scanner;

import Clases.Cuenta;

public class ServiceCuenta {
	
	Scanner sc = new Scanner(System.in).useDelimiter("\n");
	
	public Cuenta crearCuenta() {
		System.out.println("Ingrese el numero de cuenta");
		int cuenta = sc.nextInt();
		System.out.println("Ingerse el dni del cliente");
		int dni = sc.nextInt();
		System.out.println("ingrese el saldo de la cuenta");
		int saldo = sc.nextInt();
		
		return new Cuenta(cuenta, dni,saldo);
		
	}

}
