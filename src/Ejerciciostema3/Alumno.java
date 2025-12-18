package Ejerciciostema3;

import java.sql.Date;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int dia;
	private int mes;
	private int anno;
	private float notaProg = 5;
	private float notaFol = 5 ;
	private float notaLenguaje = 5;
	private float notaBase = 5;
	private float notaEntorno = 5;
	private float notaOptativa = 5;
	private float notaIngles = 5;
	private float notaSif = 5;
	private String dni;
	public Alumno(String nombre, String apellido, int dia, int mes, int anno, float notaProg, float notaFol,
			float notaLenguaje, float notaBase, float notaEntorno, float notaOptativa, float notaIngles, float notaSif,
			String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
		this.notaProg = notaProg;
		this.notaFol = notaFol;
		this.notaLenguaje = notaLenguaje;
		this.notaBase = notaBase;
		this.notaEntorno = notaEntorno;
		this.notaOptativa = notaOptativa;
		this.notaIngles = notaIngles;
		this.notaSif = notaSif;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String apellido, int dia, int mes, int anno) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
		generarDniAleatorio();
	}
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public float getNotaProg() {
		return notaProg;
	}
	public void setNotaProg(float notaProg) {
		this.notaProg = notaProg;
	}
	public float getNotaFol() {
		return notaFol;
	}
	public void setNotaFol(float notaFol) {
		this.notaFol = notaFol;
	}
	public float getNotaLenguaje() {
		return notaLenguaje;
	}
	public void setNotaLenguaje(float notaLenguaje) {
		this.notaLenguaje = notaLenguaje;
	}
	public float getNotaBase() {
		return notaBase;
	}
	public void setNotaBase(float notaBase) {
		this.notaBase = notaBase;
	}
	public float getNotaEntorno() {
		return notaEntorno;
	}
	public void setNotaEntorno(float notaEntorno) {
		this.notaEntorno = notaEntorno;
	}
	public float getNotaOptativa() {
		return notaOptativa;
	}
	public void setNotaOptativa(float notaOptativa) {
		this.notaOptativa = notaOptativa;
	}
	public float getNotaIngles() {
		return notaIngles;
	}
	public void setNotaIngles(float notaIngles) {
		this.notaIngles = notaIngles;
	}
	public float getNotaSif() {
		return notaSif;
	}
	public void setNotaSif(float notaSif) {
		this.notaSif = notaSif;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dia=" + dia + ", mes=" + mes + ", anno="
				+ anno + ", notaProg=" + notaProg + ", notaFol=" + notaFol + ", notaLenguaje=" + notaLenguaje
				+ ", notaBase=" + notaBase + ", notaEntorno=" + notaEntorno + ", notaOptativa=" + notaOptativa
				+ ", notaIngles=" + notaIngles + ", notaSif=" + notaSif + ", dni=" + dni + "]";
	}

	
	
	public void imprimirFecha (char Simbolo) {
		if (Simbolo == '-' ) {
			System.out.println( dia + "-" + mes + "-" + anno );
		}
		else if (Simbolo == '/') {
			System.out.println( dia + "/" + mes + "/" + anno);
		}
	}
	public boolean QuienVaAntes (String Alumno) {
		
		return false;
	}
	
	public void generarDniAleatorio() {
		int numaleatoriodni = (int) (Math.random()*99999999 + 1);
		if (numaleatoriodni < 8 ) {
			System.out.println(00000000);
			
		}
		int letradeldni;
		
	}


	

	
	
	
}
