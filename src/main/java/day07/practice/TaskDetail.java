package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {
	
    private int id;
    private String name;
    private LocalDate deadline;
    
    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task other = (Task) obj;
        return id == other.id && name.equals(other.name) && deadline.equals(other.deadline);
    }
    
    @Override
    public int hashCode() {
        return id;
    }
}


public class TaskDetail {
	 public static void main(String[] args) {
		   
	        ArrayList<Task> tasks = new ArrayList<>();
	        
	        tasks.add(new Task(0, "Task 1", LocalDate.of(2023, 7, 22)));
	        tasks.add(new Task(2,"Task 2", LocalDate.of(2023, 7, 24)));
	        tasks.add(new Task(3, "Task 3", LocalDate.of(2023, 7, 26)));
	        tasks.add(new Task(4, "Task 4", LocalDate.of(2023, 7, 22))); 
	        tasks.add(new Task(5, "Task 2", LocalDate.of(2023, 7, 20))); 
	        
	        System.out.println("Tasks with duplicates:");
	        
	        for (Task task : tasks) {
	            System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDeadline());
	        }
	        
	        HashSet<Task> uniqueTasks = new HashSet<>(tasks);
	        
	        System.out.println("\nTasks without duplicates:");
	        
	        for (Task task : uniqueTasks) {
	            System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDeadline());
	        }
	    }
}
