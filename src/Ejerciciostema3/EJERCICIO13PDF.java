package Ejerciciostema3;

public class EJERCICIO13PDF {

	public static void main(String[] args) {
		
		Tablero10x10 tablero = new Tablero10x10();
		tablero.mostrarPosicion();
		tablero.imprimirTablero();
		tablero.desplazarseX(5);
		System.out.println();
		tablero.desplazarseY(-4);
		tablero.mostrarPosicion();
		tablero.imprimirTablero();
		
		System.out.println("Distancia del euclidea del punto " );
		tablero.mostrarPosicion();
		System.out.println("Con el punto 8,8");
		
		System.out.println(tablero.distanciaEuclidea(8,8));
		
		System.out.println();
		
		Punto p2 = new Punto(8, 8);
		
		System.out.println("Distancia del euclidea del punto " );
		tablero.mostrarPosicion();
		System.out.println(p2);
		
		System.out.println(tablero.distanciaEuclidea(p2));
		
	}
	
}
