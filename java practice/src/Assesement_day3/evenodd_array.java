package Assesement_day3;

public class evenodd_array {

	public static void main(String[] args) {
		int[] array = {1, 22, 7, 5, 16};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
		
	}

}
