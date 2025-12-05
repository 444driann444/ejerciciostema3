package Ejerciciostema3;

public class Banco {

	private String nombre;
	private String dni;
	private String domicilio;
	private float dinero;
	
	
	public Banco(String nombre, String dni, String domicilio, float dinero) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.dinero = dinero;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	public float getDinero() {
		return dinero;
	}
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", dinero=" + dinero + "]";
	}
	
	public void ingresarDinero(int dineroIngresar) {
		if (dineroIngresar < 0) {
			System.out.println("valor incorrecto");
		}else {
			dinero = dinero + dineroIngresar;
		}
		
	}
	
	public void sacarDinero(int dinerSacar) {
		if (dinero <= 0) {
			System.out.println("No se puede retirar");
		}
		else if (dinerSacar < 0 ) {
			System.out.println("valor incorrecto");
		}else {
			dinero = dinero - dinerSacar;
		}
	}
	
	public void mostrarCuenta () {

		System.out.println(toString());
	}
	

}
