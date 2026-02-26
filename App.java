// ===== INTERFACE 1 =====
interface Discountable {
    double applyDiscount(double percentage);
}

// ===== INTERFACE 2 =====
interface Printable {
    void printDetails();
}

// ===== ABSTRACT CLASS 1 =====
abstract class Person {
    private String name;
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public abstract void getRole();
}

// ===== ABSTRACT CLASS 2 =====
abstract class Product implements Discountable, Printable {
    private String partName;
    private double price;

    public Product(String partName, double price) {
        this.partName = partName;
        this.price = price;
    }

    public String getPartName() {
        return partName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double applyDiscount(double percentage) {
        double discountAmount = price * percentage / 100;
        this.price = price - discountAmount;   // use of this
        return this.price;
    }

    public abstract void category();
}

// ===== CONCRETE CLASS 1 =====
class Customer extends Person {

    public Customer(String name, String phone) {
        super(name, phone);  // use of super
    }

    @Override
    public void getRole() {
        System.out.println("Role: Customer");
    }
}

// ===== CONCRETE CLASS 2 =====
class EnginePart extends Product {

    private String engineType;

    public EnginePart(String partName, double price, String engineType) {
        super(partName, price);
        this.engineType = engineType;
    }

    @Override
    public void category() {
        System.out.println("Category: Engine Part");
    }

    @Override
    public void printDetails() {
        System.out.println("Part: " + getPartName());
        System.out.println("Engine Type: " + engineType);
        System.out.println("Price: " + getPrice());
    }
}

// ===== CONCRETE CLASS 3 =====
class BodyPart extends Product {

    private String material;

    public BodyPart(String partName, double price, String material) {
        super(partName, price);
        this.material = material;
    }

    @Override
    public void category() {
        System.out.println("Category: Body Part");
    }

    @Override
    public void printDetails() {
        System.out.println("Part: " + getPartName());
        System.out.println("Material: " + material);
        System.out.println("Price: " + getPrice());
    }
}

// ===== CONCRETE CLASS 4 =====
class Shop {

    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void sellProduct(Product product, Customer customer) {
        System.out.println("\n--- Sale Receipt ---");
        System.out.println("Shop: " + shopName);
        System.out.println("Customer: " + customer.getName());
        product.printDetails();
        System.out.println("---------------------");
    }
}

