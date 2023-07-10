package day03.practice;

class User{  // this constoctor learning 
	
	private String name;  // inizialize a private variables
	private String password;
	private String emailId;
	
	
	public String getName() {  // this is geter seter
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public User() {   // this is normal constoctor
		
	}
	public User(String name, String password, String emailId) {   // this is overloading constuctor
		this.name= name;
		this.password= password;
		this.emailId= emailId;
	}
	
}

public class TestUser {
	public static void main(String[] args) {
		
		User user = new User();
		
		user.setName("balaji");
		user.setPassword("balajis5");
		user.setEmailId("balajis@gmail.com");
		
		System.out.println("This is normal constuctor : \n"+user.getName()+","+user.getPassword()+","+user.getEmailId());
		
		User user1= new User("balaji", "balajs@3", "balajis@gmail.com");
		
		System.out.println("This is overloading constuctor : \n"+user1.getName()+","+user1.getPassword()+","+user1.getEmailId());
		
	}

}
