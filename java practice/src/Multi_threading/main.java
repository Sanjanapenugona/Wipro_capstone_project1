package Multi_threading;
class MyThread extends Thread {
    boolean running = true;
    public void stopThread() {
        running = false;
    }
    public void run() {
        int i = 0;
        System.out.println("Thread started.");
        while (running) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
            i++;
            if (i == 3) stopThread();
        }
        System.out.println("Thread is stopping.");
           
        }
    }


public class main {

	public static void main(String[] args) {
		 MyThread t = new MyThread();
	        t.start();
	       
		
	}

}
