package Assesement_day3;

public class vowels {

	public static void main(String[] args) {
		   String str = "Programming";
	        int Count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                Count++;
	            }
	        }
	        System.out.println("Number of vowels: " + Count);
		

	}

}
