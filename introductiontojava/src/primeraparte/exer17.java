package primeraparte;

import java.util.Scanner;

public class exer17 {
	public static void main(String[] args) {
//		Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//		de 2 dígitos, etcétera (hasta 5 dígitos).
		
		int oneD= 0;	;
		int twoD = 0;	;
		int threeD = 0;	;
		int fourD = 0;	;
		int fiveD = 0;		
		
		Scanner exe17 =  new Scanner(System.in);
		
		System.out.println("Ingrese la longitud del array");
		int longArr = exe17.nextInt();
		
		int[] arr = new int [longArr];
		
		for( int i = 0 ; i <= longArr -1 ; i ++) {
			arr[i] = (int) Math.round(Math.random()*10000);
			System.out.print(arr[i] + ", ");
			
		}
		
		for(int i= 0 ; i <= longArr-1 ; i++) {
			if (arr[i] <= 9) {
				oneD ++;
			}else if( arr[i] <= 99) {
				twoD ++;
			} else if (arr[i] <= 999) {
				threeD++;
			}else if(arr[i] <= 9999) {
				fourD++;
			}else {
				fiveD++;
			}
		}
		
		System.out.println("Numeros de 1 digito: " + oneD);
		System.out.println("Numeros de 2 digito: " + twoD);
		System.out.println("Numeros de 3 digito: " + threeD);
		System.out.println("Numeros de 4 digito: " + fourD);
		System.out.println("Numeros de 5 digito: " + fiveD);
		
	}
}
