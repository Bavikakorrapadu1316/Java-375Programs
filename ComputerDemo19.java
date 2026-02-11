package Encapsulation;
class Computer {
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

public class ComputerDemo19 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setBrand("Dell");
        comp.setModel("Inspiron");
        comp.setPrice(45000);
        System.out.println("Brand: " + comp.getBrand());
        System.out.println("Model: " + comp.getModel());
        System.out.println("Price: " + comp.getPrice());
    }
}