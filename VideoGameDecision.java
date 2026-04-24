public class VideoGameDecision {
    public static void main(String[] args) {
        // Variables to represent the two conditions
        boolean homeworkDone = true;      // Change this to true or false to test
        boolean consoleAvailable = true;  // Change this to true or false to test

        System.out.println("=== Video Game Decision Maker ===");
        System.out.println("Homework done? " + homeworkDone);
        System.out.println("Console available? " + consoleAvailable);
        System.out.println();

        // OUTER CONDITION: Check if homework is done
        if (homeworkDone) {
            System.out.println("Great! Your homework is done.");

            // INNER (NESTED) CONDITION: Check if console is available
            if (consoleAvailable) {
                // Both conditions are true
                System.out.println("The console is available!");
                System.out.println("🎮 You can play your video game! Have fun!");
            } else {
                // Homework done, but console not available
                System.out.println("The console is being used by someone else.");
                System.out.println("⏳ You have to wait for your turn.");
            }

        } else {
            // Homework is not done
            System.out.println("❌ You must finish your homework first!");
            System.out.println("No gaming until homework is complete.");
        }

        System.out.println("\n=== End of Decision ===");
    }
}