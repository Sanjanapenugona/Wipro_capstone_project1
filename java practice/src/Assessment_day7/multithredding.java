package Assessment_day7;
class MyThread extends Thread {
  
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class multithredding {

	public static void main(String[] args) {
		  MyThread thread = new MyThread();
	        thread.start();
		

	}

}
