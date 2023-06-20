package Test;

import Clases.Libro;
import Service.ServiceLibro;

public class Librotest {
	public static void main(String[] args) {
		
		ServiceLibro sl = new ServiceLibro();
		
		Libro furuba = sl.cargarLibro();
		
		furuba.mostrarLibro(furuba);
		
		
	}

	
	
}
