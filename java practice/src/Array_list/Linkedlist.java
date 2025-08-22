package Array_list;
import java.util.LinkedList;
import java.util.ArrayList;

public class Linkedlist {

	public static void main(String[] args) {
		 LinkedList<String> List = new LinkedList<>();
	        List.add("A");
	        List.add("B");
	        List.add("C");

	        ArrayList<String> arrayList = new ArrayList<>(List);

	        System.out.println("LinkedList: " + List);
	        System.out.println("ArrayList: " + arrayList);

	}

}
