package Assesement_day3;

public class second_heighest {

	public static void main(String[] args) {
		 int[] array = {10, 20, 50, 40, 5};
	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	        for (int num : array) {
	            if (num > max) {
	                secondMax = max;
	                max = num;
	            } else if (num > secondMax && num != max) {
	                secondMax = num;
	            }
	        }
	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("No second highest element found");
	        } else {
	            System.out.println("Second highest element: " + secondMax);
	        }
	}

}
