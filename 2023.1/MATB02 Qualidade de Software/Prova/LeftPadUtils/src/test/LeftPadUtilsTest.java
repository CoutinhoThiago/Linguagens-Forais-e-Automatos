package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.LeftPadUtils;

public class LeftPadUtilsTest {

	LeftPadUtils pad;
  
	@Before
	public void init() {
		pad = new LeftPadUtils();
	}
	
	//str test
	@Test
	public void strNull() { //str = null
		Assertions.assertEquals(pad.leftPad(null, 0, "teste"), null);
		Assertions.assertEquals(pad.leftPad(null, 0, null), null); //Tudo null
	}
	@Test
	public void strEspaco1() { //str = ESPACO & size = padStr -1
		Assertions.assertEquals(pad.leftPad(" ", 4, "teste"), "tes ");

	}
	@Test
	public void strEspaco2() { //str = ESPACO & size = padStr
		Assertions.assertEquals(pad.leftPad(" ", 5, "teste"), "test ");
	}
	@Test
	public void strEspaco3() { //str = ESPACO & size = padStr +1
		Assertions.assertEquals(pad.leftPad(" ", 6, "teste"), "teste ");
	}
	@Test
	public void strVazio1() { //str = string vazia & size = padStr -1
		Assertions.assertEquals(pad.leftPad("", 4, "teste"), "test"); //size = padStr -1
	}
	@Test
	public void strVazio2() { //str = string vazia & size = padStr
		Assertions.assertEquals(pad.leftPad("", 5, "teste"), "teste"); //size = padStr
	}
	@Test
	public void strVazio() { //str = string vazia & size = padStr +1
		Assertions.assertEquals(pad.leftPad("", 6, "teste"), "testet"); //size = padStr +1
	}
		
	//padStr test
	@Test
	public void padStrNull() { //padStr = null
		Assertions.assertEquals(pad.leftPad("teste", 6, null), " teste");
	}
	@Test
	public void padStrEspaco() { //padStr = ESPACO
		Assertions.assertEquals(pad.leftPad("teste", 6, " "), " teste");
	}
	@Test
	public void padStrVazio() { //padStr = string vazia
		Assertions.assertEquals(pad.leftPad("teste", 6, ""), " teste");
	}
	
	//size test
	@Test
	public void sizeDoTamanhoDoResultado() { //size = tamanho do resultado
		Assertions.assertEquals(pad.leftPad("teste", 6, "-"), "-teste");
	}
	@Test
	public void sizeMaiorQueResultado1() { //size = tamanho do resultado +1
		Assertions.assertEquals(pad.leftPad("teste", 7, "-"), "--teste");
	}
	@Test
	public void sizeMaiorQueResultado2() { //size = tamanho do resultado +1
		Assertions.assertEquals(pad.leftPad("teste", 8, "-"), "---teste");
	}
	@Test
	public void sizeMenorQueREsultado1() { //size = tamanho do resultado -1
		Assertions.assertEquals(pad.leftPad("teste", 5, "-"), "teste");
	}
	@Test
	public void sizeMenorQueREsultado2() { //size = tamanho do resultado -2
		Assertions.assertEquals(pad.leftPad("teste", 4, "-"), "teste");
	}
	@Test
	public void sizeIgualAZero() { //size = 0
		Assertions.assertEquals(pad.leftPad("teste", 0, "-"), "teste");
	}
	@Test
	public void sizeIgualAMenosUm() { //size = -1
		Assertions.assertEquals(pad.leftPad("teste", -1, "-"), "teste");
	}
	@Test
	public void sizeIgualAStr1() { //size = tamanho de str & tamanho de padStr = 0
		Assertions.assertEquals(pad.leftPad("teste", 5, ""), "teste"); //tamanho de padStr = 0
	}
	@Test
	public void sizeIgualAStr2() { //size = tamanho de str & tamanho de padStr = 1
		Assertions.assertEquals(pad.leftPad("teste", 5, "-"), "teste"); //tamanho de padStr = 1
	}
	@Test
	public void sizeIgualAStr3() { //size = tamanho de str & tamanho de padStr = 2
		Assertions.assertEquals(pad.leftPad("teste", 5, "--"), "teste"); //tamanho de padStr = 2
	}

	@Test
	public void sizeIgualTamanhoDeStr() { //size = tamanho de str +1 & tamanho de padStr = 0
		Assertions.assertEquals(pad.leftPad("teste", 6, ""), " teste");
	}
	@Test
	public void sizeMaiorQueTamanhoDeStr1() { //size = tamanho de str +1 & tamanho de padStr = 1
		Assertions.assertEquals(pad.leftPad("teste", 6, "-"), "-teste"); //tamanho de padStr = 1
	}
	@Test
	public void sizeMaiorQueTamanhoDeStr2() { //size = tamanho de str +1 & tamanho de padStr = 2
		Assertions.assertEquals(pad.leftPad("teste", 6, "--"), "-teste"); //tamanho de padStr = 2
	}
	

	@Test
	public void sizeEpadStr1() {//str e padStr = null
		Assertions.assertEquals(pad.leftPad(null, 1, null), null); 
	}
	@Test
	public void sizeEpadStr2() { //str e padStr = ""
		Assertions.assertEquals(pad.leftPad("", 1, ""), " "); 
		Assertions.assertEquals(pad.leftPad("", 2, ""), "  "); 
		Assertions.assertEquals(pad.leftPad("", 3, ""), "   "); 
	}	
	@Test
	public void sizeEpadStr3() { //str e padStr = ESPACO
		Assertions.assertEquals(pad.leftPad("  ", 0, " "), "  "); 
		Assertions.assertEquals(pad.leftPad(" ", 3, " "), "   "); 
		Assertions.assertEquals(pad.leftPad("  ", 3, " "), "   "); 
	}
	@Test
	public void sizeEpadStr4() { //str = null e padStr = ""
		Assertions.assertEquals(pad.leftPad(null, 6, ""), null); 
	}
	@Test
	public void sizeEpadStr5() { //str = null e padStr = ESPACO
		Assertions.assertEquals(pad.leftPad(null, 6, " "), null); 
		Assertions.assertEquals(pad.leftPad(null, 6, "      "), null); 
	}
	@Test
	public void sizeEpadStr6() { //str = "" e padStr = null
		Assertions.assertEquals(pad.leftPad("", 1, null), " "); 
	}
	@Test
	public void sizeEpadStr7() { //str = ESPACO e padStr = null
		Assertions.assertEquals(pad.leftPad(" ", 1, null), " "); 
	}
}
