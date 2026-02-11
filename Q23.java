package Inheritance.java;
import java.util.ArrayList;

//Base class
class Shape2 {
 String type;
 String color;

 Shape2(String type, String color) {
     this.type = type;
     this.color = color;
 }

 double area() {
     return 0;
 }

 double perimeter() {
     return 0;
 }

 @Override
 public String toString() {
     return String.format("%-10s | %-10s | %-7s | %-9s", type, color, "-", "-");
 }
}

//Rectangle class
class Rectangle2 extends Shape2 {
 int length;
 int width;

 Rectangle2(String color, int length, int width) {
     super("Rectangle", color);
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }

 @Override
 double perimeter() {
     return 2 * (length + width);
 }

 @Override
 public String toString() {
     return String.format("%-10s | %-10s | %-7.2f | %-9.2f", type, color, area(), perimeter());
 }
}

//Square class
class Square extends Shape {
 int side;

 Square(String color, int side) {
     super("Square", color);
     this.side = side;
 }

 @Override
 double area() {
     return side * side;
 }

 @Override
 double perimeter() {
     return 4 * side;
 }

 @Override
 public String toString() {
     return String.format("%-10s | %-10s | %-7.2f | %-9.2f", type, color, area(), perimeter());
 }
}

//Circle class
class Circle extends Shape {
 int radius;

 Circle(String color, int radius) {
     super("Circle", color);
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }

 @Override
 double perimeter() {
     return 2 * Math.PI * radius;
 }

 @Override
 public String toString() {
     return String.format("%-10s | %-10s | %-7.2f | %-9.2f", type, color, area(), perimeter());
 }
}

//Main class
public class ShapeDemo {
 public static void main(String[] args) {
     ArrayList<Shape> shapes = new ArrayList<>();

     // Adding shapes
     shapes.add(new Rectangle("Red", 5, 10));
     shapes.add(new Square("Blue", 6));
     shapes.add(new Circle("Green", 7));
     shapes.add(new Rectangle("Yellow", 8, 3));
     shapes.add(new Square("Purple", 4));
     shapes.add(new Circle("Orange", 5));

     // Print table header
     System.out.println("Type       | Color      | Area    | Perimeter");
     System.out.println("---------------------------------------------");

     // Print each shape in table format
     for (Shape s : shapes) {
         System.out.println(s);
     }
 }
}
