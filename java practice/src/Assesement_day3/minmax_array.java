package Assesement_day3;

public class minmax_array {

	public static void main(String[] args) {
		int[] array = {10, 20, 3, 40, 0};
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

	}

}
