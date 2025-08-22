package Assessement_day8;
import java.util.LinkedList;
public class Insert_emnt {

	public static void main(String[] args) {
		  LinkedList<String> names = new LinkedList<>();
	        names.add("sanjana");
	        names.add("sri");
	        names.add("dhana");
	        names.add("penugonda");

	        System.out.println("Before insertion: " + names);

	        names.add(2, "prasanna");

	        System.out.println("After insertion: " + names);
	    }

	}


