import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerMovieTicketPrice {
    public static int calculateTicketPrice(int age, boolean isWeekend) {
        int ticketPrice = 0;

        if (age <= 12) {
            ticketPrice = 8;
        } else if (age >= 65) {
            ticketPrice = 10;
        } else {
            if (isWeekend) {
                ticketPrice = 15;
            } else {
                ticketPrice = 12;
            }
        }
        return ticketPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Outer loop - keeps program running for new clients
            boolean validInput = false;

            while (!validInput) { // Inner loop - handles bad input
                try {
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Is it a weekend? (true/false): ");
                    boolean isWeekend = scanner.nextBoolean();
                    scanner.nextLine();

                    int price = calculateTicketPrice(age, isWeekend);
                    System.out.println("Your ticket price is: $" + price);

                    validInput = true;

                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input. Please try again.");
                    scanner.nextLine();
                }
            }

            // Ask if there is another client
            System.out.print("Process another client? (yes/no): ");
            String again = scanner.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                System.out.println("Goodbye!");
                break; // Exits the outer loop
            }
        }
        scanner.close();
    }
}
