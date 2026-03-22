import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What Number Multiplication Table would you like to see ? : " )
        int t = sc.nextInt();

        for (int i=1; i<=10;i++ )
        {
           int m=t*i;
            System.out.println(t +" * "+i +" = "+m);
        }
    }
}
