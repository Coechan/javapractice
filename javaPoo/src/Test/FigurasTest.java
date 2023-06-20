package Test;

import java.util.Scanner;

import Clases.Figuras;

public class FigurasTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Seleccione una opcion del menu \n1-Cuadradro\n2-Recangulo\n3-Triangulo\n4-Circulo\n5-Hexagono\n6-Pentagono\n7-Rombo");
		
		int opcion = sc.nextInt();
		Figuras figura = new Figuras();
		String tipo = "";
		switch(opcion) {
		case 1: 
			tipo = "Cuadrado";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 2: 
			tipo = "Rectangulo";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 3: 
			tipo = "Triangulo";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 4: 
			tipo = "Circulo";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 5: 
			tipo = "Hexagono";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 6: 
			tipo = "Pentagono";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		case 7: 
			tipo = "Rombo";
			figura.setTipo(tipo);
			figura.crearFigura();
			break;
		}
		
		
		System.out.println(figura.toString());
		figura.area(opcion);
		
	}
	
	

}
