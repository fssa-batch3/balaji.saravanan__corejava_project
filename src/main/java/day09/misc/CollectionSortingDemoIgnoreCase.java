package day09.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSortingDemoIgnoreCase {
	
	public static void main(String[] args) {
		
		ArrayList<String> cityNames = new ArrayList<String>();
		
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("bangalore");
		cityNames.add("bangalore");
		
		Set<String> value= new TreeSet<>(cityNames);
		
		System.out.println(value);

		System.out.println("Before Sort:" + cityNames);
//		Collections.sort(cityNames);
		
		Collections.sort(cityNames, String::compareToIgnoreCase);// 
		
		System.out.println("After Sort:" + cityNames);
	}
}
