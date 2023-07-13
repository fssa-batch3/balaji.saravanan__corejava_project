package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListCheckingTest {

	@Test
	 public void testCityList1() { 
	        List<String> cityList = new ArrayList<>();
	        cityList.add("Chennai");
	        cityList.add("Bangalore");
	        cityList.add("Mumbai");
	        cityList.add("Mumbai");
	        
	        List<String> result = ListChecking.cityList();

	        Assertions.assertEquals(cityList, result);
	 }

    @Test
    public void testCityList2() { 
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        List<String> expected = new ArrayList<>();
        expected.add("Chennai");
        expected.add("Bangalore");
        expected.add("Mumbai");

        List<String> result = ListChecking.cityList2(cityList);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCityList2_EmptyList_ReturnsEmptyList() {
        List<String> cityList = new ArrayList<>();

        List<String> result = ListChecking.cityList2(cityList);

        Assertions.assertTrue(result.isEmpty());
    }
    
}
