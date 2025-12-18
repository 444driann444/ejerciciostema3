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

	public void ingresarDinero(int dineroIngresar) {
		if (dineroIngresar < 0) {
			System.out.println("valor incorrecto");
		} else {
			dinero = dinero + dineroIngresar;
		}

	}

	public void sacarDinero(int dinerSacar) {
		if (dinero <= 0) {
			System.out.println("No se puede retirar");
		} else if (dinerSacar < 0) {
			System.out.println("valor incorrecto");
		} else {
			dinero = dinero - dinerSacar;
		}
	}

	public void mostrarCuenta() {

		System.out.println(toString());
	}

	public boolean comprobrarDNI() {

		if (dni.length() != 9) {
			return false;
		}
		Character l0 = dni.charAt(0);
		if (!Character.isDigit(l0)) {
			return false;
		}

		Character l1 = dni.charAt(1);
		if (!Character.isDigit(l1)) {
			return false;
		}
		Character l2 = dni.charAt(2);
		if (!Character.isDigit(l2)) {
			return false;
		}
		Character l3 = dni.charAt(3);
		if (!Character.isDigit(l3)) {
			return false;
		}
		Character l4 = dni.charAt(4);
		if (!Character.isDigit(l4)) {
			return false;
		}
		Character l5 = dni.charAt(5);
		if (!Character.isDigit(l5)) {
			return false;
		}
		Character l6 = dni.charAt(6);
		if (!Character.isDigit(l6)) {
			return false;
		}
		Character l7 = dni.charAt(7);
		if (!Character.isDigit(l7)) {
			return false;
		}
		Character l8 = dni.charAt(8);
		if (!Character.isLetter(l8)) {
			return false;
		}
		
		String dniNum = l0 + "" + l1 + "" + l2 + "" + l3 + "" + l4 + "" + l5 + "" + l6 + "" + l7;
		System.out.println(dniNum);

		Integer numnos = Integer.valueOf(dniNum);
		numnos = numnos - ((numnos / 23) * 23);
		char letraQueDeberiaSer = '1';
		switch (numnos) {
		case 0:
			letraQueDeberiaSer = 'T';
			break;
		case 1:
			letraQueDeberiaSer = 'R';
			break;
		case 2:
			letraQueDeberiaSer = 'W';
			break;
		case 3:
			letraQueDeberiaSer = 'A';
			break;
		case 4:
			letraQueDeberiaSer = 'G';
			break;
		case 5:
			letraQueDeberiaSer = 'M';
			break;
		case 6:
			letraQueDeberiaSer = 'Y';
			break;
		case 7:
			letraQueDeberiaSer = 'F';
			break;
		case 8:
			letraQueDeberiaSer = 'P';
			break;
		case 9:
			letraQueDeberiaSer = 'D';
			break;
		case 10:
			letraQueDeberiaSer = 'X';
			break;
		case 11:
			letraQueDeberiaSer = 'B';
			break;
		case 12:
			letraQueDeberiaSer = 'N';
			break;
		case 13:
			letraQueDeberiaSer = 'J';
			break;
		case 14:
			letraQueDeberiaSer = 'Z';
			break;
		case 15:
			letraQueDeberiaSer = 'S';
			break;
		case 16:
			letraQueDeberiaSer = 'Q';
			break;
		case 17:
			letraQueDeberiaSer = 'V';
			break;
		case 18:
			letraQueDeberiaSer = 'H';
			break;
		case 19:
			letraQueDeberiaSer = 'L';
			break;
		case 20:
			letraQueDeberiaSer = 'C';
			break;
		case 21:
			letraQueDeberiaSer = 'K';
			break;
		case 22:
			letraQueDeberiaSer = 'E';
			break;
		default:
			System.out.println("Error");
		}
		System.out.println(letraQueDeberiaSer);

		if (letraQueDeberiaSer == l8) {
			return true;

		}


		return false;

	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", dinero=" + dinero + "]";
	}

}
