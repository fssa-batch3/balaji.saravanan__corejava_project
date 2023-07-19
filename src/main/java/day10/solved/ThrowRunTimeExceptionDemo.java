package day10.solved;

import day07.practice.Task1;

class NewTaskValidator {
	public static boolean validate(Task1 task) {
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}

/**
 * Example for demonstrating Exception Hierarchy showing how RuntimeExceptions
 * are handled.
 */
public class ThrowRunTimeExceptionDemo {
	public static void main(String[] args) { 
		
		Task1 task = new Task1(11, "balaji", "22-07-03");
//task.setName("Creating test case"); Commenting this so that exception is thrown
		// Not surrounding with try catch as Illegal is a runtime exception
		NewTaskValidator.validate(task);
	}
}
