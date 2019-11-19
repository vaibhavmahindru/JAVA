import java.util.*;


public class Exception3{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int a;
		try{
			a = in.nextInt();
			throw new NonNum("nonnumeric");
		}catch(ArithmeticException e){System.out.println(e);}
}
}
