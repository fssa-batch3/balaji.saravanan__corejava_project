package day07.practice;

import java.time.LocalDate;

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
		
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		
		return result;
	}
     
	@Override
	public boolean equals(Object obj) {  
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task1 other = (Task1) obj;
		
		return id == other.id;
	}
}