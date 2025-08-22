package Control_statements;
import java.util.Scanner;
public class Break_stmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter full name");
		String name=sc.nextLine();
		System.out.println("enter mobile number");
		long number=sc.nextLong();
		sc.nextLine();
		System.out.println("email");
		String email=sc.nextLine();
		System.out.println("username");
		String username=sc.nextLine();
		System.out.println("password");
		String password=sc.nextLine();
		System.out.println("confirm password");
		String confirmpassword=sc.nextLine();
		
			System.out.println("registration details are");
			System.out.println("name            ="+name);
			System.out.println("mobile number   ="+number);
			System.out.println("email           ="+email);
			System.out.println("username        ="+username);
			System.out.println("password        ="+password);
			System.out.println("confpassword    ="+confirmpassword);
			
			
		
	}

}
