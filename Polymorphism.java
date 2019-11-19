/*Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.*/


import java.util.Scanner;
import java.lang.*;


class trunkcall
{
	void charges()
	{
		System.out.println("calling");
	}
}


class ordinary extends trunkcall
{
	void charges()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the time duration of the call in minutes");
			float a = input.nextFloat();
			double charge = 0.5 * a;
			System.out.println(charge);
		}
}

class urgent extends trunkcall
{
	void charges()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the time duration of the call in minutes");
			float a = input.nextFloat();
			double charge = 1.1 * a;
			System.out.println(charge);
		}
}

class lightning extends trunkcall
{
	void charges()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the time duration of the call in minutes");
			float a = input.nextFloat();
			double charge = 2 * a;
			System.out.println(charge);
		}
}

public class Polymorphism
{
public static void main(String [] args)
{
	trunkcall t;
	System.out.println("Choose the type of call\n1. Ordinary Call\n2. Urgent Call\n3. Lightning call");
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	switch(x)
	{
		case 1: t = new ordinary();
			t.charges();
			break;
		
		case 2: t = new urgent();
			t.charges();
			break;

		case 3: t = new lightning();
			t.charges();
			break;

		default: System.out.println("Invalid Choice");
			System.exit(0);
	}
}
}
