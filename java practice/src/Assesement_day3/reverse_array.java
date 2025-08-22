package Assesement_day3;

public class reverse_array {

	public static void main(String[] args) {
		int[] array = {2, 4, 6, 8};
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
	}

}
