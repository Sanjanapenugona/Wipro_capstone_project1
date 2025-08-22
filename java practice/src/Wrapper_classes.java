
public class Wrapper_classes {

	public static void main(String[] args) {
		  String str = "Sanjana2526";
	        int chars = 0;
	        int digits = 0;

	        for (char c : str.toCharArray()) {
	            if (Character.isLetter(c)) 
	            	chars++;
	            else if (Character.isDigit(c))
	            	digits++;
	        }

	        System.out.println("Number of Chars: " + chars);
	        System.out.println("Number of Digits: " + digits);
		
	
	}

}
