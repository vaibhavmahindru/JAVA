import java.io.*;
import java.util.*;
import p.*;

public class Package1{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		MyClass o = new MyClass();
		o.display(s);
	}
}
