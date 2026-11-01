import java.util.Scanner;

/**
 * SimpleCalculator - reads two numbers and displays the result of
 * addition, subtraction, multiplication, division and remainder.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = input.nextDouble();

        System.out.print("Enter the second number: ");
        double b = input.nextDouble();

        System.out.println("\n--- Results ---");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " % " + b + " = " + (a % b));
        } else {
            System.out.println("Division and remainder are not possible: second number is zero.");
        }

        input.close();
    }
}
