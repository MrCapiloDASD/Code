public class MyClass {

    // Custom method lives HERE (outside main)
    static void myMethod() {
        System.out.println("Hello from myMethod!");
    }

    // Main method lives HERE
    public static void main(String[] args) {
        myMethod(); // <-- calling the custom method
    }
}
