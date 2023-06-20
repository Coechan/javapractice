package Test;

import Clases.Curso;

public class CursoTest {
	public static void main(String[] args) {
		Curso c = new Curso();
		
		System.out.println(2*3*5*200);
		c.crearCurso();
		
		System.out.println(c.toString());
			
		c.calcularGananciaSemanal();
		
	}
}
