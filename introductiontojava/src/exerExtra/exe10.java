package exerExtra;

import java.util.Scanner;

public class exe10 {
	public static void main(String[] args) {
//		Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//		dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//		si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//		al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//		utilizar la función Math.random() de Java.
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int) Math.round(Math.random()*10);
		int num2 = (int) Math.round(Math.random()*10);
		int guess;
		int rendirse;
		
		do {
			System.out.println("Adivine el resultado de la multipliacion de dos numeros aleatorios entre 0 y 10");
			guess = sc.nextInt();
			
			if(guess != num1*num2){
				System.out.println("Nope!, te rendis? S/N");
				rendirse = sc.next().charAt(0);
				if(rendirse == 'S' || rendirse == 's') {
					System.out.println("Buuuuu! el numero era: " + (num1*num2));
					break;
				}
			}
			
			
		}while(guess != (num1*num2));
		
		if(guess == (num1*num2))
		System.out.println("adivinaste! el numero era: " + (num1*num2));
	}

}
