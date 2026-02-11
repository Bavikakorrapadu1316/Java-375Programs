package Encapsulation;
public class CarDemo6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("SUV");
        car.setColor("Black");
        car.setPrice(35000);
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
    }
}