public class AverageIntegers {
    public static void main(String[] args) {
        // Declare and initialize three double variables with the given values
        double num1 = 565.36;
        double num2 = 1350.54;
        double num3 = 984.70;

        // Use Math.round() to round each number to the nearest integer
        // Math.round() returns a long, so we cast it to int
        int rounded1 = (int) Math.round(num1);  // 565.36 rounds to 565
        int rounded2 = (int) Math.round(num2);  // 1350.54 rounds to 1351
        int rounded3 = (int) Math.round(num3);  // 984.70 rounds to 985

        // Display the rounded values
        System.out.println("Original values:");
        System.out.println("Number 1: " + num1 + " rounds to " + rounded1);
        System.out.println("Number 2: " + num2 + " rounds to " + rounded2);
        System.out.println("Number 3: " + num3 + " rounds to " + rounded3);
        System.out.println();

        // Calculate the average of the three rounded integers
        // Store in a fourth variable as an integer (truncates decimal portion)
        int average = (rounded1 + rounded2 + rounded3) / 3;

        // Display the average
        System.out.println("Average of rounded values: " + average);
        System.out.println();

        // Use Math.max() and Math.min() to find largest and smallest values
        // First find max of first two numbers, then compare with third
        int largest = Math.max(Math.max(rounded1, rounded2), rounded3);

        // Similarly for minimum value
        int smallest = Math.min(Math.min(rounded1, rounded2), rounded3);

        // Print the results with clear labels
        System.out.println("Largest integer is: " + largest);
        System.out.println("Smallest integer is: " + smallest);
    }
}
