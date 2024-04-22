package test;

import org.junit.jupiter.api.Test;

import main.NumberUtils;

import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;


public class NumberTest {

	NumberUtils number;
	private static List<Integer> numbers(int... nums) {
		List<Integer> list = new ArrayList<>();
		for(int n : nums)
			list.add(n);
		return list;
	}

  @Before
  public void init() {
    number = new NumberUtils();
  }

	@Test
	public void nulll() {
		System.out.println(number.add(null, null));
		Assertions.assertEquals(number.add(null, null), null);
		System.out.println(number.add(numbers(1), null));
		Assertions.assertEquals(number.add(numbers(1), null), null);
		System.out.println(number.add(null, numbers(1)));
		Assertions.assertEquals(number.add(null, numbers(1)), null);
		
		System.out.println(number.add(numbers(1), numbers(1)));
		Assertions.assertEquals(number.add(numbers(1), numbers(1)), new Integer[] {2});
	}
}


