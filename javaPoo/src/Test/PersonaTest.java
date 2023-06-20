package Test;

import java.util.ArrayList;

import Clases.Persona;
import Service.ServicePersona;

public class PersonaTest {

	public static void main(String[] args) {
// A continuación, en la clase main hacer lo siguiente:
//	Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//	los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//	tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//	persona es mayor de edad.
//	Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//	distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//	cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//	también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
		
		ArrayList<Integer> imcAvg = new ArrayList<>();
		ArrayList<Boolean> edadAvg = new ArrayList<>();
		ServicePersona sp = new ServicePersona();
		
		Persona p1 = sp.crearPersona();
		Persona p2 = sp.crearPersona();
		Persona p3 = sp.crearPersona();
		Persona p4 = sp.crearPersona();
		
		imcAvg.add(sp.calcularIMC(p1));
		edadAvg.add(sp.esMayorDeEdad(p1));
		System.out.println(sp.esMayorDeEdad(p1));
		imcAvg.add(sp.calcularIMC(p2));
		edadAvg.add(sp.esMayorDeEdad(p2));
		System.out.println(sp.esMayorDeEdad(p2));
		imcAvg.add(sp.calcularIMC(p3));
		edadAvg.add(sp.esMayorDeEdad(p3));
		System.out.println(sp.esMayorDeEdad(p3));
		imcAvg.add(sp.calcularIMC(p4));
		edadAvg.add(sp.esMayorDeEdad(p4));
		System.out.println(sp.esMayorDeEdad(p4));
		
		
		averageImc(imcAvg);
	
		
	}
	
	public static void averageImc(ArrayList <Integer> li) {
		int sobre = 0 , ok = 0 , bajo = 0;
		for (Integer e : li) {
            if(e == 1) {
            	 sobre = sobre + 1;
            } else if(e == 0) {
            	 ok = ok + 1;
            } else {
            	 bajo =bajo + 1;
            }
        }
		System.out.println(sobre + "," + ok + "," + bajo);
		System.out.println(li.size());
		
		System.out.println("hay un " + (sobre/(li.size()))*100 + "% de personas con sobrepeso");
		System.out.println("hay un " + (ok/(li.size()))*100 + "% de personas con ok");
		System.out.println("hay un " + (bajo/(li.size()))*100 + "% de personas con bajopeso");
		
	}
	
	
}
