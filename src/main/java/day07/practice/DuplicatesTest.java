package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesTest {

	public static void main(String[] args) {

		HashSet<Integer> unquie = DuplicatesTest.CheckArrayList();

		System.out.println(unquie);

	}

	public static HashSet<Integer> CheckArrayList() {

		ArrayList<Integer> value = new ArrayList<>();

		value.add(55);
		value.add(43);
		value.add(55);
 
		HashSet<Integer> value2 = new HashSet<>(value);

		return value2;

	}

}
