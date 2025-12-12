package Ejerciciostema3;

public class Tablero10x10 {
	
	private Punto p ;
	
	
	public Tablero10x10 () {
		p = new Punto();
	}
	
	public void imprimirTablero() {
		for (int i = 1 ; i <= 10; i++) {
			System.out.print( "\t" + i);	
		}
		System.out.println();
		
		for (int i = 10; i >= 1 ; i-- ) {
			System.out.print(i + "\t");
			for (int j = 1; j <= 10; j++) {
				
			if (p.getY() == i && p.getX() == j) {
				System.out.print("o");
			}	
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "POSICION =" + p + "";
	}
	public void desplazarseX (int desplazamiento) {
		int nuevaPos = p.getX() + desplazamiento;
		 if (desplazamiento > 5  || desplazamiento < -4) {
			 System.out.println("Se pasa de los limites ");
		 }else {
			 p.setX(nuevaPos);
		 }
		
	}
	public void desplazarseY (int desplazamiento) {
		int nuevaPos = p.getY() + desplazamiento;
		if (desplazamiento > 5 || desplazamiento < -4) {
			System.out.println("Se pasa de los limites");
		}else {
			p.setY(nuevaPos);
		}
	}
	public double distanciaEuclidea(int x2, int y2) {
		
		double calculodeX =  (int) ( (Math.pow(x2 - p.getX(),2)));
		double calculodeY =  (int) Math.pow(y2 - p.getY(), 2) ;
		double raizdeXyY = Math.sqrt(calculodeX + calculodeY);
		return raizdeXyY;
		
	}
	public double distanciaEuclidea(Punto punto) {
		
		double calculodeX =  (int) ( (Math.pow(punto.getX() - p.getX(),2)));
		double calculodeY =  (int) Math.pow(punto.getY() - p.getY(), 2) ;
		double raizdeXyY = Math.sqrt(calculodeX + calculodeY);
		return raizdeXyY;
		
	}
	public void mostrarPosicion() {
		System.out.println("POSICION = " + p.getX() + " , " + p.getY());
	}
	
	
}
