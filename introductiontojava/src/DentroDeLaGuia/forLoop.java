package DentroDeLaGuia;

public class forLoop {

	public static void main(String[] args) {
//		Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//		ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//		5 *****
//		3 ***
//		11 ***********
//		2 **
		
		int num ;
		double num1;
		
		for(int i= 0 ; i <= 3 ; i++) {
			num= (int) Math.round(Math.random()*20);
			
			System.out.println(num + " *".repeat(num));
		}
		num1 =(Math.random()*100);
		int num3 = (int) Math.round(num1);
		
	
	}

}
