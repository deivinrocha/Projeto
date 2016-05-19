package br.david;

import static org.junit.Assert.*;

import org.junit.Test;


public class FatorialTest {
	@Test
	public void testZero() {
		int resultado = Fatorial.calcular(0);
		assertEquals(resultado, 1, 0);
	}

	@Test
	public void testUm() {
		int resultado = Fatorial.calcular(2);
		assertEquals(resultado, 1, 0.0);
	}

}
