import java.util.Scanner;
import java.lang.String;
import java.util.Scanner;

public class Temp_ConverterC2F {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print(" Print Temperature in Celsius : ");
       double celsius = sc.nextDouble();

       double f;
       f = (celsius * 9)/5 + 32 ;

       System.out.print(" Temperature in Fahrenheit : " +f);
   }
}
