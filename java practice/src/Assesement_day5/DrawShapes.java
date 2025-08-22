package Assesement_day5;
interface Shape {
	void draw();
}
class Circle implements Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
	class Square implements Shape {
		public void draw() {
			System.out.println("Square");
		}
}

public class DrawShapes {

	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		c.draw();
		s.draw();
	}
		
}
	


