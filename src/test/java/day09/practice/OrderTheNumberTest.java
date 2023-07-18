package day09.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTheNumberTest {

	@Test
	public void testAsssendingOrder() {
		
		ArrayList<Integer> input = new ArrayList<>();
		input.add(8);
		input.add(9);
		input.add(45);
		input.add(12);
		input.add(1); 

		
		ArrayList<Integer> result = OrderTheNumber.AsssendingOrder(input);

		
		Assertions.assertNotNull(result);
		
		for (int num : result) {
			
			Assertions.assertTrue(num >= 0);
		}
	}
}