package Assessement_day8;
import java.util.ArrayList;

public class Search_element {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList <>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(2);
		int num=10;
		if(list.contains(num)) {
			System.out.println( " in the list");
		}
		else
		{
			System.out.println("not in the list");
		}

	}

}
