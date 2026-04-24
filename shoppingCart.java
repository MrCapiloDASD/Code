// STUDENT DEBUGGING ASSIGNMENT
// This program helps a store calculate the total cost of an order with tax
// All 8 bugs have been fixed!

public class shoppingCart {
    public static void main(String[] args) {
        // Product information
        String productName = "Wireless Mouse";
        double price = 24.99;
        int quantity = 3;
        boolean isMember = true;

        // Calculate subtotal
        double subtotal = price * quantity;

        // Apply member discount
        double discount = 0.0;
        if (isMember == true) {
            discount = subtotal * 0.10;
            subtotal = subtotal - discount;
        }

        // Calculate tax (8% tax rate)
        double taxRate = 0.08;
        double tax = subtotal * taxRate;

        // Calculate total
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
        String shippingMessage = "Free shipping: " + freeShipping;
        System.out.println(shippingMessage);
    }
}