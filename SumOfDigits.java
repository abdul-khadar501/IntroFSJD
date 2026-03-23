public class SumOfDigits
{
    public static void main(String[] args)
    {
        // GOAL
        //  Given an integer (e.g. 12345), calculate the sum of its digits. Do not use String conversion — use the modulo operator in a loop.

        //     STARTER CODE
        int number = 12345;
        int sum = 0;
        // Extract digits with % 10 and / 10

        while (number > 0)
        {
            int i;
            i=number%10;
            sum = sum + i;
            number=number/10;
        }
        System.out.println(sum);
    }
}
