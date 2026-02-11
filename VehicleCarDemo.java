package Inheritance.java;
class Vehicle {
    String make;
    String model;
    int year;

    void displayVehicle() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String color;
    int mileage;

    void displayCar() {
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage);
    }
}

public class VehicleCarDemo {
    public static void main(String[] args) {
        Car c = new Car();

        c.make = "Toyota";
        c.model = "Innova";
        c.year = 2022;
        c.color = "White";
        c.mileage = 15;

        c.displayVehicle();
        c.displayCar();
    }
}
