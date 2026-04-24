public class operatorsPractice  {
    public static void main(String[] args) {
        // Declare item prices
        double item1 = 25.99;
        double item2 = 15.50;
        double item3 = 8.75;

        // Calculate subtotal using addition operator
        double subtotal = item1 + item2 + item3;

        // Display item prices and subtotal
        System.out.println("Item 1: $" + item1);
        System.out.println("Item 2: $" + item2);
        System.out.println("Item 3: $" + item3);
        System.out.println("Subtotal: $" + subtotal);

        // Apply 15% discount using compound assignment operator
        // Method 1: Using *= to multiply by 0.85 (which is 100% - 15%)
        subtotal *= 0.85;
        System.out.println("After 15% discount: $" + String.format("%.2f", subtotal));

        // Calculate sales tax (8%)
        double salesTax = subtotal * 0.08;
        System.out.println("Sales tax (8%): $" + String.format("%.2f", salesTax));

        // Calculate final total using += compound assignment operator
        double finalTotal = subtotal;
        finalTotal += salesTax;

        // Display final total
        System.out.println("Final total: $" + String.format("%.2f", finalTotal));
    }
}
