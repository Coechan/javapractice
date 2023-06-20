package Test;

import Clases.Cafetera;

public class CafeteraTest {
	public static void main(String[] args) {
		
		Cafetera dolca = new Cafetera(1000, 0);
		
		System.out.println(dolca.capacidadMax);
		
		System.out.println(dolca.capacidadActual);
		
		dolca.llenarCafetera();
		
		System.out.println(dolca.capacidadActual);
		
		dolca.llenarTaza(600);
		
		dolca.llenarTaza(600);
		
		dolca.llenarTaza(600);
		
		dolca.agregarCafe(700);
		
		dolca.agregarCafe(700);
		
		System.out.println(dolca.capacidadActual);
		
	}

}
