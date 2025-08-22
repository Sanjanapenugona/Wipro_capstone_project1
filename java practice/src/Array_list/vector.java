package Array_list;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		 Vector<String> V=new Vector<> ();
		 V.add("apple");
		 V.add("mango");
		 V.add("kiwi"); 
	     System.out.println("Vector=" +V);
	     
	     LinkedList<String> list=new LinkedList<> ();
	     list.add("banana");
	     list.add("grapes");
	     list.add("dates");
	     System.out.println("LinkedList=" +list);
	     
	     ArrayList<String> list2 =new ArrayList<> ();
	     list2.add("cherry");
	     list2.add("papaya");
	     list2.add("plum");
	     System.out.println("ArrayList=" +list2);
	     
	     System.out.println("Vector size=" +V.size());
	     System.out.println("LinkedList contains grapes=" +list.contains("grapes"));
	     System.out.println("ArrayList index of papaya=" +list2.indexOf("papaya"));
	     V.remove("apple");
	     list.remove("grapes");
	

	}

}
