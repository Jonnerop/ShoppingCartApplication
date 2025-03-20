import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select language: (1) English, (2) Svenska, (3) Suomi, (4) 日本語 ");
        int languageChoice = scanner.nextInt();
        scanner.nextLine();

        Locale locale;
        switch (languageChoice) {
            case 1: locale = new Locale("en", "US"); break;
            case 2: locale = new Locale("sv", "SE"); break;
            case 3: locale = new Locale("fi", "FI"); break;
            case 4: locale = new Locale("ja", "JP"); break;
            default: locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(messages.getString("enter_items"));
        int numItems = scanner.nextInt();
        scanner.nextLine();

        int[] quantities = new int[numItems];
        double[] prices = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println(messages.getString("enter_price") + " " + (i + 1) + ":");
            prices[i] = scanner.nextDouble();

            System.out.println(messages.getString("enter_quantity") + " " + (i + 1) + ":");
            quantities[i] = scanner.nextInt();
        }

        double totalCost = calculateTotalCost(quantities, prices);
        System.out.println(messages.getString("total_cost") + " " + totalCost);
    }

    public static double calculateTotalCost(int[] quantities, double[] prices) {
        double totalCost = 0;
        for (int i = 0; i < quantities.length; i++) {
            totalCost += quantities[i] * prices[i];
        }
        return totalCost;
    }
}