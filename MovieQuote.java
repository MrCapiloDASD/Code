import java.util.Scanner;

public class MovieQuote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite movie quote?");
        String quote = scanner.nextLine();

        System.out.println("\nYour favorite movie quote is:");
        System.out.println("\"" + quote + "\"");

        scanner.close();
    }
}