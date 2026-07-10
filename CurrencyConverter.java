import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Currency Converter ");

        System.out.println("Select Base Currency:");
        System.out.println("1. PKR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        int base = sc.nextInt();

        System.out.println("\nSelect Target Currency:");
        System.out.println("1. PKR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        int target = sc.nextInt();

        System.out.print("\nEnter Amount: ");
        double amount = sc.nextDouble();

        double result = amount;

        if (base == 2) {
            amount = amount * 280; 
        } else if (base == 3) {
            amount = amount * 320; 
        }

        if (target == 1) {
            result = amount;
        } else if (target == 2) {
            result = amount / 280;
        } else if (target == 3) {
            result = amount / 320;
        }

        System.out.println("\n Result ");
        System.out.printf("Converted Amount: %.2f\n", result);

        sc.close();
    }
}