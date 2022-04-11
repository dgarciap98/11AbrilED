import java.util.Scanner;

public class PresentacionPruebas {

	public static void main(String[] args) {
		
		// Programa para determinar el mayor de 3 numeros y el menor y sumarlos
		// Presentacion de pruebas de software
		
		int longitud=0;
		String frase="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		frase = entrada.nextLine();
		
		longitud = medirPalabra(frase);
		
		System.out.println("La frase: " + frase + " tiene " + longitud + " letras");
		
		

	}

	public static int medirPalabra(String frase) {
				
		return frase.length();
	}


}
