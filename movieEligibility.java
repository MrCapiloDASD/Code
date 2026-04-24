public class movieEligibility  {
    public static void main(String[] args) {
        // Declare input variables
        int age = 11;
        boolean isStudent = true;
        boolean hasParent = true;

        // Print header
        System.out.println("=== Movie Theater Eligibility Checker ===");
        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);
        System.out.println("Parent with them: " + hasParent);
        System.out.println();

        // Use logical operators to determine eligibility

        // Can watch R-rated: Age 17+ OR (under 17 WITH parent)
        // Uses || (OR) operator
        boolean canWatchRRated = age >= 17 || hasParent;

        // Student discount: Must be student AND age between 13-22
        // Uses && (AND) operator
        boolean getsStudentDiscount = isStudent && age >= 13 && age <= 22;

        // Senior discount: Age 65 or older
        boolean getsSeniorDiscount = age >= 65;

        // No discount: NOT eligible for student discount AND NOT eligible for senior discount
        // Uses ! (NOT) operator
        boolean noDiscount = !getsStudentDiscount && !getsSeniorDiscount;

        // Print results
        System.out.println("Can watch R-rated movie: " + canWatchRRated);
        System.out.println("Qualifies for student discount: " + getsStudentDiscount);
        System.out.println("Qualifies for senior discount: " + getsSeniorDiscount);
        System.out.println("No discount available: " + noDiscount);
    }
}

