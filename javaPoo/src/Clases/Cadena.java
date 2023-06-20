package Clases;

import java.util.Scanner;

public class Cadena {
	/**
	 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
	String) y su longitud. 
	En el main se creará el objeto y se le pedirá al usuario que ingrese
	una frase que puede ser una palabra o varias palabras separadas por un espacio en
	blanco y a través de los métodos set, se guardará la frase y la longitud de manera
	automática según la longitud de la frase ingresada. Deberá además implementar los
	siguientes métodos:
	 */
	

	private String frase;
	private int longitud;
	
	public Cadena() {
		
	}
	
	public Cadena(String frase, int longitud) {
		super();
		this.frase = frase;
		this.longitud = longitud;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	@Override
	public String toString() {
		return "Cadena [frase=" + frase + ", longitud=" + longitud + "]";
	}
	
//	a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//	frase ingresada.
//	b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//	ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//	c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//	contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//	d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//	e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//	compone la clase con otra nueva frase ingresada por el usuario.
//	f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//	con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//	g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//	encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//	la frase resultante.
//	h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//	ingresa el usuario y devuelve verdadero si la contiene y falso si no.
//	
	
	Scanner sc =  new Scanner(System.in).useDelimiter("\n");
	
	public void mostarVocales() {
		char [] f = this.frase.toCharArray();
		int vowels = 0;
		for (char i : f){
			if(String.valueOf(i).matches(".*[aeiouAEIOU].*")) {
				vowels = vowels +1;
			}
		} 
		System.out.println("esta frase contiene " + vowels + " vocales");
	}
	
	public void invertirFrase() {
		char [] f = this.frase.toCharArray();
		for (int i = f.length -1 ; i >= 0 ; i --){
			System.out.print(f[i]);
		} 
		System.out.println();
				
	}
	
	public void vecesRepetido() {
		System.out.println("Ingrese la letra que quiere ver si esta, y cuantas veces esta.");
		char l = sc.next().charAt(0);
		char [] f = this.frase.toCharArray();
		int ch = 0;
		for (char i : f){
			if(i == l) {
				ch = ch +1;
			}
		} 
		System.out.println("esta frase contiene la letra  "+ l + " , " + ch + " veces");
	}
	
	public void compararLongitud() {
		System.out.println("Ingrese una frase para comprara su longitud contra la frase actual");
		String l = sc.next();
		if(this.frase.length() > l.length()) {
			System.out.println("La frase original es " + (this.frase.length() - l.length()) + " caracteres, mas larga que la actual");
		}else if (this.frase.length()  < l.length()) {
			System.out.println("La frase actual es " + (l.length() - this.frase.length()) + " caracteres, mas larga que la original");
		} else {
			System.out.println("La frase actual y la original tiene la misma longitud");
		}
	
	}
	
	public void unirFrases() {
		System.out.println("Ingrese una frase para concatenar con la frase actual");
		String l = sc.next();
		System.out.println(this.frase.concat(" " + l));
	}

	public void reemplazar() {
		System.out.println("Ingrese el caracter por el que quiere reemplazar 'a' en la frase");
		char c = sc.next().charAt(0);
		String f = this.frase;
		String fraseNueva = "";
		fraseNueva = f.replaceAll("a", String.valueOf(c));
		System.out.println(fraseNueva);
	}
	
	public boolean contiene() {
		System.out.println("Ingrese el caracter que quiere comprobar si la frase contiene");
		char c = sc.next().charAt(0);
		String f = this.frase;
		return f.contains(String.valueOf(c));
	}

}
