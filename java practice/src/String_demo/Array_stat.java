package String_demo;

public class Array_stat {

	public static void main(String[] args) {
		float[] per= {20.2f,22.3f,40.6f,10.9f,25.7f,36.97f,7.03f};
		float min=per[0];
		for(int i=0;i<per.length;i++)
		{
			if(per[i]<min)
			{
				min=per[i];
			}
		}
		System.out.println("lowest percentage="+min);

		
	}

}
