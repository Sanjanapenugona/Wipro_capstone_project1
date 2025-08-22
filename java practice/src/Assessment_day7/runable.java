package Assessment_day7;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}

public class runable {

	public static void main(String[] args) {
		 Thread thread = new Thread(new MyRunnable());
	        thread.start();

	}

}
