import java.util.*;

interface A{

	void getname(String n);
	void display(String s);
}


class MyClass implements A
{

	public void getname(String n)
	{

		
		display(n);
	}

	public void display(String s)
	{

		System.out.println(s);
	}	


	public static void main(String [] args)
	{

		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		MyClass o = new MyClass();
		o.getname(n);		

	}
}
