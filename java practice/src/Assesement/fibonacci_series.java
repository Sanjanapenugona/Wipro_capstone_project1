package Assesement;

public class fibonacci_series {

	public static void main(String[] args) {
		int n=10;
		int a=0, b=1;
		for(int i=0; i<=n; i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c; 			
		}
	}

}
