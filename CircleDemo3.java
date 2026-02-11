package Inheritance.java;
class Shap {
    String type;
    String color;

    Shap(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void displayShape() {
        System.out.println("Shape: " + type + ", Color: " + color);
    }
}

class Circl extends Shap {
    double radius;
    double area;

    Circl(String type, String color, double radius) {
        super(type, color);
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class CircleDemo3 {
    public static void main(String[] args) {
        Circl circle = new Circl("Circle", "Red", 5.0);
        circle.displayShape();
        circle.calculateArea();
    }
}