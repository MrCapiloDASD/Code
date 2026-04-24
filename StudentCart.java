public class StudentCart {
    public static void main(String[] args) {
        // Product information
        // ERROR 1: SYNTAX ERROR - Missing closing quote on String literal
        // FIX: Added closing quote after "Wireless Mouse"
        String productName = "Wireless Mouse";
        double price = 24.99;
        int quantity = 3;
        boolean isMember = true;

        // Calculate subtotal
        // ERROR 2: SYNTAX ERROR - Missing semicolon at end of statement
        // FIX: Added semicolon after quantity
        double subtotal = price * quantity;

        // Apply member discount
        double discount = 0.0;
        if (isMember == true)
            discount = subtotal * 0.10;
        subtotal = subtotal - discount;
        // ERROR 3: SYNTAX ERROR - Missing closing brace for if statement
        // FIX: Added closing brace after subtotal calculation

        // Calculate tax (8% tax rate)
        double taxRate = 0.08;
        double tax = subtotal * taxRate;

        // Calculate total
        // ERROR 4: TYPE ERROR - Using int instead of double causes precision loss
        // FIX: Changed 'int total' to 'double total' to preserve decimal values
        double total = subtotal + tax;

        // Display order summary
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: $" + price);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Tax: $" + tax);
        System.out.println("Total Cost: $" + total);

        // Check if free shipping applies
        boolean freeShipping = total >= 50;
        // ERROR 5: SYNTAX ERROR - Missing opening quote in String concatenation
        // FIX: Added opening quote before "Free shipping:
        String shippingMessage = "Free shipping: " + freeShipping;
        System.out.println(shippingMessage);
    }
}


