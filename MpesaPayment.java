public class MpesaPayment extends Payment {

    private String phoneNumber;

    public MpesaPayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing M-Pesa payment of KES " + amount);
        System.out.println("Payment made from phone number: " + phoneNumber);
    }
}