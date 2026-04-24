import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Name (String)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // 2. Age (int)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // 3. Favorite Color (String)
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        // 4. GPA (double)
        System.out.print("Enter your GPA (e.g., 3.5): ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        // 5. Do you have a pet? (boolean)
        System.out.print("Do you have a pet? (true/false): ");
        boolean hasPet = scanner.nextBoolean();

        scanner.close();

        // Display collected information
        System.out.println("\n===== Your Profile =====");
        System.out.println("Name:        " + name);
        System.out.println("Age:         " + age);
        System.out.println("Fav Color:   " + favoriteColor);
        System.out.println("GPA:         " + gpa);
        System.out.println("Has a Pet:   " + hasPet);
        System.out.println("========================");
    }
}
