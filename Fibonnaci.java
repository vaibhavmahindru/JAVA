import java.util.Scanner;
class Main
{
	void result(int n)
	{
		int a,b,c,i;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<(n-2);i++)
		{
		    System.out.println(c);
		    a=b;
		    b=a+b;
		}

	}


}
public class Fibonnaci
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Main f = new Main();
		f.result(n);		
	}
}

