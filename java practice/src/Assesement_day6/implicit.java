package Assesement_day6;

public class implicit {

	public static void main(String[] args) {
		 // Assign an int value
        int intValue = 10;

     
        double doubleValue = intValue;
        System.out.println("Int value: " + intValue);
        System.out.println("Double value: " + doubleValue);

   
        double doubleInput = 1234567890.123;

      
        int intCast = (int) doubleInput;
        System.out.println("Double value: " + doubleInput);
        System.out.println("Cast to int: " + intCast);

        short shortCast = (short) doubleInput;
        System.out.println("Cast to short: " + shortCast);

	}

}
