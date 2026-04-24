public class countDownDemo {
    public static void main(String[] args) {
        // Countdown from 10 to 1
        System.out.println("Rocket Launch Countdown:");
        System.out.println("------------------------");

        int countdown = 10;

        while (countdown > 0) {
            System.out.println(countdown + "...");
            countdown--;
        }

        System.out.println("Liftoff! 🚀");
        System.out.println("\nFinal value of countdown: " + countdown);
    }
}
