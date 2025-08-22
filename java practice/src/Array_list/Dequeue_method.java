package Array_list;
import java.util.*;

public class Dequeue_method {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String> ();
		q.add("Apple");
		q.add("Mango");
		q.add("Banana");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("CusturdApple");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}

}
