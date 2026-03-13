public class Customer extends User {

    private String motorPart;

    public Customer(String name, String phoneNumber, String motorPart) {
        super(name, phoneNumber);
        this.motorPart = motorPart;
    }

    public String getMotorPart() {
        return motorPart;
    }

    public void setMotorPart(String motorPart) {
        this.motorPart = motorPart;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Customer Name: " + getName());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Motor Part Purchased: " + motorPart);
    }
}
