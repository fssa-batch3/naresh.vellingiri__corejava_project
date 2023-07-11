package day03.practice;


public class User {
	
	
	String name;
	String password;
	String email;
//	1st constructor

	public User() {
		
	}
	
	
	//2nd constructor
	
	public User(String name, String password, String email  ) {
		
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		//Assigning values using parameters
		User acct1 = new User("Naresh", "Naresh@valid" , "naresh@gmail.com" );
        System.out.println(acct1.name + "-" + acct1.password + "-" + acct1.email);
        
		
		
	}
	
}


