package Assesement_day3;

public class splitsentence_intowords {

	public static void main(String[] args) {
		String sentence="This is my first program";
		 String[] words = sentence.split("\\s+");
	        for (String word : words) {
	            System.out.println(word);
	        }
		
	}

}
