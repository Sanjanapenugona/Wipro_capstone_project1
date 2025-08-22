package Assesement_day5;
interface Printer {
    void print(String document);
}

class LaserPrinter implements Printer {
  
    public void print(String document) {
        System.out.println("LaserPrinter: Printing " + document);
    }
}

class InkjetPrinter implements Printer {

    public void print(String document) {
        System.out.println("InkjetPrinter: Printing " + document);
    }
}


public class doc {

	public static void main(String[] args) {
		  Printer p;

	        p = new LaserPrinter();
	        p.print("Doc 1");

	        p = new InkjetPrinter();
	        p.print("Doc 2");
	}

}
