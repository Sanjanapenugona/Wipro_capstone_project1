package Assesement_day5;
interface SumCalculator {
    int sum(int a, int b);
}

public class Sum_Calculator {

	public static void main(String[] args) {
		  SumCalculator add = (a, b) -> a + b;
	        int result = add.sum(5, 10);
	        System.out.println("Sum: " + result);
		

	}

}
