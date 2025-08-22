package Assesement_day5;

public class User {
	public String name;
	private String password;
	public String setpassword() {
		return password;	
	}
	public void username() {
		System.out.println("user name");
	}
	public void password() {
		System.out.println("user password");
	}

	public static void main(String[] args) {
		User u = new User();
		u.username( );
		System.out.println("Sanjana");
		u.password( );
		System.out.println("******");
	

	}

}
