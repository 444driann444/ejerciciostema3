package Ejerciciostema3;

import java.util.Scanner;

public class Cuentabanco {

	private double dinero;
	private String Propietario;
	private char divisa ;
	public Cuentabanco(double dinero, String propietario, char divisa) {
		super();
		this.dinero = dinero;
		Propietario = propietario;
		this.divisa = divisa;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getPropietario() {
		return Propietario;
	}
	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	public char getDivisa() {
		return divisa;
	}
	public void setDivisa(char divisa) {
		this.divisa = divisa;
	}
	@Override
	public String toString() {
		return "Cuentabanco [dinero=" + dinero + ", Propietario=" + Propietario + ", divisa=" + divisa + "]";
	}
	public double Cambiara€ (Scanner teclado) {
		double dineroqueda = dinero - 0.005 ;
		int pregunta;
		
		if(divisa == '€') {
			System.out.println("Ya esta en euros");
			return dinero;
		}
		
		System.out.println("Tienes =  " + dinero);
		System.out.println("El dinero que te queda despues de la comversion sera " + dineroqueda);
		System.out.println("Por tanto perderá " + (dinero - dineroqueda));
		System.out.println();
		System.out.println("Quieres cambiar la moneda?" + " 1 =  si / 0 = no");
		pregunta = teclado.nextInt();
		
		if (pregunta == 1 ) {
			dinero = dineroqueda;		
			
			if(divisa == 'L') {
				dinero = dineroqueda * 1.15;
			}
			if (divisa == '$') {
				dinero = dineroqueda * 0.84;
			}
			if (divisa == '€') {
				System.out.println("No se hace conversion");
			}
			divisa = '€';


		}else  if (pregunta == 0){
			 this.dinero = dinero;
			
		}
		return dinero;
		
	}
	public double Cambiara$ (Scanner teclado) {
		double dineroqueda = dinero - 0.005 ;
		int pregunta;
		
		if(divisa == '$') {
			System.out.println("Ya esta en dolares");
			return dinero;
		}
		
		System.out.println("Tienes =  " + dinero);
		System.out.println("El dinero que te queda despues de la comversion sera " + dineroqueda);
		System.out.println("Por tanto perderá " + (dinero - dineroqueda));
		System.out.println();
		System.out.println("Quieres cambiar la moneda?" + " 1 =  si / 0 = no");
		pregunta = teclado.nextInt();
		
		if (pregunta == 1 ) {
			dinero = dineroqueda;		
			
			if(divisa == 'L') {
				dinero = dineroqueda * 1.33;
			}
			if (divisa == '€') {
				dinero = dineroqueda * 1.16;
			}
			if (divisa == '$') {
				System.out.println("No se hace conversion");
			}
			divisa = '$';


		}else  if (pregunta == 0){
			 dinero = dinero;
			
		}
		return dinero;
		
	}
	public double CambiaraL (Scanner teclado) {
		double dineroqueda = dinero - 0.005 ;
		int pregunta;
		
		if(divisa == 'L') {
			System.out.println("Ya esta en Libras");
			return dinero;
		}
		
		System.out.println("Tienes =  " + dinero);
		System.out.println("El dinero que te queda despues de la comversion sera " + dineroqueda);
		System.out.println("Por tanto perderá " + (dinero - dineroqueda));
		System.out.println();
		System.out.println("Quieres cambiar la moneda?" + " 1 =  si / 0 = no");
		pregunta = teclado.nextInt();
		
		if (pregunta == 1 ) {
			dinero = dineroqueda;		
			
			if(divisa == '€') {
				dinero = dineroqueda * 0.87;
			}
			if (divisa == '$') {
				dinero = dineroqueda * 0.75;
			}
			if (divisa == 'L') {
				System.out.println("No se hace conversion");
			}
			divisa = 'L';


		}else  if (pregunta == 0){
			 dinero = dinero;
			
		}
		return dinero;
		
	}
	
	
}
