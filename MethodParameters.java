public class MethodParameters {

    // Custom method — void means no return value
    public static void printGreeting() {
        System.out.println("Hello from the printGreeting method! Mayhem has begun.");
    }

    // New method — takes two int parameters and prints their sum
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
    }

    // main method — program entry point
    public static void main(String[] args) {
        // Calling (invoking) our custom method
        printGreeting();

        // Calling the new method and passing it two arguments
        addNumbers(7, 12);
    }
}
