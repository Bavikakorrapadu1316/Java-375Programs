package Encapsulation;
public class MobilePhoneDemo16 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setBrand("Apple");
        phone.setModel("iPhone 14");
        phone.setPrice(90000);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Price: " + phone.getPrice());
    }
}