package Service;

import java.util.Scanner;

import Clases.Libro;

public class ServiceLibro {
	
	public Libro cargarLibro() {
		Scanner sc =new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese el ISBN del libro");
		String isbn = sc.nextLine();
		
		System.out.println("Ingrese el titulo del libro");
		String titulo = sc.nextLine();
		
		System.out.println("Ingrese el autor del libro");
		String autor = sc.nextLine();
		
		System.out.println("Ingrese el cantidad de paginas del libro");
		int pag = sc.nextInt();
		
		return new Libro(isbn,titulo,autor,pag);
	} 
	
//	public void mostrarLibro(Libro libro) {
//		System.out.println(libro.toString()); 
//		
//	}

}
