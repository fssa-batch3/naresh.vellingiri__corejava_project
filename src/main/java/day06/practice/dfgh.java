package day06.practice;


import java.util.ArrayList;

public class dfgh {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();

        // Adding tasks to the list
        taskList.add(new Task("Complete assignment"));
        taskList.add(new Task("Buy groceries"));
        taskList.add(new Task("Call a friend"));

        String taskName = "Buy groceries";
        boolean found = findTaskByName(taskName, taskList);

        if (found) {
            System.out.println("Task '" + taskName + "' found.");
        } else {
            System.out.println("Task '" + taskName + "' not found.");
        }
    }

    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
        for (Task task : tasks) {
            if (task.getDescription().equals(name)) {
                return true;
            }
        }
        return false;
    }
}

class Task1 {
    private String description;
    private boolean isCompleted;

    public Task1(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
