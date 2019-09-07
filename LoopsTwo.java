import java.util.Scanner;
import java.lang.Math;

public class LoopsTwo
{


	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int q = input.nextInt();
		for(int i=0;i<q;i++)
		{
			int a = input.nextInt();
           		int b = input.nextInt();
            		int n = input.nextInt();
			int t = 0;
			for(int j=0;j<n;j++)
			{	

				int c = a;
				c+= Math.pow(2,j)*b;
				System.out.printf("%d ",c);
			}
			System.out.println(" ");		
		}
		
	}
	

}
