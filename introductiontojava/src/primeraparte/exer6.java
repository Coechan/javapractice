package primeraparte;



public class exer6 {
	public static void main(String[] args) {
//		Crear un programa que dado un numero determine si es par o impar.
		
		double num;
		
		num = Math.round(Math.random()*100);
		
		if(num%2 == 0) {
			System.out.println("El numero: " + num + " es par");
		} else {
			System.out.println("El numero: " + num + " es impar");
		}
	}

}
