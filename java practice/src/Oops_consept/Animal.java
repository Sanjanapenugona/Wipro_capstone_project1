package Oops_consept;
class Animals
{
	
void eat(String eats)
{
	System.out.println("Eats="+eats);
}
void sound(String sd)
{
	System.out.println("Sound="+sd);
}
}
class D_animals extends Animals
{
void lives(String live)
{
	System.out.println("Lives in the"+live);
}

}

public class Animal {
	
	public static void main(String[] args) {
		D_animals dog=new D_animals();
		dog.eat("canin");
		dog.sound("Barking");
		
		
	}
		

	

}
