package Assessment_day7;

public class multi {

	public static void main(String[] args) {
		  try {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println(i);
	                Thread.sleep(1000); // Pause for 1 second
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}