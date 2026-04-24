public class NumberSorter {
    public static void main(String[] args) {
        // Define two whole numbers
        int firstNumber = 25;
        int secondNumber = 10;

        // Display the original numbers
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println();

        // Compare and display in ascending order
        if (firstNumber < secondNumber) {
            System.out.println("The numbers in order are: " + firstNumber + ", " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("The numbers in order are: " + secondNumber + ", " + firstNumber);
        } else {
            System.out.println("The numbers in order are: " + firstNumber + ", " + secondNumber);
            System.out.println("(Both numbers are equal)");
        }
    }
}