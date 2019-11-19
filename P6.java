import java.util.Scanner;
import java.lang.Math;

class Main
{
	int sum_of_squares(int n)
	{
		int a,sum = 0;
		for(int i=1; i<=n; i++)
		{
			a=i*i;
			sum += a;
		}
		System.out.println("The sum of squares of "+n+" numbers is "+sum);
		return sum;
	}

	int squares_of_sum(int n)
	{
		int a,sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum += i;
		}
		a = sum*sum;
		System.out.println("The square of sum of "+n+" numbers is "+a);
		return a;
	}

	void difference(int a, int b)
	{
		int diff = b-a;
		System.out.println("The difference between them is "+diff);
	}
} 

public class P6
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Main m = new Main();
		int a,b;
		a=m.sum_of_squares(n);
		b=m.squares_of_sum(n);
		m.difference(a,b);
	}
}
