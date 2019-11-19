import java.io.*;
class A
{
	//void m1() throws IOException
	//{
		
//	}
}

class B extends A
{
	//void m1() throws IOException
	//{
		
//	}
	/*void m1() throws FileNotFoundException
	{

	}*/	
	/*void m1() throws Exception 
	{
		
	}*/
}

class Sample
{
	public static void main(String [] s)
	{
		B b = new B();		
		b.m1();
		System.out.println("Good Program");
	}
}
