import java.util.Scanner;

public class ScannerMovTicPrice {
        public static int calculateTicketPrice(int age, boolean isWeekend) {
            int ticketPrice = 0;

            // Check age category
            if (age <= 12) {
                // Child ticket
                ticketPrice = 8;
            } else if (age >= 65) {
                // Senior ticket
                ticketPrice = 10;
            } else {
                // Adult ticket - nested conditional for weekend/weekday
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

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Is it a weekend? (true/false): ");
            boolean isWeekend = scanner.nextBoolean();
            scanner.nextLine();

            int price = calculateTicketPrice(age, isWeekend);
            System.out.println("Your ticket price is: $" + price);

            scanner.close();
        }
    }


