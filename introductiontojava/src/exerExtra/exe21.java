package exerExtra;

import java.util.Scanner;

public class exe21 {
	public static void main(String[] args) {
//		Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
//		adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
//		desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
//		trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//		Primer trabajo práctico evaluativo 10%
//		Segundo trabajo práctico evaluativo 15%
//		Primer Integrador 25%
//		Segundo integrador 50%
//		Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
//		programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
//		desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
//		igual al 7 de sus notas del curso.
		Scanner sc = new Scanner(System.in);
		double [] arrAvg = new double [10];
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("ingrese las notas del alumno " + i);
			System.out.println("Nota Primer trabajo práctico evaluativo ");
			double nota1 = sc.nextInt();
			System.out.println("Nota Segundo trabajo práctico evaluativo ");
			double nota2 = sc.nextInt();
			System.out.println("Nota Primer Integrador");
			double nota3 = sc.nextInt();
			System.out.println("Nota Segundo integrador ");
			double nota4 = sc.nextInt();
			
			double avg = (nota1 * 0.1) + (nota2 * 0.15) + (nota3* 0.25) + (nota4* 0.50);
			arrAvg[i-1] = avg;
		}
		
	
		imprimir(arrAvg, 10);
		
	
	}
	
	public static void imprimir(double[] arr ,  int dim) {
		int aprobados = 0;
		int desaprobados = 0;
		
		for(int i = 0 ; i < dim ; i++) {
			if(arr[i] < 7) {
				desaprobados = desaprobados + 1;
			} else {
				aprobados = aprobados + 1;
			}
		}
		System.out.println("El total de aprobados es de: " + aprobados);
		System.out.println("El total de desaprobados es de: " + desaprobados);
	}
	
	

}
