package Assessement_day8;
import java.util.ArrayList;
import java.util.Collections;
public class Reverse_list {

	public static void main(String[] args) {
		 ArrayList<Character> characters = new ArrayList<>();
	        characters.add('d');
	        characters.add('h');
	        characters.add('l');
	        characters.add('i');
	        characters.add('p');

	        System.out.println("Original list: " + characters);

	        Collections.reverse(characters);

	        System.out.println("Reversed list: " + characters);

	}

}
