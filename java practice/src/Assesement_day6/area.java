package Assesement_day6;
enum Shape {
    CIRCLE {
        public double area(double... params) {
            return 3.14 * params[0] * params[0];
        }
    },
    SQUARE {
        public double area(double... params) {
            return params[0] * params[0];
        }
    },
    RECTANGLE {
        public double area(double... params) {
            return params[0] * params[1];
        }
    };

    public abstract double area(double... params);
}

public class area {

	public static void main(String[] args) {
		 System.out.println("Circle area: " + Shape.CIRCLE.area(5));
	        System.out.println("Square area: " + Shape.SQUARE.area(4));
	        System.out.println("Rectangle area: " + Shape.RECTANGLE.area(3, 4));
	}

}
