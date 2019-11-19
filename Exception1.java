//ArrayIndexOutOfBoundsExeption
import java.util.*;

public class Exception1{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] arr = new String[10];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		arr[3] = "d";		
		arr[4] = "e";
		arr[5] = "f";
		arr[6] = "g";
		arr[7] = "h";
		arr[8] = "i";
		arr[9] = "j";
		System.out.println("enter the roll no. 0-9");
		int n = in.nextInt();
		try{
			
			System.out.println(arr[n]);
		}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

}
}
