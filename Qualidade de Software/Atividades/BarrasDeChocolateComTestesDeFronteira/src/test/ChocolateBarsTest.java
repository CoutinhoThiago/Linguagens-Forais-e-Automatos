package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.ChocolateBars;

public class ChocolateBarsTest {
	private final ChocolateBars bars = new ChocolateBars();
	
	@Test
	public void apenasBarrasPequenas() {
		Assertions.assertEquals(3, bars.calculate(4, 2, 3));
	}
	
	@Test
	public void apenasBarrasGrandes() {
		Assertions.assertEquals(0, bars.calculate(5, 3, 10));
	}
	
	@Test
	public void barrasPequenasbarrasGrandes() {
		Assertions.assertEquals(2, bars.calculate(5, 4, 17));
	}
	
	@Test
	public void barrasInsuficientes() {
		Assertions.assertEquals(-1, bars.calculate(1, 1, 10));
	}	
	
	@Test
	public void valoresEntradaNegativos() {
		Assertions.assertEquals(-1, bars.calculate(-1, -1, -1));
	}
	
	@Test
	public void todasBarrasGrandes() {
	    Assertions.assertEquals(0, bars.calculate(0, 10, 50));
	}

	@Test
	public void apenasUmaBarraPequena() {
	    Assertions.assertEquals(1, bars.calculate(1, 10, 6));
	}

	@Test
	public void barrasGrandesExcedemTotal() {
	    Assertions.assertEquals(2, bars.calculate(1, 5, 8));
	}

	@Test
	public void todasBarrasPequenas() {
	    Assertions.assertEquals(-1, bars.calculate(3, 0, 5));
	}
	
	@Test
	public void barrasGrandesNaoSaoSuficientes() {
	    Assertions.assertEquals(-1, bars.calculate(2, 3, 20));
	}

	@Test
	public void barrasGrandesSaoSuficientes() {
	    Assertions.assertEquals(0, bars.calculate(2, 5, 25));
	}

	@Test
	public void todasAsBarrasSaoGrandes() {
	    Assertions.assertEquals(0, bars.calculate(0, 10, 50));
	}

	@Test
	public void todasAsBarrasSaoPequenas() {
	    Assertions.assertEquals(4, bars.calculate(4, 0, 4));
	}

	@Test
	public void nenhumaBarraDisponivel() {
	    Assertions.assertEquals(-1, bars.calculate(0, 0, 5));
	}
}
