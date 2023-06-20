package Test;

import Clases.Operacion;

public class Operaciontest {
	public static void main(String[] args) {
		
		Operacion test = new Operacion(7,7);
		
		test.crearOperacion();
		System.out.println(test.getNum1());
		System.out.println(test.getNum2());
		
		System.out.println("La suma es de: " +  test.sumar(test.getNum1(),test.getNum2()) );
		
		System.out.println("La resta es de: " +  test.restar(test.getNum1(),test.getNum2()) );
		
		System.out.println("La multiplicacion es de: " +  test.multiplicar(test.getNum1(),test.getNum2()) );
		
		System.out.println("La division es de: " +  test.dividir(test.getNum1(),test.getNum2()) );
		
		
	}

}
