package Assesement_day3;

public class String_java {

	public static void main(String[] args) {
		String str = "java";
        boolean startsWithJ = str.toLowerCase().startsWith("j");
        boolean endsWithA = str.toLowerCase().endsWith("a");
        if (startsWithJ && endsWithA) {
            System.out.println(str + " starts with 'j' and ends with 'a'");
        } else {
            System.out.println(str + " does not meet the criteria");
        }

	}

}
