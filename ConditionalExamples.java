public class ConditionalExamples {

    public static void main(String[] args) {

        // ==================== IF STATEMENT ====================
        // Executes code block only if condition is true

        int age = 20;

        if (age >= 18) {
            // This code runs because age is 20, which is >= 18
            String message = "You are an adult";
        }


        // ==================== ELSE STATEMENT ====================
        // Provides an alternative when the if condition is false

        int temperature = 65;

        if (temperature > 75) {
            String weather = "It's warm outside";
        } else {
            // This code runs because temperature is not > 75
            String weather = "It's cool outside";
        }


        // ==================== IF-ELSE STATEMENT ====================
        // Checks multiple conditions in sequence

        int score = 85;

        if (score >= 90) {
            String grade = "A";
        } else if (score >= 80) {
            // This code runs because score is 85 (>= 80 but < 90)
            String grade = "B";
        } else if (score >= 70) {
            String grade = "C";
        } else if (score >= 60) {
            String grade = "D";
        } else {
            String grade = "F";
        }


        // ==================== NESTED IF STATEMENT ====================
        // An if statement inside another if statement

        boolean hasLicense = true;
        int driverAge = 25;

        if (hasLicense) {
            // First condition: check if person has a license

            if (driverAge >= 25) {
                // Second condition: check if driver is 25 or older
                // This code runs because both conditions are true
                String status = "Eligible for lower insurance rates";
            } else {
                String status = "Standard insurance rates apply";
            }
        } else {
            String status = "Cannot drive - no license";
        }


        // Another nested if example with multiple levels
        int hour = 14;
        boolean isWeekend = false;

        if (hour >= 9 && hour < 17) {
            // Check if it's during business hours

            if (isWeekend) {
                String officeStatus = "Office is closed on weekends";
            } else {
                // This code runs: hour is 14 (between 9-17) and it's not weekend
                String officeStatus = "Office is open";
            }
        } else {
            String officeStatus = "Office is closed - outside business hours";
        }


        // ==================== TERNARY OPERATOR (Shorthand If-Else) ====================
        // Format: condition ? valueIfTrue : valueIfFalse
        // Used for simple assignments based on a condition

        int number = 7;

        // Traditional if-else way:
        String result1;
        if (number % 2 == 0) {
            result1 = "even";
        } else {
            result1 = "odd";
        }

        // Ternary operator way (shorthand):
        // Since 7 % 2 != 0, result2 gets "odd"
        String result2 = (number % 2 == 0) ? "even" : "odd";


        // More ternary operator examples
        int balance = 150;
        // If balance >= 100, hasFunds is true, otherwise false
        boolean hasFunds = (balance >= 100) ? true : false;

        int quantity = 5;
        // If quantity > 10, price is 9.99, otherwise 12.99
        double price = (quantity > 10) ? 9.99 : 12.99;

        String status = "active";
        // If status equals "active", userState is "online", otherwise "offline"
        String userState = (status.equals("active")) ? "online" : "offline";

    }
}

