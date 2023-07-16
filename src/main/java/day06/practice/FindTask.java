package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTask {
	
	public static boolean findTaskByName(String name, List<Task> tasks) {
		
		if (name == null || tasks == null) {
			
			throw new IllegalArgumentException("Name and tasks list must not be null.");
		}
		

		for (Task value : tasks) {
			if (value.taskName.equals(name)) {
				return true;
			}
		}

		return false;
	} 

	public static void main(String[] args) {
		
		List<Task> tasksList = new ArrayList<>();
		
		tasksList.add(new Task("walk", 5533));
		tasksList.add(new Task("swim", 5533));
		tasksList.add(new Task("write", 5533));
		tasksList.add(new Task("read", 5533));

		FindTask.findTaskByName("swim", tasksList);
	} 
}
