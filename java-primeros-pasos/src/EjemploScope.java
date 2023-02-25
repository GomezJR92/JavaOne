
public class EjemploScope {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		// System.out.println("el valor de la condicion es: "+ esPareja);
		// || o
				// &&  y
		if(cantidadPersonas > 1) {
			
			esPareja = true;
		}else {
			
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		}

		else {
			System.out.println("Usted no tiene permitido entrar");
		}
	}

}
