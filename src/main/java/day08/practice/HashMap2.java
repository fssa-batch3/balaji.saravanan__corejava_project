package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) {

		String[] arrr = { "HR,Ram", "HR, Suresh", "IT, Basker", "IT, Joseph" , "Admin, balaji"};
		
		HashMap2.department(arrr);

		
	} 
	  
	public static HashMap<String, ArrayList<String>> department(String[] arrr){
		
		int count = arrr.length - 1;

		HashMap<String, ArrayList<String>> countMap = new HashMap<String, ArrayList<String>>();

		while (count >= 0) {
			
			String s = arrr[count];

			String[] ar = s.split(",");

			int check = 0;

			for (String deptName : countMap.keySet()) {
				
				if (ar[0].equals(deptName)) {
					
					check = 1;
				}
			}

			if (check == 1) {
				
				ArrayList<String> arr = countMap.get(ar[0]);
				
				arr.add(ar[1]);
				
				countMap.put(ar[0], arr);
				
			} 
			else {
				
				ArrayList<String> arr = new ArrayList<String>();
				
				arr.add(ar[1]);
				
				countMap.put(ar[0], arr);
			}
			
			count--;
		}

		for (String n : countMap.keySet()) {
			
			System.out.println(n + " : "+countMap.get(n));
			
//			for(String v1: countMap.get(n)) {
//				
//				System.out.print(v1+", ");
//			}
//			System.out.println();
		}
		

		  
		return countMap;
	}

}
