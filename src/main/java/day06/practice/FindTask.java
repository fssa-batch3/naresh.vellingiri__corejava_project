package day06.practice;

import java.util.*;


public class FindTask {
	 
    public String taskName;
     
    public int priority;
    
  FindTask(String taskName, int priority){
		
		this.taskName = taskName;
		this.priority = priority;
		
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

public static boolean addTaskToList(FindTask task) throws IllegalArgumentException {
		
		if(task.priority <= 0 || task.priority > 5) {
			throw new IllegalArgumentException("Task Priority must be 1 to 5");
		}
		
		if(task.taskName == null || "".equals(task.taskName)) {
			throw new IllegalArgumentException("Task Name Cannot be Null");
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
    	 
    	 ArrayList<FindTask> Task = new ArrayList<> ();
    	 
    	FindTask task1 = new FindTask("Java Learn",5);
 		
 		Task.add(task1);
     }
}


