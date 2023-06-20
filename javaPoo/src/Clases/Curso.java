package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
	
	/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
	programa para organizar la información de cada curso. Para ello, crearemos una clase
	entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
	cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
	alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
	nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 	1)Un constructor por defecto.
 	2)Un constructor con todos los atributos como parámetro.
	3) Métodos getters y setters de cada atributo.
	4) método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
	que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
	en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
	nombre de cada alumno.
	5) Método crearCurso(): el método crear curso, le pide los valores de los atributos al
	usuario y después se le asignan a sus respectivos atributos para llenar el objeto
	Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
	al atributo alumnos
	6) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
	en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
	día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
	se repite el encuentro. */
	
	Cursos nombreCursos;
	int cantidadHorasPorDia;
	int cantidadDiasPorSemana;
	Turnos turnos;
	double precioPorHora;
	String [] alumnos = new String[5];
	
	public Curso() {
		
	}

	public Curso(Cursos nombreCursos, int cantidadHorasPorDia, int cantidadHorasPorSemana, Turnos turnos,
			double precioPorHora, String[] alumnos) {
		super();
		this.nombreCursos = nombreCursos;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantidadDiasPorSemana = cantidadHorasPorSemana;
		this.turnos = turnos;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}

	public Cursos getNombreCursos() {
		return nombreCursos;
	}

	public void setNombreCursos(Cursos nombreCursos) {
		this.nombreCursos = nombreCursos;
	}

	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}

	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}

	public int getCantidadDiasPorSemana() {
		return cantidadDiasPorSemana;
	}

	public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	}

	public Turnos getTurnos() {
		return turnos;
	}

	public void setTurnos(Turnos turnos) {
		this.turnos = turnos;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	//no tiene sentido tener el set, si los asigno con cargar alumnos.
	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
	



	@Override
	public String toString() {
		return "Curso [nombreCursos=" + nombreCursos + ", cantidadHorasPorDia=" + cantidadHorasPorDia
				+ ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turnos=" + turnos + ", precioPorHora="
				+ precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}







	Scanner sc = new Scanner(System.in);
	
	private String[] cargarAlumnos() {
		for(int i = 0 ; i < this.alumnos.length ; i++) {
			System.out.println("Ingrese el nombre del alumno");
			this.alumnos[i] = sc.next();
		}
		return this.alumnos;
		
	}
	
	private Cursos seleccionarCurso() {
		System.out.println("Seleccione un Curso : \n 1)Java \n 2)JavaScript \n 3)HTML \n 4)Css \n 5)Python");
		int seleccion = sc.nextInt();
		Cursos opcion = Cursos.Css;
		switch(seleccion) {
		case 1 :
			opcion = Cursos.Java;
			break;
		case 2 : 
			opcion = Cursos.JavaScript;
			break;
		case 3:
			opcion = Cursos.HTML;
			break;
		case 4:
			opcion = Cursos.Css;
			break;
		case 5:
			opcion = Cursos.Python;
			break;
		}
		
		return opcion;
		
		
	}
	
	private Turnos seleccionarTurno() {
		System.out.println("Seleccione un Curso : \n 1)Manana \n 2)Tarde \n 3)Noche");
		int seleccion = sc.nextInt();
		Turnos opcion = Turnos.Manana;
		switch(seleccion) {
		case 1 :
			opcion = Turnos.Manana;
			break;
		case 2 : 
			opcion =Turnos.Tarde;
			break;
		case 3:
			opcion = Turnos.Noche;
			break;
		}
		return opcion;
		
	}
	
	public void crearCurso() {
		System.out.println("Ingrese una cantidad de horas por dia");
		this.cantidadHorasPorDia = sc.nextInt();
		System.out.println("Ingrese una cantidad de dias por semana");
		this.cantidadDiasPorSemana =  sc.nextInt();
		System.out.println("Ingrese el precio por hora");
		this.precioPorHora = sc.nextDouble();
		this.nombreCursos = seleccionarCurso();
		this.turnos = seleccionarTurno();
		this.alumnos = cargarAlumnos();
	
		//return new Curso(c,chd,chs,t,pph,a);
		
	}
	
	
	public void calcularGananciaSemanal() {
		
		double ganan = (this.cantidadHorasPorDia * this.precioPorHora * this.alumnos.length * this.cantidadDiasPorSemana);
		System.out.println("La ganancia semanal es de " + ganan);
		
	}
	

}
