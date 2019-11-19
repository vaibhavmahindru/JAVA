import java.util.Scanner;

class Factorial {
	int f;
    	int fact(int a) {
        int i, f = 1;

        for (i = 1; i <= a; i++) 
	{
            f = f * i;
        }
	
	return f;
    }
    void display(int f)
	{
		System.out.println(f);
	}
}
class Factorials
{
 public static void main(String args[])
 {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = input.nextInt();

        Factorial a = new Factorial();
        int f = a.fact(n);
	a.display(f);
    }
}



