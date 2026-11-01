import java.util.Scanner;

/**
 * ItemCost - reads an item name, unit price and quantity,
 * then calculates the subtotal, VAT (7.5%) and total cost.
 */
public class ItemCost {
    public static void main(String[] args) {
        final double VAT_RATE = 0.075;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = unitPrice * quantity;
        double vat = subtotal * VAT_RATE;
        double total = subtotal + vat;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item       : " + itemName);
        System.out.printf("Unit price : %.2f%n", unitPrice);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Subtotal   : %.2f%n", subtotal);
        System.out.printf("VAT (7.5%%) : %.2f%n", vat);
        System.out.printf("Total      : %.2f%n", total);

        input.close();
    }
}
