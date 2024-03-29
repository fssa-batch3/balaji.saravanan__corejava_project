package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day11.practice.DAOException;
import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;

	public Task(String name, String status) {
		this.name = name;
		this.status = status;

	}

	public Task() {

	}
}

public class TaskToDoDemo {

	public static boolean taskValidate(Task task) {
		
		if (task.name == null || "".equals(task.name)) {
			throw new IllegalArgumentException("Task name cannot null or empty");
		}
		if (task.status == null || "".equals(task.status)) {
			throw new IllegalArgumentException("Task status cannot null or empty ");
		}
		return true;
	}

	public static Connection getConnection() {

		Connection connection = null;
		try {

			String url = "jdbc:mysql://localhost:3306/task";

			connection = DriverManager.getConnection(url, "root", "123456");

		} catch (Exception e) {
			
			e.printStackTrace();
			
			throw new RuntimeException("Unable to connect to the database");
			
		}
		return connection;
	}

	public static boolean createTask(Task task) throws DAOException, IllegalArgumentException {

		try {

			taskValidate(task);
		}

		catch (IllegalArgumentException ex) {

			throw new IllegalArgumentException(ex.getMessage());

		}

		Connection con = null;

		try {

			String query = "INSERT INTO tasks (name,status) VALUES (?,?)";
			
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, task.name);
			preparedStatement.setString(2, task.status);
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}

		return true;
	}

	public static boolean updateTask(Task task) throws DAOException { // User defined Exception {

		try {

			taskValidate(task);
		}

		catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());

		}

		if (task.id <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero and less than 0");
		}

		Connection con = null;

		try {

			String query = "UPDATE tasks SET name = ?, status = ? WHERE id = ?";
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, task.name);
			preparedStatement.setString(2, task.status);
			preparedStatement.setInt(3, task.id);
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
		return true;

	}

	public static boolean deleteTask(int taskId) throws DAOException { // User defined Exception {
		
		if (taskId <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero and less than 0");
		}

		Connection con = null;

		try {

			String query = "DELETE FROM tasks WHERE id = ?";
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, taskId);

			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
		return true;
	}

	public static List<Task> getAllTasks() throws DAOException {

		Connection con = null;

		try {

			String query = "SELECT * FROM tasks";
			
			con = getConnection();

			Statement statement = con.createStatement();
			
			ResultSet result = statement.executeQuery(query);

			List<Task> taskslist = new ArrayList<>();
			
			while (result.next()) {

				Task task = new Task();
				
				task.id = result.getInt(1);
				task.name = result.getString(2);
				task.status = result.getString(3);
				taskslist.add(task);

			}
			return taskslist;

		} catch (SQLException ex) {
			
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
	}

	public static void main(String[] args) throws DAOException {

		List<Task> taskslist = getAllTasks();

		for (Task element : taskslist) {

			System.out.println("Id : " + element.id + ",Task Name : " + element.name + " Task Status : " + element.status);
		}

	}

}