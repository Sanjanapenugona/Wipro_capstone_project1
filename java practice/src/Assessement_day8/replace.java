package Assessement_day8;
import java.util.ArrayList;
public class replace {

	public static void main(String[] args) {
		 ArrayList<String> subjects = new ArrayList<>();
	        subjects.add("Math");
	        subjects.add("Science");
	        subjects.add("Hindi");
	        subjects.add("English");
	        subjects.add("Telugu");

	        System.out.println("Before update: " + subjects);

	        subjects.set(0, "Statistics");

	        System.out.println("After update: " + subjects);

	}

}
