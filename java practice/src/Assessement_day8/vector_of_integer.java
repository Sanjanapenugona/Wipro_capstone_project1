package Assessement_day8;
import java.util.*;

public class vector_of_integer {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(2);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(10);
		System.out.println("befor insertion=" +v);
		v.add(3, 1);
		System.out.println("After insertion=" +v);
		v.remove(2);
		System.out.println(v);
		 Enumeration<Integer> enumeration = v.elements();
	        System.out.println("Elements:");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
		
		
	        }

	}

}
