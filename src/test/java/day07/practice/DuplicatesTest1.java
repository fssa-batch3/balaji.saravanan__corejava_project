package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicatesTest1 {

    @Test
    public void testCheckArrayList() {
        
        HashSet<Integer> expected = new HashSet<>();
         
        expected.add(55);
        expected.add(43);
        
        ArrayList<Integer> value = new ArrayList<>();

		value.add(55);
		value.add(43);
		value.add(55);

        HashSet<Integer> actual = DuplicatesTest.CheckArrayList(value);
        
        Assertions.assertEquals(expected, actual);
    } 
    
//    @Test
//	public void testChecArrayList() {
//    	HashSet<Integer> expected = new HashSet<>();
//    	expected.add(55);
//        expected.add(43);
//        expected.add(55);
//    	
//		HashSet<Integer> result = DuplicatesTest.CheckArrayList();
//		
//		Assertions.assertNotEquals(expected, result);
//	}
}
 