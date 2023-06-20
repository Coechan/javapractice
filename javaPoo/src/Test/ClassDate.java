package Test;

import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;

public class ClassDate {
	public static void main(String[] args) {
		/**Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
		clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
		Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
		usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
		deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
		se puede conseguir instanciando un objeto Date con constructor vacío.
		Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
		Ejemplo fecha actual: Date fechaActual = new Date(); **/
		
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese un dia");
		int dia = sc.nextInt();
		System.out.println("Ingrese un mes");
		int mes = sc.nextInt();		
		System.out.println("Ingrese un anio");
		int anio = sc.nextInt();
		
		
		
		LocalDate fecha = LocalDate.of(anio, mes , dia);
		LocalDate hoy = LocalDate.now();
		
		
		/**the java.time.LocalDate class in Java provides a method called until() 
		 * that allows you to calculate the difference between two dates. The until() 
		 * method returns a java.time.Period object representing the difference between 
		 * the two dates in terms of years, months, and days.
		 */
		
		Period dif = hoy.until(fecha);
		
		
		System.out.println("La diferencia es de " + dif.getDays() + " dias, " + dif.getMonths() + " meses, " + dif.getYears()+ " anios");
		
	}
	
	
	
}
