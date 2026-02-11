package Inheritance.java;
class Vehicle3{
    String make;
    String model;
    int year;
}

class Truck extends Vehicle3 {
    int capacity;
    int mileage;
}

public class Q16 {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.make = "Tata";
        t.capacity = 1000;

        System.out.println(t.make);
        System.out.println(t.capacity);
    }
}
