import java.util.*;

class Super_class
{
	int num = 20;
	public void display()
	{System.out.println("super class");}
}

class Sub_class extends Super_class
{
	int num = 10;
	
	public void display()
	{System.out.println("sub class");}

	public void mymethod()
	{
		display();
		System.out.println("value in sub class"+num);
		super.display();
		System.out.println("value in super class"+super.num);
	}
}

public class Super
{
	public static void main(String[] args)
	{
		Sub_class ob = new Sub_class();
		ob.mymethod();
	}

}
