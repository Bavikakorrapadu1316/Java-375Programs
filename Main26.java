package Inheritance.java;
class Vehicl {
    String make;
    String model;
    
    Vehicl(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car8 extends Vehicl {
    String color;
    
    Car8(String make, String model, String color) {
        super(make, model);
        this.color = color;
    }
}

public class Main26 {
    public static void main(String[] args) {
        Vehicl v = new Vehicl("Ford", "Figo");
        System.out.println("Vehicle: " + v.make + " " + v.model);

        Car8 c = new Car8("BMW", "X5", "Black");
        System.out.println("Car: " + c.make + " " + c.model + ", Color: " + c.color);
    }
}
