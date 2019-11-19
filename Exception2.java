// Exception by divide by zero
import java.util.*;

public class Exception2{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();//enter two numbers
		int b = in.nextInt();
		try{
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){System.out.println(e);}
}
}
