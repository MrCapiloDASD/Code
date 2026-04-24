public class ForLoopArrayExample {
    public static void main(String[] args) {
        String []fruits = {"apple","banana", "cherry", "date", "elderberry"};
        for (int i = 0; i< fruits.length; i++)
            System.out.println("fruits #" + (i+1) + ":" + fruits [i]);
    }
}
