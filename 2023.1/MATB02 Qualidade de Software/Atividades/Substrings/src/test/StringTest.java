package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.StringUtil;

public class StringTest {

	StringUtil string;

	@Before
	public void init() {
		string = new StringUtil();
	}

	@Test
	public void testStrNull() {
		Assertions.assertEquals(string.substringsBetween(null, "a", "b"), null);
	}
	@Test
	public void testStrVazia() {
		Assertions.assertArrayEquals(string.substringsBetween("", "a", "b"), new String[] {});
	}
	@Test
	public void testStrTamanho1() {
		Assertions.assertArrayEquals(string.substringsBetween("aao", "a", "o"), new String[] {"a"});
	}
	@Test
	public void testStrTamanhoMaiorQue1() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "a", "d"), new String[] {"bc"});
	}
	
	@Test
	public void testOpenVazio() {
		Assertions.assertEquals(string.substringsBetween("sono", "", "b"), null);
	}
	@Test
	public void testOpenTamanho1() {
		Assertions.assertArrayEquals(string.substringsBetween("aao", "a", "o"), new String[] {"a"});
	}
	@Test
	public void testOpenTamanhoMaiorQue1() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "ab", "d"), new String[] {"c"});
	}
	
	@Test
	public void testCloseVazio() {
		Assertions.assertEquals(string.substringsBetween("cansaço", "a", ""), null);
	}
	@Test
	public void testCloseTamanho1() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "a", "d"), new String[] {"bc"});
	}
	@Test
	public void testCloseTamanhoMaiorQue1() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "a", "cd"), new String[] {"b"});
	}
	
	@Test
	public void semOpenSemClosed() {
		Assertions.assertArrayEquals(string.substringsBetween("fome", "", ""), null);
	}
	@Test
	public void comOpenSemColsed() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "a", ""), null);
	}
	@Test
	public void semOpenComClosed() {
		Assertions.assertArrayEquals(string.substringsBetween("abcd", "", "cd"), null);
	}
	@Test
	public void funcina() {
		Assertions.assertArrayEquals(string.substringsBetween("afuncionoue", "a", "e"), new String[] {"funcionou"});
	}
	@Test
	public void variasVezes() {
		Assertions.assertArrayEquals(string.substringsBetween("aeioaeioaeio", "a", "o"), new String[] {"ei","ei","ei"});
	}
}