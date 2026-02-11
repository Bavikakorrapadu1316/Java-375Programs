package Encapsulation;
class Car {
    private String model;
    private String color;
    private double price;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class CarDemo5 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Sedan");
        car.setColor("Red");
        car.setPrice(25000);
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
    }
}