public class ScoreAnalyzer {
    public static void main(String[] args) {

        // Step 1 — Declare and initialize the array
        int[] scores = {78, 92, 85, 60, 74, 95, 88, 71, 83, 90};

        // Print array contents
        System.out.print("Scores: [");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Step 2 — Sum and Average using a traditional for loop
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("\nSum of scores: " + sum);
        System.out.printf("Average score: %.2f%n", average);

        // Step 3 — Highest and Lowest using a for-each loop
        int highest = scores[0];
        int lowest  = scores[0];

        for (int score : scores) {
            if (score > highest) highest = score;
            if (score < lowest)  lowest  = score;
        }

        System.out.println("\nHighest score: " + highest);
        System.out.println("Lowest score:  " + lowest);

        // Step 4 — Count passing scores (>= 70)
        int passingCount = 0;
        for (int score : scores) {
            if (score >= 70) passingCount++;
        }
        double passingPercent = (double) passingCount / scores.length * 100;

        System.out.println("\nStudents passing (>= 70): " + passingCount);
        System.out.printf("Passing percentage: %.1f%%%n", passingPercent);
    }
}

