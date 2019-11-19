
import java.util.*;
import java.io.*;
import java.lang.Math; 

class Loops2{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int sum = a;
            
            for(int j=0;j<n;j++){
                sum+=((Math.pow(2,j))*b);
               System.out.print(sum+" ");
            }
            System.out.println();
           
        }

       
    }
}


