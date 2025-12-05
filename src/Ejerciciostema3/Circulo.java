package Ejerciciostema3;

public class Circulo {

	private float radio;
	private final float  PI = (float) 3.1415;
	public Circulo(float radio) {
		super();
		this.radio = radio;
		
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", PI=" + PI + "]";
	} 
	public float calcularDiametro () {
		float diametro = 2 * radio;
		return diametro;
	}
	public float calcularArea () {
		float area = (float) (PI * Math.pow(radio, 2));
		return  area;
	}
	public float calcularLongitid () {
		float longitud = 2 * PI * radio;
		return longitud;
	}
	
}


