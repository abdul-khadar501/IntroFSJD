import java.util.Scanner;

public class BMI_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight in kgs : ");
        float w = sc.nextInt();

        System.out.print("Enter Height in centimeters : ");
        float h = sc.nextInt();

        // Use a chain of if / else-if to check BMI ranges: <18.5, 18.5–24.9, 25–29.9, 30+
        // Take weight (kg) and height (cms) as user input. Calculate and display BMI (weight / height²).
        // Print the BMI category: underweight, normal, overweight, or obese.

        float heightInMeters = h / 100;               // converting cm → meters
        float BMI = w / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f%n", BMI);

        if (BMI < 18.5 )
        {
            System.out.println("You are in underweight category.");
        }

        else if (BMI < 25 )
        {
            System.out.println("You are in normal weight category.");
        }

        else if (BMI < 30)
        {
            System.out.println("You are in over-weight category.");
        }
        else
        {
            System.out.println("You're Obese, please take care of your health.");
        }
        sc.close();
    }
}
