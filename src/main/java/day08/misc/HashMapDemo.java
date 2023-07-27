package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		String[] arrName= {"prathiusha", "vishali", "naresh", "prathiusha", "naresh", "nithilan"};
		
		Map<String, Integer> countMap= new HashMap<String , Integer>();
		
		for(int i=0; i<arrName.length; i++) {
			
			if(countMap.get(arrName[i])==null) {
				
				countMap.put(arrName[i], 1);
				
			}else {
				int count= countMap.get(arrName[i]);
				count++;
				countMap.put(arrName[i], count);
			}
		}
		for(String v: countMap.keySet()) {
			
			System.out.println(v+ ": " + countMap.get(v));
			
		}
	}

}
