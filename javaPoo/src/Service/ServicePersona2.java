package Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import Clases.Persona2;

public class ServicePersona2 {
	
	/**Agregar un método de creación del objeto que respete la siguiente firma:
	crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
	usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
	fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
	 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
	en cuenta que para conocer la edad de la persona también se debe conocer la fecha
	actual.
	 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
	edad y retorna true en caso de que el receptor tenga menor edad que la persona que
	se recibe como parámetro, o false en caso contrario.
	 Metodo mostrarPersona(): este método muestra la persona creada en el método
	anterior.**/
	
	
	
	public Persona2 crearPersona() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona");
		String nomb = sc.nextLine();
		System.out.println("Ingrese la fecha de nacimiento");
		System.out.println("anio");
		int anio = sc.nextInt();
		System.out.println("mes");
		int mes = sc.nextInt();
		System.out.println("dia");
		int dia = sc.nextInt();
		
		return new Persona2(nomb,LocalDate.of(anio, mes, dia));
	}
	
	public int calcularEdad(Persona2 p) {
		LocalDate nac = p.getNacimiento();
		LocalDate hoy = LocalDate.now();
		Period dif = nac.until(hoy);
		System.out.println("La persona tiene " + dif.getYears() + " anios");
		return dif.getYears();
	}
	
	public boolean menorQue(int edad, Persona2 p) {
		return ( this.calcularEdad(p) < edad);
		
	}
	
	
	public void mostrarPersona(Persona2 p) {
		System.out.println(p.toString());
	}
	

}
