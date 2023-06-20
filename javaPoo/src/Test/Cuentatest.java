package Test;

import Clases.Cuenta;
import Service.ServiceCuenta;

public class Cuentatest {
	public static void main(String[] args) {
		
		ServiceCuenta sc = new ServiceCuenta();
		
		Cuenta nicolas = sc.crearCuenta();
		
		nicolas.depositar(2000);
		
		System.out.println(nicolas.getSaldo());
		
		nicolas.exRapida();
		
		nicolas.consultaSaldo();
		
		nicolas.retirar(200);
		
		nicolas.consultaSaldo();
		
		nicolas.consultaDatos();
	}

}
