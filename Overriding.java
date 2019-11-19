import java.util.Scanner;
class Ccvt
{
	void gen()
	{
		System.out.println("Good Class");
	}
}

class GG extends Ccvt
{
	void gen()
	{
		System.out.println("Good Students");
	}
}

public class Overriding
{
	public static void main(String [] args)
	{
		GG g = new GG();
		g.gen();
	}
}
