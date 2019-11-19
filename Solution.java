import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
 {
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++)
         {
        
            for (int j = 0; j < 6; j++) 
            {
                a[i][j] = scanner.nextInt();
            }
        }

        

        for (int i = 0; i < 6; i++)
         {
        
            for (int j = 0; j < 6; j++) 
            {
                int maxSum = 0;
                int sum = a[i][j]
                            + a[i][j+1]
                            + a[i][j+2]
                            + a[i+1][j+1]
                            + a[i+2][j]
                            + a[i+2][j+1]
                            + a[i+2][j+2];
                        if (sum > maxSum) 
                        {maxSum = sum;}
            }
        }
        System.out.println(maxSum);
    }
}
