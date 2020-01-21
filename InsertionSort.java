import java.util.*;

public class InsertionSort{
	
	void sort(int arr[]){

		for(int i=0; i< arr.length; i++){

			int temp = arr[i];
			int j = i - 1; 
  
            		while (j >= 0 && arr[j] > temp) { 
                		arr[j + 1] = arr[j]; 
                		j = j - 1; 
            		} 
            		arr[j + 1] = temp;


		}

		System.out.println("Your array is sorted");
	}


	void display(int arr[]){

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String [] args){
		long startTime = System.currentTimeMillis();
		int arr[];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements to be in your array");
		int n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter the elements ");
		for(int i=0; i<arr.length; i++){
			arr[i] = in.nextInt();
		}
		Main o = new Main();
		o.sort(arr);
		o.display(arr);
		
	}
}

