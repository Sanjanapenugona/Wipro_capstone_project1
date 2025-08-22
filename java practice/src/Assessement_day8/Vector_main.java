package Assessement_day8;
import java.util.Vector;
public class Vector_main {

	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
        names.add("Sanjana");
        names.add("Dhana");
        names.add("Sri");
        names.add("Penugonda");

        System.out.println("Original Vector: " + names);

        if (names.contains("Sri")) {
            System.out.println("Emma exists in the vector.");
        }

        names.set(2, "Prasanna"); 
        System.out.println("After replacement: " + names);

        names.removeAllElements(); 
        System.out.println("After clearing: " + names);
	}

}
