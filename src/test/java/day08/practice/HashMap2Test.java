package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashMap2Test {

    @Test
    public void testDepartment() {
     
        String[] arr = {"HR,Ram", "HR, Suresh", "IT, Basker", "IT, Joseph"};
        
        HashMap<String, ArrayList<String>> expected = new HashMap<>();
        
        expected.put("HR", new ArrayList<>(List.of("Ram", "Suresh")));
        expected.put("IT", new ArrayList<>(List.of("Basker", "Joseph")));

    
        HashMap<String, ArrayList<String>> result = HashMap2.department(arr);

   
        Assertions.assertEquals(expected, result);
    } 
    
    @Test
    public void testDepartmentInvalid() {
  
        String[] arr = {"HR,Ram", "HR, Suresh", "IT, Basker", "IT, Joseph"};
        
        HashMap<String, ArrayList<String>> expected = new HashMap<>();
        
        expected.put("HR", new ArrayList<>(List.of("Ram", "Suresh", "Barath")));
        expected.put("IT", new ArrayList<>(List.of("Basker", "Joseph")));

     
        HashMap<String, ArrayList<String>> result = HashMap2.department(arr);


        Assertions.assertNotEquals(expected, result);
    }
}
