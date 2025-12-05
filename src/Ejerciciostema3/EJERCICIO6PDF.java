package Ejerciciostema3;

public class EJERCICIO6PDF {

	public static void main(String[] args) {
		
		Banco kevin = new Banco("kevin", "70830871W", "calle don carmelo, n8", 0);
		System.out.println(kevin);
		
		
		kevin.ingresarDinero(500);		
		kevin.mostrarCuenta();
		
		kevin.sacarDinero(200);		
		kevin.mostrarCuenta();
		
		kevin.setDomicilio("calle madreperla, nº8 ");		
		kevin.mostrarCuenta();
		
		
	}
}
