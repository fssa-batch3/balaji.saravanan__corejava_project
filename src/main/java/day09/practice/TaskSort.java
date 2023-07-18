package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task> {

	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, String date) {

		this.id = id;
		this.name = name;

		LocalDate deadli = LocalDate.parse(date);

		this.deadline = deadli;

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

	@Override
	public int compareTo(Task o) {

		return this.deadline.compareTo(o.getDeadline());
	}
	
}

public class TaskSort {

	public static void main(String[] args) {

		Task ta1 = new Task(3, "Coding", "2022-10-22");
		Task ta2 = new Task(5, "Product Design", "2022-10-01");
		Task ta3 = new Task(1, "Software Design", "2022-10-07");
		Task ta4 = new Task(1, "Software Design", "2022-10-07");
		
		ArrayList<Task> list = new ArrayList<>();
		
		list.add(ta1);
		list.add(ta2);
		list.add(ta3);
		list.add(ta4);
		
		Collections.sort(list);
		
		for(Task v: list) {
			System.out.println(v.getId()+","+ v.getName()+","+ v.getDeadline());
		}
		
 
	}

}
