package test;

import java.util.ArrayList;
import java.util.List;

public class NumberUtilsTest {

	private static List<Integer> numbers(int... nums) {
		   List<Integer> list = new ArrayList<>();
		   for(int n : nums)
		     list.add(n);
		   return list;
		 }
	
}
