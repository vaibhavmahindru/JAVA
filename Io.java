import java.util.Scanner;

public class  Io {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s =  StdIn.readLine();


        /*System.out.println("String: " + s);*/StdOut.println(s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


