import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// David Garcia Poo
		
		Scanner entrada = new Scanner(System.in);
		int eleccion = 0, a=0, b=0, c=0;
		boolean pasar = false;
		
		System.out.println("Introduce el primer valor");
		a = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introduce el segundo valor");
		b = Integer.parseInt(entrada.nextLine());
				
		do {
			System.out.println("Introduce el numero de la opcion deseada \n"
					+ "1) Suma \n"
					+ "2) Resta \n"
					+ "3) Multiplicacion \n"
					+ "4) Division");
			
			eleccion = Integer.parseInt(entrada.nextLine());
			
			if(eleccion >= 1 && eleccion <=4) {
				pasar = true;
			}
			
		}while(!pasar);
		
		switch (eleccion) {
			case 1:
				c = suma(a,b);
				break;
			case 2:
				c = resta(a,b);
				break;
			case 3:
				c = multiplicacion(a,b);
				break;
			case 4:
				c = division(a,b);
				break;
			default:
				System.out.println("Invalido");
				break;
		}
		
		System.out.println("El resultado es " + c);
		
	}

	public static int suma(int a, int b) {		
		return a+b;
	}
	
	public static int resta(int a, int b) {		
		return a-b;
	}
	
	public static int multiplicacion(int a, int b) {		
		return a*b;
	}
	
	public static int division(int a, int b) {		
		return a/b;
	}

}
