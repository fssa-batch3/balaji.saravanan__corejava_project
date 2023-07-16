package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class TaskTest {
	
	public static void main(String[] args) { 
		
		List<Task> tasksList= new ArrayList<Task>(); 
		
		tasksList.add(new Task("walk", 5533));
		tasksList.add(new Task("swim", 5533)); 
		tasksList.add(new Task("write", 5533));
		tasksList.add(new Task("read", 5533));
	 
		
		for(Task value: tasksList) {
			System.out.println(value.taskName+" this is priority "+ value.priority); 
		} 
		
	}
	
	

}
