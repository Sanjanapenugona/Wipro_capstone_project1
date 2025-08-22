package Assesement_day5;
interface Convert {
    String convert(String str);
}

public class uppercase_lowercase {

	public static void main(String[] args) {
		 Convert toUpper = str -> str.toUpperCase();
	        System.out.println(toUpper.convert("how are you"));

	}

}
