package Array_list;
import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("kiwi");
		list.add("banana");

        String searchElement = "mango";
        if (list.contains(searchElement)) {
            System.out.println( " found at index: " + list.indexOf(searchElement));
        } else {
            System.out.println( " not found");
        }

	}

}
