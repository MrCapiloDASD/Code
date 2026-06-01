import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(30) + 1;
        System.out.printf("Random number: %d%n", number);
    }
}
