import java.util.Scanner;

public class Loops
 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int N = scanner.nextInt();
        scanner.close();
        for(int i = 1;i<=10;i++)
        {
            int j = N*i;
            System.out.println(N+" x "+i+" = "+j);
        }
    }
}
