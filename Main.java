package Inheritance.java;
//Vehicle.java
class Vehicle7 {
 String make;
 String model;
 int year;

 Vehicle7(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 void showVehicleDetails() {
     System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
 }
}

//Car.java
class Car7 extends Vehicle7 {
 String color;
 double mileage;

 Car7(String make, String model, int year, String color, double mileage) {
     super(make, model, year);
     this.color = color;
     this.mileage = mileage;
 }

 void showCarDetails() {
     System.out.println("Car: " + make + " " + model + " (" + year + "), Color: " + color + ", Mileage: " + mileage);
 }
}

//Main.java
public class Main {
 public static void main(String[] args) {
     Vehicle7 v = new Vehicle7("Toyota", "Corolla", 2020);
     v.showVehicleDetails();

     Car7 c = new Car7("Honda", "Civic", 2022, "Red", 15000);
     c.showCarDetails();
 }
}
