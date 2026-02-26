public class MotorPartShop {

    public static void main(String[] args) {

        // Create Customer
        Customer customer1 = new Customer("Umais", "0712345678");
        customer1.getRole();

        // Create Products
        EnginePart engine1 = new EnginePart("V8 Engine", 50000, "Petrol");
        BodyPart door1 = new BodyPart("Car Door", 15000, "Steel");

        // Apply Discount
        engine1.applyDiscount(10);

        // Create Shop
        Shop shop = new Shop("Motor World");

        // Sell Products
        shop.sellProduct(engine1, customer1);
        shop.sellProduct(door1, customer1);

        // Demonstrate Method Overriding
        engine1.category();
        door1.category();
    }
}
 
