package Test;

import Clases.Matematica;

public class MatematicaTest {

	public static void main(String[] args) {
		 
		Matematica m = new Matematica();
		
		m.setNum1(Math.round(Math.random()*10));
		m.setNum2(Math.round(Math.random()*10));
		
		System.out.println(m.devolverMayor()); 
		m.calcularPotencia();
		
	}
}
