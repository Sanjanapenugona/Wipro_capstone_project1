package Assesement_day5;

import java.util.function.Function;

public class strong_upper_lower {

	public static void main(String[] args) {
		   Function<String, String> toUppercase = s -> s.toUpperCase();
	        Function<String, String> toLowercase = s -> s.toLowerCase();

	        String original = "This is my first project";

	        System.out.println("Original: " + original);
	        System.out.println("Uppercase: " + toUppercase.apply(original));
	        System.out.println("Lowercase: " + toLowercase.apply(original));
	
	}

}
