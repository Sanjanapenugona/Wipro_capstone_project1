package Assesement_day6;

public class Nullpoint_exception {
	public static void main(String[] args) {
	try {
	
		String str = null;
		System.out.println(str.length());
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");	
		}
	try {
		Object obj=5 ;
		String s = (String) obj;
	}
	catch (ClassCastException e) {
		System.out.println("ClassCastException");
	}
	try {
		Class.forName("Nodatafound");
	}
	catch (ClassNotFoundException e) {
		System.out.println("ClassNotFoundException");
	}
	try {
	
	String s="123";
	}
	catch (IllegalArgumentException e ) {
		System.out.println("IlligelArgumentException");
	}
	try {
		String str = "abc";
		int num = Integer.parseInt(str);
	}
	catch (NumberFormatException e) {
		System.out.println("NumberFormatException");
	}
	}
}
