package Test;

import Clases.Circunferencia;
import Service.ServiceCircunferencia;

public class Circunferenciatest {

	public static void main(String[] args) {
		Circunferencia tres =  new Circunferencia(3);
		ServiceCircunferencia sc = new ServiceCircunferencia();
		
		tres = sc.crearCircunferencia();
		
		tres.area(tres.getRadio());
		tres.perimetro(tres.getRadio());
		
	}
}
