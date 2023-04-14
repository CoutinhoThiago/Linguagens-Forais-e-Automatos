package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.ChocolateBars;

//Pequena = 1
//Grande = 5  

public class ChocolateBarsTest {

  ChocolateBars chocolate;
  
  @Before
  public void init() {
	  chocolate = new ChocolateBars();
  }

  @Test
  public void simples() {
	  assertEquals(chocolate.calculate(1, 1, 5), 0); //enche sem sobrar nenhuma pequena
	  assertEquals(chocolate.calculate(1, 1, 6), 1); //enche sobrando uma peuena
	  assertEquals(chocolate.calculate(4, 1, 10), -1); //não enche
	  
	  assertEquals(chocolate.calculate(1, 5, 1), 1); //enche sem nenhuma grande
	  assertEquals(chocolate.calculate(2, 5, 2), 2); //enche sem nenhuma grande
	  assertEquals(chocolate.calculate(3, 5, 3), 3); //enche sem nenhuma grande
	  assertEquals(chocolate.calculate(4, 5, 4), 4); //enche sem nenhuma grande
  }
  @Test
  public void negativo() {
	  assertEquals(chocolate.calculate(-5, 0, -5), 0);
	  assertEquals(chocolate.calculate(0, -1, -5), 0);
  }
  @Test
  public void pacoteDeCinco() {
	  assertEquals(chocolate.calculate(100, 1, 6), 1); //uma grande uma pequena
	  
	  assertEquals(chocolate.calculate(0, 10, 51), -1); //não enche grande
	  assertEquals(chocolate.calculate(50, 0, 51), -1); //não enche pequena
	  assertEquals(chocolate.calculate(10, 8, 51), -1); //não enche pequena + grande
  }
  @Test
  public void caixaGrande() {
	  assertEquals(chocolate.calculate(100, 10, 50), 0); //nenhuma pequena - caixa de 10
	  assertEquals(chocolate.calculate(100, 100, 500), 0); //nenhuma pequena - caixa de 100
	  assertEquals(chocolate.calculate(100, 1000, 5000), 0); //nenhuma pequena - caixa de 1000
	  assertEquals(chocolate.calculate(100, 10000, 50000), 0); //nenhuma pequena - caixa de 10000
	  assertEquals(chocolate.calculate(100, 100000, 500000), 0); //nenhuma pequena - caixa de 100000
	  assertEquals(chocolate.calculate(100, 1000000, 5000000), 0); //nenhuma pequena - caixa de 1000000
  }
  @Test
  public void random() {
	//random
	  int total = (int) Math.random();
	  int big = (int)total/5;
	  int smal = (int)total%5;
	  
	  assertEquals(chocolate.calculate(smal, big, total), 0); //sempre exato
	  assertEquals(chocolate.calculate(0, big, total-smal), smal); //Sempre sobra todas as pequenas
  }
}
