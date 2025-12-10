package Ejerciciostema3;

import java.util.Scanner;

public class EJERCICIO11PDF {

	public static void main(String[] args) {
		
		
		int opcion = 0;
		String nombre;
		double dinero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cual es tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Cuanto dinero quieres ingresar");
		dinero = teclado.nextDouble();
		

		Cuentabanco c1 = new Cuentabanco(dinero, nombre,  '€');
		
		do {
			
			System.out.println("----");
			System.out.println("MENU");
			System.out.println("----");
			System.out.println("0) Salir");
			System.out.println("1) Mostrar cuenta");
			System.out.println("2) Cambiar a €");
			System.out.println("3) Cambiar a L");
			System.out.println("4) Cambiar a $");
			System.out.println("Introduce una opcion ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Hasta otra ");	
				break;
			case 1:
				System.out.println(c1);	
				break;
			case 2:
				c1.Cambiara€(teclado);
				break;
			case 3:
				c1.CambiaraL(teclado);
				System.out.println("Hasta otra ");	
				break;
			case 4:
				c1.Cambiara$(teclado);
				System.out.println("Hasta otra ");	
				break;

			default:
				break;
			}
		}while (opcion != 0);
		teclado.close();
	}
}
