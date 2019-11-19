import java.util.*;
interface student{

	void div(int a);
	void mod(int b);
}

class main implements student{
	
	String name;
	int div,mod;
	void name(String n)
	{
		name = n;
	}	

	public void div(int a)
	{
		div = a;
	}
	
	public void mod(int b)
	{
		mod = b;
	}

	void disp()
	{
		System.out.println("Name "+name);
		System.out.println("Class "+div);
		System.out.println("Roll_no "+mod);
	}
}

public class Interface4{

	public static void main(String [] args){

		main m = new main();
		m.name("Vaibhav");
		m.div(12);
		m.mod(1);
		m.disp();
}
}
