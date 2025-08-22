package Assesement_day5;

import java.util.Arrays;

public class Sort_by_alphabetically {

	public static void main(String[] args) {
	
	        String[] strings = {"monkey", "cat", "elephant", "dog", "lion"};

	        Arrays.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));
	        System.out.println("Sorted by length: " + Arrays.toString(strings));

	      
	        Arrays.sort(strings, (a, b) -> a.compareTo(b));
	        System.out.println("Sorted alphabetically: " + Arrays.toString(strings));

	}

}
