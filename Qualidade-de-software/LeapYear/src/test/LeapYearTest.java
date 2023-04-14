package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.LeapYear;

public class LeapYearTest {
	private final LeapYear ano = new LeapYear();
	
	@Test
	public void quatro() {
		int random = (int) Math.random();

		assertTrue(ano.isLeapYear(random*4));
	}
	@Test
	public void errado() {
		int random = (int) Math.random();

		assertFalse(ano.isLeapYear(random*4*100));
	}
	
	@Test
	public void quatrocentos() {
		int random = (int) Math.random();

		assertTrue(ano.isLeapYear(random*400));

	}
}
