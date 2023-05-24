package DentroDeLaGuia;

public class vectores {
	public static void main(String[] args) {
//		Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//		define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
		
		String [] equipo = new String [10];
		
		//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
		
		for(int i=0 ; i <=9 ; i++) {
			equipo[i] = "compa" + i ;
			System.out.println(equipo[i]);
		}
		
	}

	
}
