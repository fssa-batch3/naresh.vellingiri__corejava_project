package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDo1 {
	


	@Test
	public void testValidTask() throws DAOException {
		
		try {
			Task task1 = new Task("Learn java", "Completed");
			Assertions.assertTrue(TaskDo.createTask(task1));
			
			System.out.println("Task completed");

		}
		
		catch (DAOException ex) {
			Assertions.assertEquals("Task object cannot be null", ex.getMessage());
		}

	}

	@Test
	public void testInValidTask() {

		try {
			Task task1 = null;
			TaskDo.createTask(task1);
			
			System.out.println("Task completed");

		}

		catch (DAOException ex) {
			Assertions.assertEquals("Task object cannot be null", ex.getMessage());
		}
	}

}
