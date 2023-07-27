package day11.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class TaskDAOTest {

	@Test
	public void testCreateTask_Failure() {
		Task task1 = new Task("invalid task", "incomplete");

	
		boolean result;
		
		try {
			
			result = TaskDAO.createTask(task1);
			
		} catch (DAOException | SQLException ex) {
			
			ex.printStackTrace();
			
			assert false;
			return;
		}

		
		assertFalse(result); 
	}

}
