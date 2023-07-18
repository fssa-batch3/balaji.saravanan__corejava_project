package day09.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSortTest {

	@Test
	public void testOrderingTheObject() {
		
		Task ta1 = new Task(3, "Coding", "2022-10-22");
		Task ta2 = new Task(5, "Product Design", "2022-10-01");
		Task ta3 = new Task(1, "Software Design", "2022-10-07");
		Task ta4 = new Task(1, "Software Design", "2022-10-07");

		ArrayList<Task> expectedList = new ArrayList<>();
		
		expectedList.add(ta2);
		expectedList.add(ta3);
		expectedList.add(ta4);
		expectedList.add(ta1);

		ArrayList<Task> resultList = TaskSort.orderingTheObject();

		
		Assertions.assertEquals(expectedList.size(), resultList.size());
		
	}

}
