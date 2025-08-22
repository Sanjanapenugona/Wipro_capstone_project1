package Control_statements;

public class Switch_case {
 
	public static void main(String[] args) {
		 int choice = 1;
	        double num1 = 10;
	        double num2 = 5;

	        switch (choice) {
	            case 1:
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case 2:
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case 3:
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case 4:
	                System.out.println("Result: " + (num1 / num2));
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }
	    }
	}
