package Assesement_day6;

public class Convert_int_string {
	public static void main(String[] args) {
		int x = 5;
		x += 4.5;
		System.out.println("integer=" +x);
		String str = String.valueOf(x);
		System.out.println("String=" + str);
		int parseint = Integer.parseInt(str);
		System.out.println("Parseint=" + parseint);	

	}

}
