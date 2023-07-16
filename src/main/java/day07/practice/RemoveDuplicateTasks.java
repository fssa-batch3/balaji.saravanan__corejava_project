package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateTasks {

	public static void main(String[] args) {

		RemoveDuplicateTasks.UniqueList();
	}

	public static List UniqueList() {

		List<Task1> task = new ArrayList<>();

		task.add(new Task1(5531, "walk", "2203-02-22"));
		task.add(new Task1(5531, "walk", "2203-02-22"));
		task.add(new Task1(5533, "walk", "2203-02-24"));
		task.add(new Task1(5534, "walk2", "2203-02-25"));
		task.add(new Task1(5535, "walk4", "2203-02-26"));
		task.add(new Task1(5536, "walk5", "2203-02-27"));

		HashSet<Task1> taskUniqueSet = new HashSet<>(task);
		List<Task1> taskUniqueList = new ArrayList<>(taskUniqueSet);

		for (Task1 v : taskUniqueList) {
			System.out.println(v.getId() + " " + v.getName() + " " + v.getDeadline());
		}
		return taskUniqueList;
	}
}
