package Assessement_day8;
import java.util.ArrayList;
import java.util.Collections;
public class Sort_integer_asc {

	public static void main(String[] args) {
		   ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(34);
	        numbers.add(12);
	        numbers.add(56);
	        numbers.add(7);
	        numbers.add(23);
	        numbers.add(90);
	        numbers.add(45);

	        System.out.println("Before sorting: " + numbers);

	        Collections.sort(numbers);

	        System.out.println("After sorting: " + numbers);
	    }
	}

