package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.PontosJogador;

public class PontosJogadorTest {
	private final PontosJogador pontos = new PontosJogador();
	
	@Test
	public void poucosPontos() {
		Assertions.assertEquals(30+50, pontos.calcularPontosTotais(30, 5));
	}
	
	@Test
	public void muitosPontosPoucasVidas() {
		Assertions.assertEquals(300+30, pontos.calcularPontosTotais(300, 1));
	}
	
	@Test
	public void muitosPontosMuitasVidas() {
		Assertions.assertEquals(500*3, pontos.calcularPontosTotais(500, 10));
	}
}
