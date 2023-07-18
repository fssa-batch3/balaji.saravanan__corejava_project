package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task1 implements Comparable<Task1> {

	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	public Task1(int id, String name, String date, int priority) {

		this.id = id;
		this.name = name;

		LocalDate deadli = LocalDate.parse(date);

		this.deadline = deadli;

		this.priority = priority;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Task1 o) {

		if (this.deadline == o.getDeadline()) {

			if (this.priority == o.getPriority()) {

				return 0;
			}
			else if (this.priority > o.getPriority()) {

				return 1;
			}else {
				return -1;
			}

		} 
		else if (this.deadline.compareTo(o.getDeadline()) > 0) {
              return 1;
		} 
		else {
			return -1;
		}
	}
}

public class TaskSort1 {

	public static void main(String[] args) {

		Task1 ta1 = new Task1(3, "Coding", "2022-10-22", 1);
		Task1 ta2 = new Task1(5, "Product Design", "2022-10-01", 4);
		Task1 ta3 = new Task1(1, "Software Design", "2022-10-07", 5);
		Task1 ta4 = new Task1(1, "Software Design", "2022-10-07", 3);

		ArrayList<Task1> list = new ArrayList<>();

		list.add(ta1);
		list.add(ta2);
		list.add(ta3);
		list.add(ta4);

		Collections.sort(list);

		for (Task1 v : list) {
			System.out.println(v.getId() + "," + v.getName() + "," + v.getDeadline() +"this is priority "+ v.getPriority());
		}

	}

}
