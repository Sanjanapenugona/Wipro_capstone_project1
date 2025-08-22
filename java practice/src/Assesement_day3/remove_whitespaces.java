package Assesement_day3;

public class remove_whitespaces {

	public static void main(String[] args) {
		String str="hello world";
		String result=str.replaceAll("\\s", "");
		 
	        System.out.println("Original String= " + str);
	        System.out.println("String without white spaces= " + result);
		

	}

}
