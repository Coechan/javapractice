package primeraparte;

public class exer15 {
	public static void main(String[] args) {
//		Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//		muestre por pantalla en orden descendente.
		
		int[] array= new int [100];
		
		for (int i = 0 ; i <=99 ; i++) {
			 array[i] = i+1;
		}
		
		for(int i=99; i >= 0 ; i--) {
			System.out.println(array[i]);
		}
	}

}
