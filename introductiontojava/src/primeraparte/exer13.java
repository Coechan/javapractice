package primeraparte;

import java.util.Scanner;

public class exer13 {
	public static void main(String[] args) {
//		Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//		cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//		* * * *
//		*     *
//		*     *
//		* * * *
		
		int n;
		Scanner exe13 = new Scanner(System.in);
		
		System.out.println("Ingrese una longitud para dibujar un cuadrado");
		n = exe13.nextInt();
		
		for(int i =0 ; i <= n-1 ; i++) {
			for (int j=0; j <= n-1 ; j++) {
				if(i== 0 || i == n-1) {
					System.out.print("* ");
				}else if( j==0 || j == n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");	
		}
	}
}

