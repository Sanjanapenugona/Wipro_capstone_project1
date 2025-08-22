package Array_list;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_array {

	public static void main(String[] args) {
		   ArrayList<String> list = new ArrayList<>();
	
		   list.add("Apple");
	        list.add("mango");
	        list.add("kiwi");

	        String[] array = list.toArray(new String[0]);
	    
	            System.out.println(Arrays.toString(array));
	        }

	}

