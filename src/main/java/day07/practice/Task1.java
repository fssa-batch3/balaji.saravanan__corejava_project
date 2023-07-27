package day07.practice;

import java.time.LocalDate;
import java.util.Objects;

public class Task1 {
	int id;
	String name;
	LocalDate deadline;

	public Task1(int id, String name, String deadline) {
		this.id = id;
		this.name = name;
		LocalDate date= LocalDate.parse(deadline);
		
		this.deadline = date;   
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDeadline() {
		return deadline;
	}


	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(name);	
		
	}


	@Override
	public boolean equals(Object obj) {
		
		Task1 other = (Task1) obj;
		
		return name == other.name;
	}
	
}