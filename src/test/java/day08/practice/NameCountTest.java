package day08.practice;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameCountTest {

	@Test
	public void testNumberOfName() {
		
		String[] names = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("Ram", 2);
		expected.put("Superman", 1);
		expected.put("spider", 1);
		expected.put("hey", 2);
		expected.put("hello", 1); 
		expected.put("Spider", 1);

		
		HashMap<String, Integer> result = NameCount.NumberOfName(names);

		Assertions.assertEquals(expected, result);
		
	}
	
	@Test
	public void testInvalidOfName() {
		
		String[] names = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("Ram", 2);
		expected.put("Superman", 1);
		expected.put("spider", 1);
		expected.put("hey", 2);
		expected.put("hello", 2);
		expected.put("Spider", 1);

		
		HashMap<String, Integer> result = NameCount.NumberOfName(names);

		Assertions.assertNotEquals(expected, result);
		
	}
}
