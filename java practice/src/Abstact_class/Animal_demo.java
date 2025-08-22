package Abstact_class;
abstract class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	abstract void sound();
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Sound=barking");
	}
}
class Tiger extends Animal
{
	void sound()
	{
		System.out.println("Sound=Roarr");
	}
}

public class Animal_demo {

	public static void main(String[] args) {
		Dog max=new Dog();
		max.eat();
		max.sound();
		Tiger tg=new Tiger();
		tg.eat();
		tg.sound();

		
	}

}
