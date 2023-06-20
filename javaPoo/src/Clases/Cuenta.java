package Clases;

public class Cuenta {
	/**
	Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
		numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
		Las operaciones asociadas a dicha clase son:
		a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
		b) Agregar los métodos getters y setters correspondientes
		c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
		d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
		y se la sumara a saldo actual.
		e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
		la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
		pondrá el saldo actual en 0.
		f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
		usuario no saque más del 20%.
		g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
		h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
	**/
	
	private int numeroCuenta;
	private int dni;
	private int saldo;
	
	public Cuenta(int numeroCuenta, int dni, int saldo) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public Cuenta() {
		
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int depositar(int monto) {
			saldo = saldo + monto;
		return saldo;
	}
	
	public int retirar(int monto) {
		if(monto > saldo) {
			saldo = 0;
		} else {
			saldo = saldo - monto;
		}
		return saldo;
	}
	
	public int exRapida() {
		if(saldo > 0 ) {
			saldo = (int) Math.round(saldo - (saldo*0.2));
		}
		return saldo;
	}
	
	public void consultaSaldo() {
		System.out.println(this.getSaldo());
	}
	
	public void consultaDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", dni=" + dni + "]";
	}
	
	

}
