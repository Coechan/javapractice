package primeraparte;

public class exer20 {
	public static void main(String[] args) {
//		Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//		suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//		permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//		El programa deberá comprobar que los números introducidos son correctos, es decir,
//		están entre el 1 y el 9.
		
		int dim1, dim2;
		dim1 = 3;
		dim2 = 3;
		
		imprimir(crearCuadrados(dim1,dim2), dim1 ,dim2);
		
		
	}
		
	public static void imprimir(int [][] matrix,int dim1, int dim2) {
		
		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
//	public static boolean magic(int[][] matriz, int dim1, int dim2) {
//		
//		//return
//	}
	
	public static int [][] crearCuadrados(int dim1, int dim2) {
		int [][] matrix = new int[dim1][dim2];
		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
			 int num = (int) Math.round(Math.random()*9);
			 if(num == 0) {
				 num= 1;
			 }
			 matrix[i][j] = num;
			}
		}
		return matrix;
		
	}

}
