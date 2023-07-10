package day03.practice;

 class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id; 
        this.name = name;
        
    }
    
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
    
}


public class TestEmployee {
 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
        
        
        System.out.println(e1);
        System.out.println(e2);

        
    }
    
    
}
