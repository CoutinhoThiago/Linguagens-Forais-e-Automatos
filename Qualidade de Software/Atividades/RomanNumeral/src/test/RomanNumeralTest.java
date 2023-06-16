package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.RomanNumeral;

public class RomanNumeralTest {
	private final RomanNumeral roman = new RomanNumeral();
	
	@Test
	void convertNumeroOrdemDecrescente() {
		Assertions.assertEquals(6, roman.convert("VI"));
	}
	
	@Test
	void convertNumeroOrdemCrescente() {
		Assertions.assertEquals(9, roman.convert("IX"));
	}
	
	@Test
	void convertNumeroLetrasRepetidas() {
		Assertions.assertEquals(3, roman.convert("III"));
	}
	
	@Test
	void convertNumeroDecrescenteComposto() {
		Assertions.assertEquals(94, roman.convert("XCIV"));
	}
}
