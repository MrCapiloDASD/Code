import java.util.Random;
import java.util.Scanner;

    public class NumbersGuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int targetNumber = random.nextInt(100) + 1;
            int guess = 0;
            int tries = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("Can you guess what it is?");

            while (guess != targetNumber) {
                System.out.print("\nEnter your guess: ");

                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    tries++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                    } else if (guess < targetNumber) {
                        System.out.println("Too low! Try a higher number.");
                    } else if (guess > targetNumber) {
                        System.out.println("Too high! Try a lower number.");
                    } else {
                        System.out.println("\n🎉 Congratulations! You guessed the number!");
                        System.out.println("It took you " + tries + (tries == 1 ? " try." : " tries."));
                    }
                } else {
                    System.out.println("That's not a valid number. Please try again.");
                    scanner.next(); // clear invalid input
                }
            }

            scanner.close();
        }
    }
