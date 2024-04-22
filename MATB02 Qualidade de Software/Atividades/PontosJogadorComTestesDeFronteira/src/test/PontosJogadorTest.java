package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.PontosJogador;

public class PontosJogadorTest {
	public static PontosJogador pontos = new PontosJogador();
	
	@Test
	public void poucosPontos() {
		Assertions.assertEquals(49+50, pontos.calcularPontosTotais(49, 1));
	}
	
	@Test
	public void poucosPontosMuitasVidas() {
		Assertions.assertEquals(500+30, pontos.calcularPontosTotais(500, 1));
	}
	
	@Test
	public void muitosPontosMuitasVidas() {
		Assertions.assertEquals(500*3, pontos.calcularPontosTotais(500, 10));
	}
	
    @Test
    void fronteiraPontosTotaisComPontosMenoresQue50() {
    	Assertions.assertEquals(40+50, pontos.calcularPontosTotais(40, 2));
    }

    @Test
    void fronteiraVidasRestantesMenorQue3() {
    	Assertions.assertEquals(60+30, pontos.calcularPontosTotais(60, 2));
    }

    @Test
    void fronteiraVidasRestantesIgualOuMaiorQue3() {
    	Assertions.assertEquals(60*3, pontos.calcularPontosTotais(60, 3));
    }

    @Test
    void testCalcularPontosTotaisComVidasRestantesIgualOuMaiorQue4() {
    	Assertions.assertEquals(60*3, pontos.calcularPontosTotais(60, 4));
    }
    
    @Test
    void fronteiraPontosTotaisIgualA50() {
        Assertions.assertEquals(50, pontos.calcularPontosTotais(0, 0));
    }

    @Test
    void fronteiraVidasRestantesIgualA2EPontosIgualA50() {
        Assertions.assertEquals(80, pontos.calcularPontosTotais(0, 2));
    }

    @Test
    void fronteiraVidasRestantesIgualA2EPontosMaiorQue50() {
        Assertions.assertEquals(180, pontos.calcularPontosTotais(100, 2));
    }

    @Test
    void fronteiraVidasRestantesIgualA3EPontosMaiorQue999() {
        Assertions.assertEquals(3000, pontos.calcularPontosTotais(1000, 3));
    }
}
