package Assesement_day5;

public class BackwardSequence {
	 private String str;

	    public BackwardSequence(String str) {
	        this.str = new StringBuilder(str).reverse().toString();
	    }

	    public String getSequence() {
	        return str;
	    }

	    public static void main(String[] args) {
	        BackwardSequence seq = new BackwardSequence("My name is sanjana");
	        System.out.println(seq.getSequence());
	}

}
