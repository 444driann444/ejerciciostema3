package Ejerciciostema3;

import java.util.Scanner;


public class EJERCICIO8PDF {

	public static void main(String[] args) {
		Resctangulo r1 = new Resctangulo();
		
		
		Scanner teclado = new Scanner(System.in);
		int opcion ;
		
		do {
			System.out.println("----MENU----");
			System.out.println("0) Salir");
			System.out.println("1) Mostrar info");
			System.out.println("2) Calculo de Area");
			System.out.println("3) Calculo de perimetro");
			System.out.println("4) Forma ");
			System.out.println("5) Dibujar forma");
			System.out.println("6) Modificar altura");
			System.out.println("7) Modificar base");
			System.out.println("Introduce una opcion ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Hasta otra");
				break;
			case 1:
				System.out.println(r1);
				break;
			case 2:
				System.out.println("Área: " + r1.calcularAreaRectangulo());
				break;
			case 3:
				r1.calcularPerimetroRectangulo();
				break;
			case 4:
				r1.decirRectangulo();
				break;
			case 5:
				r1.dibujarForma();
				break;
			case 6:
				System.out.println("Dime la nueva altura del rectangulo");
				int nuevaaltura = teclado.nextInt();
				r1.setAltura(nuevaaltura);
				break;
			case 7:
				System.out.println("Dime la nueva base del rectangulo");
				int nuevabase = teclado.nextInt();
				r1.setBase(nuevabase);
				break;

			default:
				break;
			}
			
		}while(opcion != 0);
		teclado.close();
	}
}
