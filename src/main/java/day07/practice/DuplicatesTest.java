package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesTest {

	public static void main(String[] args) {

		
		ArrayList<Integer> value = new ArrayList<>();

		value.add(55);
		value.add(43);
		value.add(55);
		
		HashSet<Integer> unquie = DuplicatesTest.CheckArrayList(value);

		System.out.println(unquie);
		
		
 
	} 

	public static HashSet<Integer> CheckArrayList(ArrayList<Integer> value) {
 
		HashSet<Integer> value2 = new HashSet<>(value);
		System.out.println(value2);

		return value2;

	}

}
