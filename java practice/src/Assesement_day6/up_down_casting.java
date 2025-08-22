package Assesement_day6;
class Animal
{
	void makesound()
	{
		System.out.println("make sound");
	}
}
class Dog extends Animal
{
	void makesound()
	{
		System.out.println(" bhow");
	}
}

public class up_down_casting {

	public static void main(String[] args) {
		Dog d=new Dog();
		Animal a=d;
		a.makesound();

	}

}
