package Assesement;

public class Countof_digit {

	public static void main(String[] args) {
		 int num = 45789433;
	        int count = 0;
	        while (num != 0) {
	            num /= 10;
	            count++;
	        }
	        System.out.println(count);
	

	}

}
