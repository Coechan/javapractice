package exerExtra;

public class exe20 {
	public static void main(String[] args) {
//		Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por
//		parámetro. Después haremos otra función o procedimiento que imprima el vector.
		int [] array = new int [20];
		
		rellenar(array,20);
		imprimir(array,20);
		
	}
	
	public static int [] rellenar(int[] arr ,  int dim) {
		for(int i = 0 ; i < dim ; i++) {
			arr[i] = (int) Math.round(Math.random()* 100);
		}
		return arr;
		
	}
	
	public static void imprimir(int[] arr ,  int dim) {
		for(int i = 0 ; i < dim ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

}
