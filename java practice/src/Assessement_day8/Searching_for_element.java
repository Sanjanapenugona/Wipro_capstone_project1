package Assessement_day8;
import java.util.LinkedList;

public class Searching_for_element {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        String searchString = "mango";

        if (list.contains(searchString)) {
            System.out.println(searchString + " found in the list.");
        } else {
            System.out.println(searchString + " not found in the list.");
	}

  }

}