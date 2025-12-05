package Ejerciciostema3;

public class Ejercicio5pdf {
	
	public static void main(String[] args) {
		Circulo c1 = new Circulo((float) 17.2);
		
		System.out.println(c1);

		System.out.println("Diametro " + c1.calcularDiametro());
		System.out.println("Area " + c1.calcularArea());
		System.out.println("Longitud " + c1.calcularLongitid());
		
		System.out.println();
		c1.setRadio(19);
		System.out.println(c1);
		
	}
	
}
