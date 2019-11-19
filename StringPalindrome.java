import java.io.*;
import java.util.*;

public class StringPalindrome{

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
        String rs = "";
        int n = s.length();
        for(int i=n-1; i>=0; i--)
        {
            rs = rs + s.charAt(i);
        }
        if(s.equals(rs))
        System.out.print("Yes");

        else
        System.out.print("No");
        
        
    }
}




