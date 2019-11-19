import java.util.Scanner;

public class Shape//square and rectangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();//length
		int b = input.nextInt();//breadth
		System.out.print(" ");
		for(int i=1; i<=l; i++)
		System.out.print("__");

		System.out.println(" ");

		for(int j=1; j<=b; j++)
		{
			System.out.print("|");
			for(int k=1; k<=l; k++)
			{
				if(j!=b)
				System.out.print("  ");

				else if(j==b)
				System.out.print("__");
			}
			System.out.println("|");
	
		}
		

		System.out.println(" ");
	}

}
