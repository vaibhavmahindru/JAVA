import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args) 
	{
		int i,j=1;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        j=j*i;
	    }
		System.out.println(j);
	    
	}
}
