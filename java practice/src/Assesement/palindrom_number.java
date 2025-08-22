package Assesement;

public class palindrom_number {

	public static void main(String[] args) {
		 int num = 12321;
	        int reversedNum = 0;
	        int originalNum = num;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        if (originalNum == reversedNum) {
	            System.out.println( " palindrome number");
	        } else {
	            System.out.println(" not a palindrome number");
	        }
	}
	        
}
