package Assesement_day5;
import java.util.Arrays;

public class alphabetically {
	

	public static void main(String[] args) {
		String[] strings = {"dog", "cat", "apple"};
        Arrays.sort(strings, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(strings));
	

	}

}
