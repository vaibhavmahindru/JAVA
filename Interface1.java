import java.util.*;

interface test{

	void square(int n);
}


class arithmetic implements test{


	public void square(int n){

		System.out.println((n*n));	

	}

}

class ToTestInt{

	public static void main(String[] args){


	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	arithmetic o = new arithmetic();
	o.square(n);
}
}
