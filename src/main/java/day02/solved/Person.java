package day02.solved;

 class Person1 {
    private String name1;  // Private data member

    public String getName() {  // Public getter method
        return name1;
    }

    public void setName(String name) {  // Public setter method
        // name = name; Wrong way to use refer the attribute of class
			this.name1 = name; // this Keyword used for referring current instance
    }
}




public class Person{
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.setName("John");      // Setting the name using the setter method
		String name = person.getName();  // Accessing the name using the getter method
		System.out.println(name); 
	}
}

// Usage
   // Output: John

