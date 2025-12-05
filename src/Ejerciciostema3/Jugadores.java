package Ejerciciostema3;

public class Jugadores {
	
	private String nombre1;
	private int vida = 100;
	public Jugadores(String nombre1) {
	
		this.nombre1 = nombre1;
		vida = 100;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Jugadores [nombre1=" + nombre1 + ", vida=" + vida + "]";
	}
	
	public void reducirVida () {
		vida = vida - 10;
	}
	public void imprimirVidaRestante() {
		System.out.println("Vida " + nombre1 + " = " + vida);
	}
	
	public boolean haPerdido() {
		if (vida <= 0) {
			return true;
		}else {
			return false;
		}
	}
	

	
	
}
