import java.util.Scanner;

/**
 * A simple program that collects user information using the Scanner class
 * and prints a formatted summary of that information.
 */
public class UserInfo {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // --- Collect user's name ---
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // nextLine() reads the full line including spaces

        // --- Collect user's age ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();     // nextInt() reads a whole number
        scanner.nextLine();              // Consume the leftover newline character after the number

        // --- Collect a fun fact about the user ---
        System.out.print("Tell me one interesting fact about yourself: ");
        String fact = scanner.nextLine();

        // Close the scanner now that we're done reading input
        scanner.close();

        // --- Print a formatted summary of the collected information ---
        System.out.println("\n--- Here's what you told me ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Fact : " + fact);
        System.out.println("--------------------------------");
        System.out.println("Thank you for sharing!");
    }
}
