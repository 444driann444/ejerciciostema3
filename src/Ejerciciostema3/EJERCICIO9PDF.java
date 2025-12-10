package Ejerciciostema3;

import java.util.Scanner;

public class EJERCICIO9PDF {
	public static void main(String[] args) {
		Jugadores j1, j2;
		
		Scanner teclado = new Scanner(System.in);			
		
		System.out.println("¿J1 Como se llama?");
			String nombrejugador1 = teclado.nextLine();
			System.out.println("¿J2 Como se llama?");
			String nombrejugador2 = teclado.nextLine();
		
		j1 = new Jugadores(nombrejugador1);
		j2 = new Jugadores(nombrejugador2);
		int contadorturn = 1;
		
		System.out.println("COMIENZA EL JUEGO");
		
		do {
			int numeroran = (int) (Math.random()*100) ;
			
			
			System.out.println("Turno " + contadorturn);
			contadorturn++;
			
			
			System.out.println(j1.getNombre1() + " Introduce un numero" );
			int numerojugador1 = teclado.nextInt();
			
			System.out.println(j2.getNombre1() + " Introduce un numero");
			int numerojugador2 = teclado.nextInt();
			
			System.out.println("El numero aleatorio es " + numeroran);
			
			int distanciajugador1;
			int distanciajugador2;
			
			distanciajugador1 = Math.abs(numeroran - numerojugador1);
			distanciajugador2 = Math.abs(numeroran - numerojugador2);
			
			if (distanciajugador1 < distanciajugador2) {
				j2.reducirVida();
				System.out.println(nombrejugador2  + " pierde 10 puntos de vida ");
			}else if (distanciajugador2 < distanciajugador1) {
				j1.reducirVida();
				System.out.println(nombrejugador1  + " pierde 10 puntos de vida ");
			}else if (distanciajugador1 == distanciajugador2) {
				System.out.println("Son iguales no se quita vida");
			}else {
				System.out.println("error");
			}
				
				j1.imprimirVidaRestante();
				j2.imprimirVidaRestante();
				System.out.println();
				
				
		}while(!j1.haPerdido() && !j2.haPerdido());
		teclado.close();
		
		if (j1.haPerdido()  == true) {
			System.out.println("Ha ganado " + nombrejugador2);
		}else if (j2.haPerdido() == true) {
			System.out.println("Ha ganado " + nombrejugador1);
		}
	}

}
