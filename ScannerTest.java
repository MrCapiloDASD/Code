import java.util.Scanner;
public class ScannerTest {

        public static void main(String[] args) {

            // Create a Scanner object
            Scanner myScanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            // Read the integer input
            int userNumber = myScanner.nextInt();

            System.out.print("Enter a decimal number: ");
            // Read a double (decimal) input
            double userDecimal = myScanner.nextDouble();

            System.out.println("You entered: " + userNumber + " and " + userDecimal);
            myScanner.close();
        }
    }
