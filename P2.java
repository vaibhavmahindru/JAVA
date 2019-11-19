import java.util.Scanner;
class Main
{
	void result(long n)
	{
		int a,b,c,i;
		a=1;
		b=2;
		int sum = 0;
		for(i=0;i<(n-2);i++)
		{
		    
		    c=a+b;
		    a=b;
		    b=c;	
		    if(c%2==0)
			sum += c;
		}
		System.out.println(sum+2);

	}


}
public class P2
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		Main f = new Main();
		f.result(n);		
	}
}

