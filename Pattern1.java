import java.util.Scanner;
class Some
{
void display(int n)
	{
	  int i,j;
	    for(i=1;i<=n;i++)
	    {
		
	        for(j=1;j<=i;j++)
	      {
	          System.out.print("*");
		
		
	      }
		System.out.println(" ");	

	     	
	    }
	}
}
public class class Pattern1
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Some a = new Some();
		a.display(n);
		
	    
	}
}

