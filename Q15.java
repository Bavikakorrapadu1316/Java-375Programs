package Inheritance.java;
class Vehicle2 {
    String make;
    String model;
    int year;
}

class Truck extends Vehicle2 {
    int capacity;
    int mileage;
}

public class Q15 {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.make = "Tata";
        t.model = "Ultra";
        t.year = 2022;
        t.capacity = 1000;
        t.mileage = 8;

        System.out.println(t.make);
        System.out.println(t.model);
        System.out.println(t.year);
        System.out.println(t.capacity);
        System.out.println(t.mileage);
    }
}
