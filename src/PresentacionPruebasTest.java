import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PresentacionPruebasTest {

	@Test
	void test() {
		
		int resultado = PresentacionPruebas.medirPalabra("Hola");
		int esperado = 4;
		assertEquals(esperado, resultado);
		
	}

}
