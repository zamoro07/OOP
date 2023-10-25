import java.util.Scanner;

public class ActivityThreeZamoro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double phpToDollarConversionRate = 56.00;

        double c1Price = 100.00;
        double c2Price = 150.00;
        double c3Price = 200.00;

        double r1Price = 35.00;
        double r2Price = 50.00;

        System.out.println("Menu:");
        System.out.println("C1 = Php " + c1Price);
        System.out.println("C2 = Php " + c2Price);
        System.out.println("C3 = Php " + c3Price);
        System.out.println("Add-ons:");
        System.out.println("R1 = Php " + r1Price);
        System.out.println("R2 = Php " + r2Price);

        // Initialize total price
        double totalPrice = 0.0;

        while (true) {
            // Accept user inputs
            System.out.print("Enter the order code or 'done' to finish: ");
            String orderCode = scanner.nextLine();

            if (orderCode.equals("done")) {
                break;
            }

            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Calculate total price for the current order
            double orderTotal = 0.0;

            switch (orderCode) {
                case "C1":
                    orderTotal = c1Price * quantity;
                    break;
                case "C2":
                    orderTotal = c2Price * quantity;
                    break;
                case "C3":
                    orderTotal = c3Price * quantity;
                    break;
                case "R1":
                    orderTotal = r1Price * quantity;
                    break;
                case "R2":
                    orderTotal = r2Price * quantity;
                    break;
                default:
                    System.out.println("Invalid order code.");
                    continue; // Skip to the next iteration
            }

            // Add the current order's total to the overall total
            totalPrice += orderTotal;
        }

        // Convert total price to Dollars
        double totalPriceInDollars = totalPrice / phpToDollarConversionRate;

        // Display total price, quantity, and order code
        System.out.println("Total Price (PHP): Php " + totalPrice);
        System.out.println("Total Price (USD): $" + totalPriceInDollars);

        scanner.close();
    }
}
