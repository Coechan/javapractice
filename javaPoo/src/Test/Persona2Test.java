package Test;

import Clases.Persona2;
import Service.ServicePersona2;

public class Persona2Test {
	public static void main(String[] args) {
	
		Persona2 p1 = new Persona2();
		ServicePersona2 p2 = new ServicePersona2();
		
		p1 = p2.crearPersona();
		
		System.out.println(p1.toString());
		
		p2.calcularEdad(p1);
		System.out.println(p2.menorQue(23, p1)); 
		
		
	}
}
