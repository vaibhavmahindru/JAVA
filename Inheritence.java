import java.util.Scanner;//program to show that private member of a super class cannot be accessed from derived classes
class Animal
{
	private void eat()
	{
		System.out.println("Eating");
	}

}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}

}
public class Inheritence
{
	public static void main(String [] args)
	{
		Dog d = new Dog();
		d.eat();
		d.bark();
	}		
}
