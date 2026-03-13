import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter Motor Shop Name:");
            String shopName = scanner.nextLine();

            MotorPartSystem shop = new MotorPartSystem(shopName);

            System.out.println("Enter Customer Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Phone Number:");
            String phone = scanner.nextLine();

            System.out.println("Enter Motor Part to Buy:");
            String part = scanner.nextLine();

            Customer customer = new Customer(name, phone, part);

            System.out.println("Enter Payment Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 

            MpesaPayment payment = new MpesaPayment(amount, phone);

            System.out.println("\n------ RECEIPT ------");
            System.out.println("Welcome to " + shop.getShopName());

            customer.displayUserInfo();

            shop.sellMotorPart(part);
            shop.checkStock();

            payment.processPayment();

        } catch (Exception e) {

            System.out.println("Error: Invalid input entered.");
            System.out.println("Please restart the program.");

        } finally {

            System.out.println("\nThank you for using Motor Part Shop System.");
            scanner.close();
        }
    }
}