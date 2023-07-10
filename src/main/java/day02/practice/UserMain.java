package day02.practice;

 class User {

	private int id;
	private String name;
	private String password;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

 public class UserMain{
	 public static void main(String[] args) {
		
		 
		 User user = new User();
		 
		   user.setId(22);

		   user.setName("Naresh");
		 
		   user.setPassword("Naresh@2000");
		   user.setEmail("naresh@gmail.com");
		   
		   System.out.println(user.getId());
		   System.out.println(user.getName());
		   System.out.println(user.getPassword());
		   System.out.println(user.getEmail());

	}
 }
 
 
 
 
 
 
 
 
 
 
 



