public class numberGuesser {
    public static void main(String[] args) {
        // Set the secret number
        int secretNumber = 66;  // Change this to any number you want

        System.out.println("=== Number Guesser Simulator ===");
        System.out.println("Secret number: " + secretNumber);
        System.out.println("The computer will try to guess the number...\n");

        // Your code here:
        // 1. Initialize variables for current guess and guess count
        int currentGuess = 34;
        int guessCount = 8;

        // 2. Use a while loop to keep guessing
        while (currentGuess != secretNumber) {
            guessCount++;

            // 3. Display each guess and feedback
            System.out.print("Guess #" + guessCount + ": " + currentGuess);

            if (currentGuess < secretNumber) {
                System.out.println(" - Too low!");
            } else {
                System.out.println(" - Too high!");
            }

            // 4. Increment the guess
            currentGuess++;
        }

        // 5. Count the number of guesses (final correct guess)
        guessCount++;
        System.out.println("Guess #" + guessCount + ": " + currentGuess + " - Correct! 🎉");

        // Display final result
        System.out.println("\nThe computer found the number in " + guessCount + " guesses!");
    }
}