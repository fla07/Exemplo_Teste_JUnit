import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testSoma() {
		Calc c = new Calc();
		assertEquals(5, c.soma(3, 2));
		assertEquals(39, c.soma(20, 19));
	}

	@Test
	void testSubtracao() {
		Calc c = new Calc();
		assertEquals(5, c.subtracao(8, 3));
		assertEquals(10, c.subtracao(30, 20));
	}

	@Test
	void testMultiplicacao() {
		Calc c = new Calc();
		assertEquals(5, c.multiplicacao(5, 1));
		assertEquals(4, c.multiplicacao(2, 2));
	}

	@Test
	void testDivisao() {
		Calc c = new Calc();
		assertEquals(5, c.divisao(10, 2));
		assertEquals(3, c.divisao(6, 2));
	}

	@Test
	void testPotencia() {
		Calc c = new Calc();
		assertEquals(100, c.potencia(10, 2));
		assertEquals(4, c.potencia(2, 2));
	}

	@Test
	void testRaizQuadrada() {
		Calc c = new Calc();
		assertEquals(2, c.raizQuadrada(4));
		assertEquals(5, c.raizQuadrada(25));
	}

}
