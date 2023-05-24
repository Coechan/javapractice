package exerExtra;

public class exe8 {
	public static void main(String[] args) {
//		Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//		detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
//		y la cantidad de números impares. Al igual que en el ejercicio anterior los números
//		negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
		
		int num = 0;
		int contador = 0;
		int pares = 0; 
		int impares = 0;
	
		while (true) {
			num = (int) Math.round(Math.random()*50);
			contador ++;
			
			if(num % 2 ==0 ) {
				pares++;
			} else if (num % 5 == 0){
				break;
			}else {
				impares ++;
			}
			
		}
		
		System.out.println("Cantidad de numeros leidos: " + (contador - 1));
		System.out.println("Cantidad de numero pares: " + pares);
		System.out.println("Cantidad de numeros impares: " + impares);
	
		
		
	}

}
