package Assesement_day6;
import java.util.Scanner;

public class Temperature_celsius {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		double celsius=Scanner.nextDouble();
		double fahrenheit=(celsius*9/5)+32;
		System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

	
	}

}
