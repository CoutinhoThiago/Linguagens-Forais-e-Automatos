package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.Clumps;

public class ClumpsTest {

	Clumps clumps;

	@Before
	public void init() {
		clumps = new Clumps();
	}
	
//----- // ----- // ----- // ----- // ----- //
	
	@Test
	public void testNull() {
		int [] array = null;
		Assertions.assertEquals(clumps.countClumps(array), 0);
	}
	@Test
	public void testVazio() {
		int [] array = {};
		Assertions.assertEquals(clumps.countClumps(array), 0);
	}
	@Test
	public void testUmElemento() {
		int [] array = {1};
		Assertions.assertEquals(clumps.countClumps(array), 0);
	}
	  
//----- // ----- // ----- // ----- // ----- //
	  
	@Test
	public void testTodosIguais() {
		int [] array = { 1, 1, 1, 1, 1, 1 };
		Assertions.assertEquals(clumps.countClumps(array), 1);
	}
	@Test
	public void testDuplas() {
		int [] array = { 1, 1, 2, 2, 3, 3, 4, 4 };
		Assertions.assertEquals(clumps.countClumps(array), 4);
	}
	@Test
	public void testSoUmIgual() {
		int [] array = { 0, 1, 2, 3, 4, 5, 5};
		Assertions.assertEquals(clumps.countClumps(array), 1);
	}
	  
//----- // ----- // ----- // ----- // ----- //
	  
	@Test
	public void test123321() {
		int [] array = { 1, 2, 3, 3, 2, 1};
		Assertions.assertNotEquals(clumps.countClumps(array), 3);
	}
	@Test
	public void testIntercalado() {
		int [] array = { 1, 2, 1, 2, 1, 2};
		Assertions.assertNotEquals(clumps.countClumps(array), 3);
	}
}
