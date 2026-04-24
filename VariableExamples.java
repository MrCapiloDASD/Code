public class VariableExamples {
    public static void main (String[] args) {
    // Create a byte variable and set it to a valid byte number
    byte myByte = 10;

    // Create a short and set it to a valid short
    short myShort = 1000;

    // Create an int and set it to a valid int
    int myInt = 5000;

    // Create a long and make it equal to 50,000 + 10 times the sum of the byte, plus the short plus the int
    long myLong = 50000L + 10 * (myByte + myShort + myInt);

    // Print out the long value
    System.out.println("The long value is: " + myLong);
    }
}
