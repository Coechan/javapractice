package Clases;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona2 {
	/**Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
	(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
	métodos:
	 Agregar un método de creación del objeto que respete la siguiente firma:
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
	
	private String nombre;
	private LocalDate nacimiento;
	
	public Persona2() {
		
	}
	
	public Persona2(String nombre, LocalDate nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Persona2 [nombre=" + nombre + ", nacimiento=" + nacimiento + "]";
	}
	
//	public int calcularEdad() {
//		LocalDate nac = this.nacimiento;
//		LocalDate hoy = LocalDate.now();
//		Period dif = nac.until(hoy);
//		System.out.println("La persona tiene " + dif.getYears() + " anios");
//		return dif.getYears();
//	}
//	
//	public boolean menorQue(int edad) {
//		return ( this.calcularEdad() < edad);
//		
//	}
	
	
	
	//public Persona2 crearPersona() {
//		Scanner sc = new Scanner(System.in).useDelimiter("/n");
//		System.out.println("Ingrese el nombre de la persona");
//		String nomb = sc.nextLine();
//		System.out.println("Ingrese la fecha de nacimiento");
//		System.out.println("anio");
//		int anio = sc.nextInt();
//		System.out.println("mes");
//		int mes = sc.nextInt();
//		System.out.println("dia");
//		int dia = sc.nextInt();
//		
//		return new Persona2(nomb,LocalDate.of(anio, mes, dia));
		
		
//	}
	

}
