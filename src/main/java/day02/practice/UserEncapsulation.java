package day02.practice;

class User{
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

public class UserEncapsulation {
	
	public static void main(String[] args) {
		User user = new User();
		
		user.setId(12);
		user.setName("Balaji");
		user.setPassword("balajis");
		user.setEmail("balajis@gmail.com");
		
		System.out.println("this is your Id : "+ user.getId());
		System.out.println("this is your Name : "+ user.getName());
		System.out.println("this is your Password : "+ user.getPassword());
		System.out.println("this is your Email : "+ user.getEmail());
		
		
	}

}
