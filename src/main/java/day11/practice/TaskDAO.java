package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class Task {
	int id; 
	
	String name;
	String status;

	public Task(String name, String status) {
		this.name = name;
		this.status = status;
	}
}

class TaskDAO {

	public static void main(String[] args) {

		Task task1 = new Task("java class", "incomplete");
		try {
			
			createTask(task1);
			
			System.out.println("Task created successfully!");

		} catch (DAOException ex) {
			
			System.err.println("Error creating task: " + ex.getMessage());
			
		} catch (SQLException ex) {
			
			System.err.println("SQL Error: " + ex.getMessage());
		}
	}

	public static boolean createTask(Task task) throws DAOException, SQLException {

		String url = "jdbc:mysql://localhost:3306/Task";
		String userName = "root";
		String password = "123456";

		String query = "INSERT INTO tasks (name, status) VALUES (?, ?)";

		try (Connection con = DriverManager.getConnection(url, userName, password);

				PreparedStatement preparedStat = con.prepareStatement(query)) {

			preparedStat.setString(1, task.name);
			preparedStat.setString(2, task.status);
			
			int row=preparedStat.executeUpdate();
			
			return row>0;

		} catch (SQLException ex) {
			
			throw new DAOException("Error executing prepared statement", ex);
		}
	
	}
}
