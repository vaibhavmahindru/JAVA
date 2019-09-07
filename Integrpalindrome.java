import java.util.Scanner;
class Palindrome
{
	int check(int n)
	{
		int a,b=0;
		a=n;
		while(a!=0)
		{
		    b=b*10;
		    b=b+a%10;
		    a=a/10;
		}
		//display(b,n);
		return b;
	}
	    void display(int b,int n)
	{
		if(b==n)
		System.out.println("Number is palindrome");
		
		else
		System.out.println("Number is not palindrome");
		
	}
}



public class Integrpalindrome
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Palindrome a = new Palindrome();
		int f = a.check(n);
		a.display(f,n);
	}
}

