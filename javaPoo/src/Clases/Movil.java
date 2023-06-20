package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class Movil {
	
	/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
	posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
	almacenar cada producto con su información. Crear una entidad Movil con los atributos
	marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
	un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
	correspondiente al código. A continuación, se implementarán los siguientes métodos:
	1) Un constructor por defecto.
	2) Un constructor con todos los atributos como parámetro.
	3) Métodos getters y setters de cada atributo.
	4) Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
	instanciar un objeto Celular y poder cargarlo en nuestro programa.
	5) Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
	números de un celular. Para ello, puede utilizarse un bucle repetitivo */
	
	private String marca;
	private double precio;
	private String modelo;
	private int memoriaRam;
	private int almacenamiento;
	private int[] codigo =  new int[7];
	
	public Movil() {
		
	}
	
	public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.almacenamiento = almacenamiento;
		this.codigo = codigo;
	}
	
	Scanner sc = new Scanner(System.in);
	
	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private int getMemoriaRam() {
		return memoriaRam;
	}

	private void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	private int getAlmacenamiento() {
		return almacenamiento;
	}

	private void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	private int[] getCodigo() {
		return codigo;
	}

	private void setCodigo(int[] codigo) {
		this.codigo = codigo;
	}
	
	private int [] cargarCodigo() {
		System.out.println("Ingrese el codigo de 7 cifras");
		for(int i = 0 ; i < this.codigo.length ; i++) {
			System.out.println("numero " + i );
			this.codigo[i] = sc.nextInt();
		}
		return this.codigo;
	}
 
	public void cargarCelular() {
		System.out.println("Ingrese la marca");
		String m = sc.next();
		this.setMarca(m);
		System.out.println("Ingrese el precio");
		double p = sc.nextDouble();
		this.setPrecio(p);
		System.out.println("Ingrese el modelo");
		String mo = sc.next();
		this.setModelo(mo);
		System.out.println("Ingrese la memoriaRam");
		int me = sc.nextInt();
		this.setMemoriaRam(me);
		System.out.println("Ingrese el almacenamiento");
		int a = sc.nextInt();
		this.setAlmacenamiento(a);
		this.setCodigo(cargarCodigo());
		
		
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam
				+ ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + "]";
	}
	
	
	
	
	
	
	

}
