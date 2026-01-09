package Ejerciciostema3;

public class JugadorEjercicio10 {
	
	private int balonesTiene = 0;
	private int numJugador;
	private static int balonesCaja = 1000;
	
	public JugadorEjercicio10(int numJugador) {
		this.numJugador = numJugador;
	}
	
	public int retirarBalones() {
		int balonesAleatorios = (int) (Math.random() * (6 - 3) + 3);
		if (balonesAleatorios > balonesCaja) {
			balonesAleatorios = balonesCaja;
		}
		balonesCaja = balonesCaja - balonesAleatorios;
		balonesTiene = balonesTiene + balonesAleatorios;
		return balonesAleatorios;
	}

	public int getBalonesTiene() {
		return balonesTiene;
	}

	public void setBalonesTiene(int balonesTiene) {
		this.balonesTiene = balonesTiene;
	}

	public int getNumJugador() {
		return numJugador;
	}

	public void setNumJugador(int numJugador) {
		this.numJugador = numJugador;
	}

	public int getBalonesCaja() {
		return balonesCaja;
	}

	public void setBalonesCaja(int balonesCaja) {
		this.balonesCaja = balonesCaja;
	}

	@Override
	public String toString() {
		return "Jugador [balonesTiene=" + balonesTiene + ", numJugador=" + numJugador + ", balonesCaja=" + balonesCaja
				+ "]";
	}
	
	

}
