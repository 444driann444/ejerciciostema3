package Ejerciciostema3;

public class Resctangulo {

	private int base;
	private int altura;

	public Resctangulo() {
		base = 5;
		altura = 2;
	}

	public Resctangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
		if (base < 0 || altura < 0) {
			this.base = 5;
			this.altura = 2;
		}
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base < 0) {
			System.out.println("Valor incorrecto");
		} else {
			this.base = base;
		}

	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura < 0) {
			System.out.println("Valor incorrecto");
		} else {
			this.altura = altura;
		}

	}

	public float calcularAreaRectangulo() {
		float area = base * altura;
		return area;
	}

	public float calcularPerimetroRectangulo() {
		float perimetro = 2 * (base + altura);
		return perimetro;
	}

	public void decirRectangulo() {
		if (base > altura) {
			System.out.println("Es horizontal");
		} else if (base < altura) {
			System.out.println("Es vertical");

		} else if (base == altura) {
			System.out.println("Es cuadrado");
		} else {
			System.err.println("Error");
		}
	}

	public void dibujarForma () {
		
		for(int i = 1 ; i <= altura ; i++) {
			
		//IMPRIMES LA BASE
			for (int j = 1 ; j <= base ;j++) {
				System.out.print("*");
			
			}				
			System.out.println("");

		}
		
	}

	@Override
	public String toString() {
		return "Resctangulo [base=" + base + ", altura=" + altura + "]";
	}

}
