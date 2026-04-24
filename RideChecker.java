public class RideChecker {
    public static void main(String[] args) {

        // --- Visitor Information ---
        String name   = "Alex";
        int    age    = 14;
        double height = 62.5;  // height in inches
        boolean hasHeartCondition = false;


        double heightDiff = Math.abs(height - 65);
        double ageSquared = Math.pow(age, 2);
        double ageCheck = Math.sqrt(ageSquared);

        int score1 = 78;
        int score2 = 95;
        int bestScore = Math.max(score1, score2);
        int childWeight = 45;
        int adultWeight = 210;
        int minWeight = Math.min(childWeight, adultWeight);

        // ================================================
        // SECTION 2: Boolean ride eligibility checks
        // ================================================

        boolean canRideMegaCoaster = (height >= 60) && (age >= 12);
        boolean canRideKiddieCars = (age <= 10) || (height < 50);
        boolean canRideThunderbolt = (height >= 58) && (age >= 13) && !hasHeartCondition;

        // ================================================
        // SECTION 3: Print the results
        // ================================================

        System.out.println("=== Ride Report for " + name + " ===");
        System.out.println("Height difference from ideal: " + heightDiff);
        System.out.println("Age squared: "  + ageSquared);
        System.out.println("Age check (sqrt): " + ageCheck);
        System.out.println("Best score: "  + bestScore);
        System.out.println("Lighter weight: " + minWeight);
        System.out.println("");
        System.out.println("Mega Coaster:  " + canRideMegaCoaster);
        System.out.println("Kiddie Cars:   " + canRideKiddieCars);
        System.out.println("Thunderbolt:   " + canRideThunderbolt);
    }
}

