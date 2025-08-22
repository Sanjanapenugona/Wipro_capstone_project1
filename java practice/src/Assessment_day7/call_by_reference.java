package Assessment_day7;
class Box {
	int length;
}

public class call_by_reference {
	public static void change(Box b) {
		b.length = 20;
	}

	public static void main(String[] args) {
		Box b=new Box();
		b.length=15;
		System.out.println("Before=" +b.length);
		change(b);
		System.out.println("After=" +b.length);
		
		
	}

}
