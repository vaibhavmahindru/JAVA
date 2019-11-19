import java.util.Scanner;
public class PhysicalAddress{

public static void main(String[] args){

	System.out.println("Enter the page no and offset");
	Scanner input = new Scanner(System.in);
	int t=0, choice;
	do{	int p = input.nextInt();
		int o = input.nextInt();
		if(p==0)
		t=5;
		
		else if(p==1)
		t=6;
		
		else if(p==2)
		t=1;
		
		else if(p==3)
		t=2;
		
		else
		System.out.println("invalid page no.");

		int add = t*4 + o;
		System.out.println(add);
		System.out.println("enter 1 to continue.");
		choice = input.nextInt();
	}while(choice==1);
}
}
