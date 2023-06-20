package Clases;

import java.util.Scanner;

public class Libro {
	
	String isbn ;
	String titulo;
	String autor;
	int paginas;
	
	public Libro(String isbn, String titulo, String autor, int paginas ) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public Libro() {
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
	public void mostrarLibro(Libro libro) {
		System.out.println(libro.toString()); 
		
	}
	
//	public void cargarLibro() {
//		Scanner sc =new Scanner(System.in).useDelimiter("\n");
//		System.out.println("Ingrese el ISBN del libro");
//		String isbn = sc.nextLine();
//		setIsbn(isbn);
//		System.out.println("Ingrese el titulo del libro");
//		String titulo = sc.nextLine();
//		setTitulo(titulo);
//		System.out.println("Ingrese el autor del libro");
//		String autor = sc.nextLine();
//		setAutor(autor);
//		System.out.println("Ingrese el cantidad de paginas del libro");
//		int pag = sc.nextInt();
//		setPaginas(pag);
//	} 
//	
//	public void mostrarLibro() {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("El ISBN del libro es: " + getIsbn());
//		System.out.println("El titulo del libro es: " + getTitulo());
//		System.out.println("El autor del libro es: " + getAutor());
//		System.out.println("La cantidad de paginas del libro es: "+ getPaginas());
//		
//	}
}
