public class MotorPartSystem implements MotorshopServices {

    private String shopName;

    public MotorPartSystem(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void sellMotorPart(String partName) {
        System.out.println("Motor part sold: " + partName);
    }

    @Override
    public void checkStock() {
        System.out.println("Stock checked: Motor parts available.");
    }
}