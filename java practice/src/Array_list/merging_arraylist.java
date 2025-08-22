package Array_list;
import java.util.ArrayList;

public class merging_arraylist {

	public static void main(String[] args) {
		 ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("mango");

	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("kiwi");
	        list2.add("banana");

	        list1.addAll(list2);
	        System.out.println(list1);
		
	

	}

}
