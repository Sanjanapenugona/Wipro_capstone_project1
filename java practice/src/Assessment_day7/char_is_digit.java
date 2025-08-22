package Assessment_day7;

public class char_is_digit {

	public static void main(String[] args) {
		   char c = '9';

	        try {
	            int digit = Integer.parseInt(String.valueOf(c));
	            System.out.println(c + " is a digit.");
	        } catch (NumberFormatException e) {
	            System.out.println(c + " is not a digit.");
	        }

	}

}
