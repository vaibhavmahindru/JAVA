import java.util.Scanner;
import java.lang.Math;

public class P10
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long g = 0;
		long sum = 0;
		
		for(long i=2; i<n; i++ )
		{
			for(g=2; g<i; g++)
			{
				if(i%g==0)
				break;
			}
			if(g==i)
			{
				sum += i;
			}
		}
		
		System.out.println(sum);
			
	}
}
