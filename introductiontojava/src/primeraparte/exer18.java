package primeraparte;

public class exer18 {
	public static void main(String[] args) {
//		Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//		traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
//		obtiene cambiando sus filas por columnas (o viceversa).
		
		int [][] matrix = new int [4][4];
		
		
		matrix= rellenar(matrix,4);
				
		escribir(matrix,4);
		
		System.out.println("");
		
		invertir(matrix,4);
		
		
	}
	
	public static int [][] rellenar(int[][] matriz, int d) {
		
		for(int i=0; i <= d-1 ; i++){
			for(int j=0 ; j <= d-1 ; j++) {
				matriz[i][j] = (int) Math.round(Math.random()*9);
			}
		
		}
		return matriz;
	}
	
	public static void escribir(int [][] matriz, int d){
			
			for(int i = 0 ; i <= d-1 ; i++) {
				for(int j = 0 ; j <= d- 1; j++) {
				System.out.print(matriz[i][j]+ "  ");
				}
				System.out.println("");
			}
		
		}
	
	
	
	public static void invertir(int [][] matriz, int d){
		
		for(int i = d-1 ; i >= 0; i--) {
			for(int j = d-1 ; j >= 0; j--) {
			System.out.print(matriz[i][j]+ "  ");
			}
			System.out.println("");
		}
	
	}

}
