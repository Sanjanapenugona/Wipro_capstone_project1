package Assesement_day6;
enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public double eval(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
public class operation {

	public static void main(String[] args) {
		  double a = 10;
	        double b = 2;

	        System.out.println(a + " + " + b + " = " + Operation.PLUS.eval(a, b));
	        System.out.println(a + " - " + b + " = " + Operation.MINUS.eval(a, b));
	        System.out.println(a + " * " + b + " = " + Operation.TIMES.eval(a, b));
	        System.out.println(a + " / " + b + " = " + Operation.DIVIDE.eval(a, b));
	}

}
