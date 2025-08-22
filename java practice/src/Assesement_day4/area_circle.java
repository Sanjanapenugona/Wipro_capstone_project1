package Assesement_day4;
interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    abstract double area();
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class area_circle {

	public static void main(String[] args) {
		Circle circle = new Circle(3);
        System.out.println("Circle area: " + circle.area());
        circle.draw();

	}

}
