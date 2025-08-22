package Assessment_day7;

public class call_by_value {
	public static void changeValue(int x) {
		x= 5;
	}

	public static void main(String[] args) {
		int num=6;
		System.out.println("Before method call=" +num);
		changeValue(num);
		System.out.println("After method call=" + num);
	
	}

}
