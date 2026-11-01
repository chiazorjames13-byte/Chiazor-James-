import java.util.Scanner;

/**
 * AverageCalculator - reads three scores, then displays their sum and average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter the second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter the third score: ");
        double score3 = input.nextDouble();

        double sum = score1 + score2 + score3;
        double average = sum / 3;

        System.out.println("\n--- Results ---");
        System.out.println("Sum     : " + sum);
        System.out.printf("Average : %.2f%n", average);

        input.close();
    }
}
