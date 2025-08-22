package Assesement_day5;
import java.util.Arrays;

interface Filter {
    boolean check(int n);
}

public class even_odd {

	public static void main(String[] args) {
		 int[] numbers = {1, 2, 3, 4, 5};

	        Filter even = n -> n % 2 == 0;
	        Arrays.stream(numbers).filter(even::check).forEach(System.out::println);
		
	}

}
