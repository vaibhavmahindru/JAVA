/*
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int c = A.length() + B.length();
        System.out.println(c);
        c = 0;
        c = A.compareTo(B);
        if(c>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        A =  Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B=  Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.print((A +" "+ B));
    }
}




