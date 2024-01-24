package es.studium.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {

	@Test
	void camino1() 
	{
		String resultadoReal = "La edad debe ser un número positivo";
		String resultadoEsperado = CajaBlanca.edadPerro(-1);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void camino2() 
	{
		String resultadoReal = "La edad es 21.0";
		String resultadoEsperado = CajaBlanca.edadPerro(2);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino3() 
	{
		String resultadoReal = "La edad es 25.0";
		String resultadoEsperado = CajaBlanca.edadPerro(3);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
}
