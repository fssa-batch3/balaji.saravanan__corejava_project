package day07.practice;

import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicatesTest1 {

    @Test
    public void testCheckArrayList() {
        
        HashSet<Integer> expected = new HashSet<>();
        expected.add(55);
        expected.add(43);

        HashSet<Integer> actual = DuplicatesTest.CheckArrayList();
        
        Assertions.assertEquals(expected, actual);
    }
}
 