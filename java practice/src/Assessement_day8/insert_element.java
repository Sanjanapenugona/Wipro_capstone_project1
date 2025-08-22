package Assessement_day8;
import java.util.LinkedList;

public class insert_element {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList <>();
		list.add("sanjana");
		list.add("dhana");
		list.add("sri");
		System.out.println("before insertion=" +list);
		list.add(2,"prasanna");
		System.out.println("After insertion=" + list);
		

	}

}
