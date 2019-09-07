import java.util.Scanner;
class Main
{
	void result(int len)
	{	
		Scanner input = new Scanner(System.in);
		int[] Arr = new int[len];
		for(int i=0;i<len;i++)	
		{	Arr[i] = input.nextInt();}

		for(int j=len-1; j>=0; j--)
			{System.out.print(Arr[j]);
			System.out.print("  ");}

	}



}
public class Array
{
	public static void main(String args[])
	{	
		int len;
		System.out.println("Enter the length of the array");
		Scanner input = new Scanner(System.in);
		len = input.nextInt();
		Main f = new Main();
		f.result(len);
	}

}

