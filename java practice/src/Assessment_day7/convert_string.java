package Assessment_day7;

public class convert_string {

	public static void main(String[] args) {
		   int num = 123;
	        double decimal = 45.67;
	        boolean flag = true;
	        char ch = 'A';

	        // Using valueOf() method of respective wrapper classes
	        String strNum = Integer.valueOf(num).toString();
	        String strDecimal = Double.valueOf(decimal).toString();
	        String strFlag = Boolean.valueOf(flag).toString();
	        String strChar = Character.valueOf(ch).toString();

	        System.out.println("Converted int to String: " + strNum);
	        System.out.println("Converted double to String: " + strDecimal);
	        System.out.println("Converted boolean to String: " + strFlag);
	        System.out.println("Converted char to String: " + strChar);
	    }
	}


	