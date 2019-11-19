import java.util.Scanner;
public class P1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//int n = input.nextInt();
		int n = 1000;		
		int sum=0;
		for(int i=0; i<n; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
   				sum = sum + i;
				
			}
		}	
		System.out.println(sum);

	}

	
}
