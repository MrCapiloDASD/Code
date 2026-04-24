public class MovieTicketPrice {

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
        // Test cases
        System.out.println("Child on weekend: $" + calculateTicketPrice(10, true));
        System.out.println("Adult on weekend: $" + calculateTicketPrice(25, true));
        System.out.println("Adult on weekday: $" + calculateTicketPrice(25, false));
        System.out.println("Senior on weekend: $" + calculateTicketPrice(70, false));
    }
}
