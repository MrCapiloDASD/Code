import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Get the item price from the user
        double itemPrice = getItemPrice(scanner);

        // 2. Get the amount tendered from the user
        int amountTendered = getAmountTendered(scanner, itemPrice);


        // 3. Calculate total change (work in cents to avoid
        //    floating-point rounding errors)

        int itemCents = (int) Math.round(itemPrice * 100);
        int tenderedCents = amountTendered * 100;
        int changeCents = tenderedCents - itemCents;

        // 4. Break change into coins (greedy algorithm)

        int quarters = changeCents / 25;
        changeCents = changeCents % 25;

        int dimes = changeCents / 10;
        changeCents = changeCents % 10;

        int nickels = changeCents / 5;


        // 5. Format values for display
        double totalChange = (quarters * 25 + dimes * 10 + nickels * 5) / 100.0;

        // 6. Display results
        System.out.println();
        System.out.printf("Change received on your %.2f item from $ %.2f should be $ %.2f%n",
                itemPrice, (double) amountTendered, totalChange);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes:    " + dimes);
        System.out.println("Nickels:  " + nickels);

        scanner.close();
    }
// Helper method: prompt for and validate the item price

    public static double getItemPrice(Scanner scanner) {

        double price = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter the item price (between $0.25 and $2.00): $");

            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                int cents = (int) Math.round(price * 100);

                if (cents < 25 || cents > 200) {
                    System.out.println("  Error: Price must be between $0.25 and $2.00. Try again.");
                } else if (cents % 5 != 0) {
                    System.out.println("  Error: Price must be in $0.05 increments. Try again.");
                } else {
                    valid = true;
                }
            } else {
                System.out.println("  Error: Please enter a numeric value. Try again.");
                scanner.next(); // discard bad token
            }
        }

        return price;
    }

    // Helper method: prompt for and validate the amount tendered

    public static int getAmountTendered(Scanner scanner, double itemPrice) {

        int dollars = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter the number of dollar bills tendered: $");

            if (scanner.hasNextInt()) {
                dollars = scanner.nextInt();

                if (dollars < 1) {
                    System.out.println("  Error: You must tender at least $1.00. Try again.");
                } else if (dollars * 100 <= (int) Math.round(itemPrice * 100)) {
                    System.out.printf("  Error: Amount tendered must be more than $%.2f. Try again.%n",
                            itemPrice);
                } else {
                    valid = true;
                }
            } else {
                System.out.println("  Error: Please enter a whole dollar amount (e.g. 1, 2, 3). Try again.");
                scanner.next(); // discard bad token
            }
        }

        return dollars;
    }
}

