package Assessement_day8;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Tokyo");
        cities.add("London"); // Duplicate city

        System.out.println("Cities: " + cities);

        cities.remove("Rome");
        System.out.println("After removing Rome: " + cities);

        System.out.println("Does cities contain Paris? " + cities.contains("Paris"));

        cities.clear();
        System.out.println("After clearing: " + cities);
        System.out.println("Is cities empty? " + cities.isEmpty());
	}

}
