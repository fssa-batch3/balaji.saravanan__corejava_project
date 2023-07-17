package day08.practice;

import java.util.HashMap;

public class NameCount {

	public static void main(String[] args) {
		
		String name = "Ram,Ram,Superman,spider,hey,hello,hey,Spider";
		
		String[] va= name.split(",");
		
		NameCount.NumberOfName(va);
		
	}
	
	public static HashMap<String, Integer> NumberOfName(String[] names){
		
		HashMap<String, Integer> value= new HashMap<>();
		
		for(int i=0; i<names.length; i++) {
			
			if(value.get(names[i])==null) {
				
				value.put(names[i],1);	
			}else {
				int count=value.get(names[i]);
				count++;
				value.put(names[i], count);
			}
		}
		
		for(String v: value.keySet()) {
			System.out.println(v+" : "+ value.get(v));
		}
		
		return value;
		
	}
}
