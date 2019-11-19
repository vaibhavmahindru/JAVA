import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i = in.nextInt();
        int j = in.nextInt();
        S = S.substring(i , j);
        System.out.println(S);
    }
}


