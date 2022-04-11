import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		// David Garcia Poo
		
		int resultadoSuma = Calculadora.suma(2, 3);
		int esperadoSuma = 5;
		assertEquals(esperadoSuma, resultadoSuma);
		
		int resultadoResta = Calculadora.resta(2, 3);
		int esperadoResta = -1;
		assertEquals(esperadoResta, resultadoResta);
		
		int resultadoMultiplicacion = Calculadora.multiplicacion(2, 3);
		int esperadoMultiplicacion = 6;
		assertEquals(esperadoMultiplicacion, resultadoMultiplicacion);
		
		int resultadoDivision = Calculadora.division(4, 2);
		int esperadoDivision = 2;
		assertEquals(esperadoDivision, resultadoDivision);
		
	}

}
