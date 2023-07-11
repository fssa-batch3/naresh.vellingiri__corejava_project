package day04.solved;

public class Animal2 {
	private int age;
	private String name;
	
	public Animal2(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public static void main(String[] args) {
		Lion1 simba = new Lion1("Simba");
		simba.setAge(11); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}
 
  class Lion1 extends Animal2 {

		public Lion1(String name) {
			super(name);		// Calling the constructor of Animal class
			System.out.println("Calling Child Constructor");
		}

		protected void roar() {
			System.out.println("The " + getAge() + " year old " + getName() + " says: Roar!");
		}

	}