package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day06.practice.FindTask;
import day06.practice.Task;

public class DuplicatesTest1 {

    @Test
    public void testCheckArrayList() {
        
        HashSet<Integer> expected = new HashSet<>();
        
        expected.add(55);
        expected.add(43);

        HashSet<Integer> actual = DuplicatesTest.CheckArrayList();
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
	public void testChecArrayList() {
    	HashSet<Integer> expected = new HashSet<>();
    	expected.add(55);
        expected.add(43);
        expected.add(55);
    	
		HashSet<Integer> result = DuplicatesTest.CheckArrayList();
		
		Assertions.assertNotEquals(expected, result);
	}
}
 