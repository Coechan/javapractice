package exerExtra;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
//		Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//		una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
//		C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//		iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
		
		int a , b , c ,d ,aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un valor para cada letra: ");
		System.out.println("Valor de 'a'");
		a = sc.nextInt();
		System.out.println("Valor de 'b'");
		b = sc.nextInt();
		System.out.println("Valor de 'c'");
		c = sc.nextInt();
		System.out.println("Valor de 'd'");
		d = sc.nextInt();
		
		//b -> c
		//c -> a
		//a -> d
		//d -> b
		
		System.out.println("a: " + a  );
		System.out.println("b: " + b  );
		System.out.println("c: " + c  );
		System.out.println("d: " + d  );
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println("a: " + a  );
		System.out.println("b: " + b  );
		System.out.println("c: " + c  );
		System.out.println("d: " + d  );
		
		
		
		
		
	}

}
