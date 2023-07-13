package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindTaskTest {

	 List<Task> tasksList;

	@BeforeEach     //.@BeforeEach சிறுகுறிப்பு ஒரு சோதனை வகுப்பில் ஒவ்வொரு சோதனை 
	                 //முறைக்கும் முன் ஒரு முறை செயல்படுத்தப்பட வேண்டும் என்பதைக் குறிக்கப் 
	                  //பயன்படுத்தப்படுகிறது.
	public void setup() {
		tasksList = new ArrayList<>();
		tasksList.add(new Task("walk", 5533));
		tasksList.add(new Task("swim", 5533));
		tasksList.add(new Task("write", 5533));
		tasksList.add(new Task("read", 5533));
	}

	@Test
	public void testFindTaskByName() {
		boolean result = FindTask.findTaskByName("swim", tasksList);
		Assertions.assertTrue(result);
	}

	@Test
	public void testFindTaskNotname() {
		boolean result = FindTask.findTaskByName("jump", tasksList);
		Assertions.assertFalse(result);
	}

	@Test
	public void testFindTasknull() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FindTask.findTaskByName(null, tasksList);
		});

		Assertions.assertEquals("Name and tasks list must not be null.", exception.getMessage());
	}

	@Test
	public void testFindTaskNUllObject() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FindTask.findTaskByName("swim", null);

		});
	}

	@Test
	public void testFindTaskEmptyList() {
		List<Task> emptyList = new ArrayList<>();
		boolean result = FindTask.findTaskByName("swim", emptyList);
		Assertions.assertFalse(result);
	}
}

