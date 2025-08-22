package Assesement_day5;
interface Polygon {
    double getArea();

    default double getPerimeter(int...sides) {
        double perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

   
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return Polygon.super.getPerimeter((int) length, (int) width, (int) length, (int) width);
    }
}


public class interfaces {

	public static void main(String[] args) {
		  Rectangle rectangle = new Rectangle(4, 5);
	        System.out.println("Area: " + rectangle.getArea());
	        System.out.println("Perimeter: " + rectangle.getPerimeter());
	        
	}

}
