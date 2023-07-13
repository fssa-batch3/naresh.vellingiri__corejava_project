package day06.practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();

        // Adding tasks to the list
        taskList.add(new Task("Complete assignment"));
        taskList.add(new Task("Buy groceries"));
        taskList.add(new Task("Call a friend"));

        // Accessing task details
        for (Task task : taskList) {
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println();
        }
    }
}

