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
		
		
		do {
			int numeroran = (int) (Math.random()*100) ;
			System.out.println("El numero aleatorio es " + numeroran);
			
			

			
			System.out.println("COMIENZA EL JUEGO");
			
			System.out.println("Turno " + contadorturn);
			contadorturn++;
			
			
			
			System.out.println(j1.getNombre1() + " Introduce un numero" );
			int numerojugador1 = teclado.nextInt();
			
			System.out.println(j2.getNombre1() + " Introduce un numero");
			int numerojugador2 = teclado.nextInt();
			
			
			
			
			
		}while(j1.haPerdido()|| j2.haPerdido());
		teclado.close();
	}

}
