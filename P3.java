import java.util.Scanner;
import java.lang.Math;

public class P3
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		long   n = input.nextLong();
		long g = 0;
		
		for(int i = 2; i<=Math.sqrt(n); i++)
		{	
			while(n%i==0)
			{
				//System.out.println(i);
				n = n/i;
				
			}
			
			
		}
		if(n>2)
		{
			//System.out.println(n);
				if(n>g)
				{
					g = n;
				}
		}
		System.out.println(g);
			
	}
}
