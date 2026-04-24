public class minutesInAYear {public static void main(String[] args) {
    /*
     * Algorithm:
     * 1. Determine how many hours are in one day (24 hours)
     * 2. Determine how many days are in one year (365 days)
     * 3. Determine how many minutes are in one hour (60 minutes)
     * 4. Calculate minutes per day: hours per day * minutes per hour
     * 5. Calculate total minutes in year: minutes per day * days per year
     * 6. Display the result in the required format
     */

    // Declare and initialize variables for all calculations
    int hoursPerDay = 24;
    int daysPerYear = 365;
    int minutesPerHour = 60;

    // Calculate minutes in one day
    int minutesPerDay = hoursPerDay * minutesPerHour;

    // Calculate total minutes in a year
    int minutesInYear = minutesPerDay * daysPerYear;

    // Display the result
    System.out.println("How do you measure, measure a year?");
    System.out.println("It's got " + minutesInYear + " minutes.");
}
}

