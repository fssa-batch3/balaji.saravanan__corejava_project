package day07.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateTasksTest {

    @Test
    public void testUniqueList() {

        List<Task1> expectedList = new ArrayList<>();
        
        expectedList.add(new Task1(5531, "walk", "2203-02-22"));
        expectedList.add(new Task1(5533, "walk", "2203-02-24"));
        expectedList.add(new Task1(5534, "walk2", "2203-02-25"));
        expectedList.add(new Task1(5535, "walk4", "2203-02-26")); 
        expectedList.add(new Task1(5536, "walk5", "2203-02-27"));

        List<Task1> actualList = RemoveDuplicateTasks.UniqueList();
        
        Assertions.assertEquals(expectedList, actualList);
        
        Assertions.assertTrue(actualList.containsAll(expectedList)); 
    }
}