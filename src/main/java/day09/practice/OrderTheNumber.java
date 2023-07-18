package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class OrderTheNumber {

	public static void main(String[] args) {
		
	    ArrayList<Integer> a= new ArrayList<>();
	    a.add(8);
	    a.add(9);
	    a.add(45);//input 8 9 45 12 1
	    a.add(12);
	    a.add(1);
	    
	    
		
		AsssendingOrder(a);

	}

	public static ArrayList<Integer> AsssendingOrder(ArrayList<Integer> arr) {
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		return arr;

	}

}
