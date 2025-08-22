package Assesement_day5;
interface addition{
	int addition(int a,int b);
}
public class sum_of_twodigits {

	public static void main(String[] args) {
		addition sum=(a, b) -> a +b;
		System.out.println("Sum=" +sum.addition(8, 7));

	}

}
