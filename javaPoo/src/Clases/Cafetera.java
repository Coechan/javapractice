package Clases;

public class Cafetera {
	 /**Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
	(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
	cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
	métodos:
	 Constructor predeterminado o vacío
	 Constructor con la capacidad máxima y la cantidad actual

	 Métodos getters y setters.
	 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
	máxima.
	 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
	tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
	cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
	método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
	cuanto quedó la taza.
	 Método vaciarCafetera(): pone la cantidad de café actual en cero.
	 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
	recibe y se añade a la cafetera la cantidad de café indicada.
**/
	
	public int capacidadMax;
	public int capacidadActual;
	
	public Cafetera() {	
	}
	
	public Cafetera(int capacidadMax, int capacidadActual) {
		
		this.capacidadMax = capacidadMax;
		this.capacidadActual = capacidadActual;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	public int llenarCafetera() {
		capacidadActual = capacidadMax;
		return capacidadActual;
	}
	
	public void llenarTaza(int medida ) {
//		Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//		método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//		cuanto quedó la taza.
		if(medida < capacidadActual) {
			System.out.println("Se lleno la taza");
			capacidadActual = capacidadActual - medida;
		} else if(medida > capacidadActual && capacidadActual > 0){
			System.out.println("La taza se lleno:" + capacidadActual);
			capacidadActual = capacidadActual - medida;
		}else {
			capacidadActual = 0;
			System.out.println("La capacidad actual es de: " + capacidadActual + " no se puedo llenar la taza");
		}
			
		}
		
		
	public int vaciarCafetera() {
		return capacidadActual = 0;
	}
	
	public int agregarCafe(int mlitros) {
		if (capacidadActual + mlitros <= capacidadMax) {
			capacidadActual = capacidadActual + mlitros;
		}
		return capacidadActual;
	}
	
}
