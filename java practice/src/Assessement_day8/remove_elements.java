package Assessement_day8;
import java.util.ArrayList;
public class remove_elements {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(30);
	        numbers.add(80);
	        numbers.add(20);
	        numbers.add(50);
	        System.out.println("**********Before clearing**********");
	        System.out.println( numbers);
	        System.out.println("Size: " + numbers.size());

	        numbers.clear();
	        System.out.println("**********After clearing**********");
	        System.out.println(numbers);
	        System.out.println("Size: " + numbers.size());

	}

}
