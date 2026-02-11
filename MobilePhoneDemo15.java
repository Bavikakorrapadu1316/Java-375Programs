package Encapsulation;
class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class MobilePhoneDemo15 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setBrand("Samsung");
        phone.setModel("S23");
        phone.setPrice(80000);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: " + phone.getPrice());
    }
}