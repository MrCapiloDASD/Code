public class nestedDrivers {
    public static void main(String[] args) {

        int age = 12;
        boolean hasLicense = false;

        if (age >= 16) {
            if (hasLicense) {
                System.out.println("You can drive! You meet both the age and license requirements.");
            } else {
                System.out.println("You cannot drive. You need to obtain a driver's license first.");
            }
        } else {
            System.out.println("You cannot drive. You must be at least 16 years old.");
        }
    }
}