import java.util.Scanner;

public class driverEligibility {
    public static void main(String[] args) {
       //Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get age from user
        System.out.print ("Enter your age: ");
        int age = scanner.nextInt();

        //Get license status from user
        System.out.print ("Do you have a license (true/false): ");
        boolean hasLicense = scanner.nextBoolean();
        // Set the variables


        // Outer if statement checks age
        if (age >= 16) {
            // Inner if statement checks license
            if (hasLicense) {
                System.out.println("You can drive! You meet both the age and license requirements.");
            } else {
                System.out.println("You cannot drive. You need to obtain a driver's license first.");
            }
        } else {
            System.out.println("You cannot drive. You must be at least 16 years old.");
        }
        //Close Scanner
        scanner.close();
    }
}

