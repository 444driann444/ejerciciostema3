package Ejerciciostema3;

public class ejercicio10pdf {
	
	
	public static void main(String[] args) {
		
		JugadorEjercicio10 j1 = new JugadorEjercicio10(1);
		JugadorEjercicio10 j2 = new JugadorEjercicio10(2);
		int contadorTurno = 0;
		
		do {
			contadorTurno++;
			System.out.println("------------");
			System.out.println("TURNO " + contadorTurno);
			System.out.println("------------");
			int balonesj1 = j1.retirarBalones();
			System.out.println("El J1 ha retirado " + balonesj1 + " balones.");
			System.out.println(j1);
			int balonesj2 =j2.retirarBalones();
			System.out.println("El J2 ha retirado " + balonesj2 + " balones.");
			System.out.println(j2);
			System.out.println();
		} while(j1.getBalonesCaja() > 0 && j2.getBalonesCaja() > 0);
		
		if(j1.getBalonesTiene() > j2.getBalonesTiene()) {
			System.out.println("Ha ganado Jugador" + j1.getNumJugador());
		} else if(j1.getBalonesTiene() == j2.getBalonesTiene()) {
			System.out.println("Empate");
		}else {
			System.out.println("Ha ganado Jugador" + j2.getNumJugador());	
		}
	}

}
