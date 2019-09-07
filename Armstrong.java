import java.util.Scanner;
class Main
{
	int result(int n)
	{
		int a,b=0;
		int temp=n;
		while(temp>0)
		{
		    a=temp%10;
		    b=b+a*a*a;
		    temp=temp/10;
		}
		
		return b;
	}
	void display(int b, int n)
	{
		if(b==n)
		System.out.println("Number is an armstrong number");
		
		else
		System.out.println("Number is not an armstrong number");
	
	}


}
public class Armstrong
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Main f = new Main();
		int ff = f.result(n);
		f.display(ff,n);
		
	}
}

