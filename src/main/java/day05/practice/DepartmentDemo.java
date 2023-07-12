package day05.practice;

class Department {

	String deptName;
	
	int deptId;

	public Department(String deptName, int deptId) {
		
		this.deptName = deptName;
		
		this.deptId = deptId;
		
	}

	public void printdepartmentDetails() {

		System.out.println(" department Name: " + this.deptName + " department Id " + this.deptId);
	}

}

class Student {
	String name;
	int id;
	Department department;

	public Student(String name, int id, Department department) {

		this.name = name;
		this.id = id;
		this.department = department;

	}

	public void printDetails() {
		System.out.print("Student name " + this.name + " Student id " + this.id + " Student department ");
		this.department.printdepartmentDetails();
	}

}

public class DepartmentDemo {
	public static void main(String[] args) {

		Department dep = new Department("ECE", 2254);

		Student stu = new Student("balaji", 5531, dep);

		stu.printDetails();

		Department dep1 = new Department("EEE", 2054);

		Student stu1 = new Student("balaji", 5431, dep);

		stu1.printDetails();
	}

}
