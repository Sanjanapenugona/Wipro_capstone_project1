package Assesement_day6;
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddChecker  {
    // Method to check if a number is odd
    public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        } else {
            System.out.println(n + " is even.");
        }
    }
    public static void main(String[] args) {
        // Test with different values
        int[] numbers = {10, 23, 44, 57, 92};

        for (int number : numbers) {
            try {
                checkOdd(number);
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
	